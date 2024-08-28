/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.eniq.stats.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.ericsson.eniq.stats.parser.topology.jaxb.Mo;
import com.ericsson.eniq.stats.user.input.jaxb.SimulationData;
import com.ericsson.eniq.stats.user.input.jaxb.SimulationData.Simulation;
import com.ericsson.eniq.stats.utility.Constant;
import com.ericsson.eniq.stats.utility.Utility;
import com.ericsson.eniq.stats.xmlautotopology.logic.topology3gpp.TopologyGeneratorUtilityThread;

public class TopologyGenerator implements Constant {
    static Logger log = Logger.getLogger(TopologyGenerator.class);
    static Map<String, Map<String, Mo>> modelMap;
    static Properties prop;
    static SimulationData simulationData;
    static {
        System.setProperty("log.timestamp", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()));
        PropertyConfigurator.configure(System.getProperty(LOG4J_CONFIGURATION));
        prop = Utility.loadpropertFile();
        simulationData = Utility.loadUserInputXml(prop);
        modelMap = Utility.loadSampleTopologyData(prop);
    }

    public static void main(final String[] ar) throws JAXBException, FileNotFoundException {
        boolean isEmulatorEnable = false;
        if (ar.length > 0) {
            if (ar[0].toUpperCase().equalsIgnoreCase(TRUE)) {
                isEmulatorEnable = true;
            }
        }

        final int noOfThread = Integer.parseInt(prop.getProperty(NOOFTHREAD).trim());

        final StringBuilder topologyFlsMetaData = new StringBuilder();
        final String outputLocation = prop.getProperty(OUTPUT_LOCATION);
        for (final Simulation simulation : simulationData.getSimulation()) {
            final String ossDir = simulation.getOssDir();
            final String network = simulation.getNetwork();
            final String nodeTypes = simulation.getNodeType();
            final String mimVersions = simulation.getSimMimVer();
            final String nodeReleases = simulation.getNodeRelease();
            final int noOfNode = Integer.parseInt(simulation.getNoOfNodes());
            final String[] nodePrefixArray = simulation.getNodePrefix().split(COLON);
            ExecutorService executorService = null;
            if (noOfNode > 100) {
                executorService = Executors.newFixedThreadPool(noOfThread);
            } else {
                executorService = Executors.newFixedThreadPool(noOfNode);
            }

            if (network.equalsIgnoreCase(LTE_NETWORK) || network.equalsIgnoreCase(WCDMA_NETWORK) || network.equalsIgnoreCase(CORE)) {
                final List<String> nodeList = Utility.constructNodeList(noOfNode, network, nodePrefixArray);
                log.info("****** Topology Generation Started For " + network + " Network ******");
                final String nodePrefix = nodePrefixArray[0];
                for (final String nodeOn : nodeList) {
                    final String nodeType = Utility.getNodeType(network, nodeTypes, nodeOn);
                    final String nodeRelease = Utility.prepareNodeRelease(network, nodeOn, nodeReleases);
                    final String sampleTopologyKey = Utility.prepareSampleTopologyKey(network, nodeType, nodeRelease);
                    final String mimVersion = Utility.getSimMimVersion(network, mimVersions, nodeOn);
                    final String parentFdn = Utility.prepareParentFdn(network, nodeType, nodeOn, nodePrefix, prop);
                    final Map<String, Mo> moAttributeMap = modelMap.get(sampleTopologyKey);
                    String referenceCounterLocation = prop.getProperty("REFERENCE_COUNTER_FILE_PATH");
                    if (isEmulatorEnable) {
                        final String nodeTypeTemp = nodeType.replaceAll(HYPHEN, UNDERSCORE);
                        referenceCounterLocation = referenceCounterLocation + File.separator + XML.toUpperCase() + File.separator + nodeTypeTemp;
                    }
                    File[] counterFileList = null;
                    File counterFileXml = null;
                    if (moAttributeMap != null) {
                        if (network.equalsIgnoreCase(LTE_NETWORK) || network.equalsIgnoreCase(WCDMA_NETWORK)) {
                            counterFileList = Utility.listFiles(referenceCounterLocation, nodeOn + STATS_FILE_EXTENSION);
                            if (counterFileList != null && counterFileList.length > 0) {
                                counterFileXml = counterFileList[0];
                            }
                        }
                        executorService.execute(new TopologyGeneratorUtilityThread(counterFileXml, moAttributeMap, nodeType, nodeOn, nodeRelease,
                                mimVersion, network, ossDir, topologyFlsMetaData, outputLocation, parentFdn));

                    } else {
                        log.warn("Sample Topology is not available for node :" + nodeOn + " , Topology File will not be generated for this node.");
                    }
                }
                executorService.shutdown();
                try {
                    while (!executorService.awaitTermination(24L, TimeUnit.HOURS)) {
                        log.info("Not yet. Still waiting for termination");
                    }
                } catch (final InterruptedException e) {
                    log.error(e + " : Service Thread Interrupted");
                } catch (final Exception e) {
                    log.error(e);
                }
                log.info("****** Topology Generation Finished For " + network + " Network ******");
            } else {
                log.warn("Topology Generation for " + network + " is not supported");
            }
        }
        Utility.writeTopologyMetadata(topologyFlsMetaData, prop.getProperty(META_DATA_PATH));
        log.info("Topology Generation for All Configured Networks completed." + NEWLINE + "Topology Files are generated at location  : "
                + outputLocation);
    }
}
