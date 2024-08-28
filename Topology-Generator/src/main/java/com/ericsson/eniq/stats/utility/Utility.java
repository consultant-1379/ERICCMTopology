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
package com.ericsson.eniq.stats.utility;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.stream.*;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;

import com.ericsson.eniq.stats.parser.topology.jaxb.Mo;
import com.ericsson.eniq.stats.parser.topology.jaxb.Model;
import com.ericsson.eniq.stats.user.input.jaxb.SimulationData;

public class Utility implements Constant {
    static Logger log = Logger.getLogger(Utility.class);

    /**
     * 
     * @param xmlConfigFile
     * @param configJAXBpkgName
     * @return Object representation of xml data
     */
    public static <T> T loadXmlToJavaObjects(final File xmlConfigFile, final String configJAXBpkgName) {

        final XMLInputFactory xif = XMLInputFactory.newInstance();
        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        XMLStreamReader xmlConfigFis;
        try {
            xmlConfigFis = xif.createXMLStreamReader(new StreamSource(xmlConfigFile));
        } catch (final XMLStreamException e) {
            throw new RuntimeException(String.format("Can't load XML file %s", xmlConfigFile.getName()), e);
        }
        XmlLoader xmlConfigLoader = null;

        xmlConfigLoader = new XmlLoader(configJAXBpkgName);

        return xmlConfigLoader.loadXml(xmlConfigFis);
    }

    /**
     * 
     * @param inputLocation
     * @param fileFilterPattern
     * @return List representation of Files
     */
    public static File[] listFiles(final String inputLocation, final String fileFilterPattern) {
        final File folder = new File(inputLocation);
        final FilenameFilter textFilter = new FilenameFilter() {
            @Override
            public boolean accept(final File dir, final String name) {

                return name.endsWith(fileFilterPattern);
            }
        };

        final File[] listOfFiles = folder.listFiles(textFilter);
        return listOfFiles;
    }

    /**
     * 
     * @param directoryName
     * @param files
     * @return List representation of files
     */
    public static List<File> listFiles(final String directoryName, final ArrayList<File> files) {
        final File directory = new File(directoryName);
        final File[] fList = directory.listFiles();
        for (final File file : fList) {
            if (file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()) {
                listFiles(file.getAbsolutePath(), files);
            }
        }
        return files;
    }

    /**
     * 
     * @param simulationName
     * @return String representation of simulation name from user_input.xml
     */
    public static String getSimulationName(final String simulationName) {
        final String simulation = simulationName.substring(simulationName.lastIndexOf("-") + 1);
        return simulation;

    }

    /**
     * 
     * @param parentDir
     * @param network
     * @param nodeType
     * @param nodeOn
     * @return String representation of Topology directory exp : /ossrc/data/pmMediation/pmData/lte/topologyData/ERBS
     */
    public static String prepareDirectory(final String parentDir, final String network, final String nodeType, final String nodeOn) {
        String outputDir = "";
        if (network.equalsIgnoreCase(LTE_NETWORK)) {
            outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + ERBS;
        } else if (network.equalsIgnoreCase(WCDMA_NETWORK)) {
            if (nodeType.equalsIgnoreCase(RNC)) {
                outputDir = parentDir + File.separator + UTRAN + File.separator + TOPOLOGYDATA + File.separator + RNC;
            } else if (nodeType.equalsIgnoreCase(RXI)) {
                outputDir = parentDir + File.separator + UTRAN + File.separator + TOPOLOGYDATA + File.separator + RXI;
            } else {
                outputDir = parentDir + File.separator + UTRAN + File.separator + TOPOLOGYDATA + File.separator + RBS;
            }

        } else if (network.equalsIgnoreCase(CORE)) {
            if (nodeType.equalsIgnoreCase(MGW) || nodeType.equalsIgnoreCase(MRSV)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CELLO;
            } else if (nodeType.equalsIgnoreCase(EPG_EVR) || nodeType.equalsIgnoreCase(EPG_SSR) || nodeType.equalsIgnoreCase(SGSN)
                    || nodeType.equalsIgnoreCase(ESAPC) || nodeType.equalsIgnoreCase(HSS_FE) || nodeType.equalsIgnoreCase(IPWORKS)
                    || nodeType.equalsIgnoreCase(CSCF) || nodeType.equalsIgnoreCase(SBG) || nodeType.equalsIgnoreCase(MTAS)
                    || nodeType.equalsIgnoreCase(MRFV) || nodeType.equalsIgnoreCase(ESASN)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK;
            } else if (nodeType.equalsIgnoreCase(WMG)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK
                        + File.separator + WMG;
            } else if (nodeType.equalsIgnoreCase(UPG)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK
                        + File.separator + UPG.toLowerCase();
            } else if (nodeType.equalsIgnoreCase(WCG)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK
                        + File.separator + WCG;
            } else if (nodeType.equalsIgnoreCase(DSC)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK
                        + File.separator + DSC.toLowerCase();
            } else if (nodeType.equalsIgnoreCase(EME)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK
                        + File.separator + VEME;
            } else if (nodeType.equalsIgnoreCase(BBSC)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK
                        + File.separator + BBSC.toLowerCase();
            } else if (nodeType.equalsIgnoreCase(SDNCP)) {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK
                        + File.separator + SDNCP.replace(HYPHEN, "").toLowerCase();
            } else {
                outputDir = parentDir + File.separator + network.toLowerCase() + File.separator + TOPOLOGYDATA + File.separator + CORE_NETWORK;
            }
        }

        final File f = new File(outputDir);
        if (!f.exists()) {
            f.mkdirs();
        }

        return f.getAbsolutePath();
    }

    public static Properties loadpropertFile() {
        log.info("Loading Properties Files....");
        final Properties prop = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File(System.getProperty("propertyFile")));
            try {
                prop.load(fis);
                fis.close();
            } catch (final IOException e) {
                log.error(e);
            }

        } catch (final FileNotFoundException e) {
            log.error(e);
        }
        log.info("Loading Properties File finished..");
        return prop;

    }

    /**
     * 
     * @param prop
     *            properties file value
     * @return a map with key Network_NodeType_Release and value as a map of pm group and mo instance
     */
    public static Map<String, Map<String, Mo>> loadSampleTopologyData(final Properties prop) {
        final Map<String, Map<String, Mo>> sampleTopologyMap = new HashMap<String, Map<String, Mo>>();
        final List<File> listOfFiles = Utility.listFiles(prop.getProperty(SAMPLE_TOPOLOGY_PATH), new ArrayList<File>());

        log.info("Loading Sample Topology File Started..");
        for (final File file : listOfFiles) {
            final String fileName = file.getName().substring(0, file.getName().lastIndexOf(DOT));
            if (sampleTopologyMap.get(fileName) == null) {
                final Model model = LoadOutputXMLService.loadXmlToJavaObjects(file, Constant.TPOLOGY_JAXB_PACKAGE);
                if (model != null) {
                    final Map<String, Mo> moAttributeMap = Utility.moAttributeMapping(model);
                    sampleTopologyMap.put(fileName, moAttributeMap);
                }

            }

        }

        log.info("Loading Sample Topology File Finished..");
        return sampleTopologyMap;

    }

    /**
     * 
     * @param prop
     * @return SimulationData Object representation of user_input.xml
     */
    public static SimulationData loadUserInputXml(final Properties prop) {
        log.info("Loading User Input Xml Started..");
        final SimulationData simulationData = LoadOutputXMLService.loadXmlToJavaObjects(new File(prop.getProperty(USER_INPUT_PATH)),
                Constant.USER_INPUT_XML_JAXB_PACKAGE);
        log.info("Loading User Input Xml Finished..");
        return simulationData;

    }

    /**
     * 
     * @param cellRelationPath
     * @return Map representation of Cell Realion loaded from cell_relation file
     */
    public static Map<String, List<String>> loadCellRealtion(final String cellRelationPath) {
        final File file = new File(cellRelationPath);
        final Map<String, List<String>> simulationCellRelationMap = new HashMap<String, List<String>>();
        List<String> cellRealtionList = null;

        try {
            final FileReader fileReader = new FileReader(file);
            final BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                final String key = line.substring(0, line.indexOf(EQUAL));
                if (simulationCellRelationMap.get(key) == null) {
                    cellRealtionList = new ArrayList<String>();
                    cellRealtionList.add(line.substring(line.indexOf(EQUAL) + 1));
                    simulationCellRelationMap.put(key, cellRealtionList);

                } else {
                    simulationCellRelationMap.get(key).add(line.substring(line.indexOf(EQUAL) + 1));
                }

            }
            bufferedReader.close();
            fileReader.close();
            log.info("Loading of CellRelation finished");
        } catch (final FileNotFoundException e) {
            log.error("Cell-Relation file is not found...No cell Relation Will be Generated.");
            return simulationCellRelationMap;
        } catch (final IOException e) {
            log.error("Cell-Relation file is not found...No cell Reltion Will be Generated.");
            return simulationCellRelationMap;
        }
        return simulationCellRelationMap;
    }

    /**
     * 
     * @param nodeCellRelationList
     * @return Map representation of cell relation exp: EUTranCellFDD has four relation with
     *         UtranCellRealtion,GeranCellRelation,EutranCellRelation,Cdma20001xRttCellRelation
     */
    public static Map<String, List<String>> nodeCellRealtionMap(final List<String> nodeCellRelationList) {
        final Map<String, List<String>> nodeCellRelationMap = new HashMap<String, List<String>>();
        List<String> cellRelationList = null;
        if (nodeCellRelationList != null) {
            for (final String nodeCellRelation : nodeCellRelationList) {
                final String cellNodes = nodeCellRelation.substring(0, nodeCellRelation.indexOf(EQUAL));
                final String relations = nodeCellRelation.substring(nodeCellRelation.indexOf(EQUAL) + 1, nodeCellRelation.length());
                if (nodeCellRelationMap.get(cellNodes) == null) {
                    cellRelationList = new ArrayList<String>();
                    cellRelationList.add(relations);
                    nodeCellRelationMap.put(cellNodes, cellRelationList);

                } else {
                    nodeCellRelationMap.get(cellNodes).add(relations);
                }
            }
        }
        return nodeCellRelationMap;

    }

    /**
     * 
     * @param network
     * @param nodeType
     * @param nodeOn
     * @param nodePrefix
     * @param prop
     * @return String representation of ParentFdn exp: SubNetwork=ONRM_ROOT_MO,SubNetwork=RNC05,MeContext=RNC05
     */

    public static String prepareParentFdn(final String network, final String nodeType, final String nodeOn, final String nodePrefix,
                                          final Properties prop) {
        String parentFdn = null;
        if (network.equalsIgnoreCase(LTE_NETWORK)) {
            parentFdn = prop.getProperty(network + UNDERSCORE + nodeType) + nodeOn;

        } else if (network.equalsIgnoreCase(WCDMA_NETWORK)) {
            if (!nodeOn.contains(RBS) && !nodeOn.contains(PRBS) && !nodeOn.contains(MSRBS_V2)) {
                parentFdn = prop.getProperty(network + UNDERSCORE + nodeType);
                parentFdn = parentFdn.replace(RNC_NODE_NAME, nodePrefix);
            } else {
                if (nodeOn.contains(PRBS) || nodeOn.contains(MSRBS_V2)) {
                    parentFdn = prop.getProperty(network + UNDERSCORE + nodeType);
                    parentFdn = parentFdn + nodeOn;
                } else {
                    parentFdn = prop.getProperty(network + UNDERSCORE + nodeType);
                    parentFdn = parentFdn.replace(RNC_NODE_NAME, nodePrefix);
                    parentFdn = parentFdn.replace(RBS_NODE_NAME, nodeOn);
                }
            }
        } else if (network.equalsIgnoreCase(CORE)) {
            parentFdn = prop.getProperty(network + UNDERSCORE + nodeType) + nodeOn;
            if (nodeType.equalsIgnoreCase(MGW)) {
                parentFdn = parentFdn + COMMA + MANAGEDELEMENT + EQUAL + "1";
            }
        }
        return parentFdn;
    }

    /**
     * 
     * @param network
     * @param nodeType
     * @param nodeRelease
     * @return String exp: LTE_ERBS_W17B
     */
    public static String prepareSampleTopologyKey(final String network, final String nodeType, final String nodeRelease) {
        String sampleTopologyKey = null;
        if (network.equalsIgnoreCase(LTE_NETWORK)) {
            sampleTopologyKey = network + UNDERSCORE + nodeType + UNDERSCORE + nodeRelease;

        } else if (network.equalsIgnoreCase(WCDMA_NETWORK)) {
            sampleTopologyKey = network + UNDERSCORE + nodeType + UNDERSCORE + nodeRelease;

        } else if (network.equalsIgnoreCase(CORE)) {
            sampleTopologyKey = network + UNDERSCORE + nodeType;
        }
        return sampleTopologyKey;

    }

    /**
     * 
     * @param network
     * @param nodeOn
     * @param nodesRelease
     * @return String exp: W17B
     */
    public static String prepareNodeRelease(final String network, final String nodeOn, final String nodesRelease) {
        final String[] nodeReleaseSplit = nodesRelease.split(COLON);
        String nodeRelease = null;
        if (network.equalsIgnoreCase(LTE_NETWORK) || network.equalsIgnoreCase(CORE)) {
            nodeRelease = nodeReleaseSplit[0];

        } else if (network.equalsIgnoreCase(WCDMA_NETWORK)) {
            if (!nodeOn.contains(RBS) && !nodeOn.contains(PRBS) && !nodeOn.contains(MSRBS_V2)) {

                nodeRelease = nodeReleaseSplit[0];
            } else {

                nodeRelease = nodeReleaseSplit[1];

            }
        }
        return nodeRelease;

    }

    /**
     * 
     * @param network
     * @param nodeTypes
     * @param nodeOn
     * @return String get node type from user_input.xml exp: ERBS
     */
    public static String getNodeType(final String network, final String nodeTypes, final String nodeOn) {
        final String[] nodeTypeSplit = nodeTypes.split(COLON);
        String nodeType = null;
        if (network.equalsIgnoreCase(LTE_NETWORK) || network.equalsIgnoreCase(CORE)) {
            nodeType = nodeTypeSplit[0];

        } else if (network.equalsIgnoreCase(WCDMA_NETWORK)) {
            if (!nodeOn.contains(RBS) && !nodeOn.contains(PRBS) && !nodeOn.contains(MSRBS_V2)) {

                nodeType = nodeTypeSplit[0];
            } else {

                nodeType = nodeTypeSplit[1];

            }
        }
        return nodeType;

    }

    /**
     * 
     * @param network
     * @param mimVersions
     * @param nodeOn
     * @return String get mim version from user_input.xml exp: 18A-LTE-WCDMA-V2
     */
    public static String getSimMimVersion(final String network, final String mimVersions, final String nodeOn) {
        String mimVersion = null;
        final String[] mimVersionSplit = mimVersions.split(COLON);
        if (network.equalsIgnoreCase(LTE_NETWORK) || network.equalsIgnoreCase(CORE)) {
            mimVersion = getMimVersion(mimVersionSplit[0]);

        } else if (network.equalsIgnoreCase(WCDMA_NETWORK)) {
            if (!nodeOn.contains(RBS) && !nodeOn.contains(PRBS) && !nodeOn.contains(MSRBS_V2)) {

                mimVersion = getMimVersion(mimVersionSplit[0]);
            } else {

                mimVersion = getMimVersion(mimVersionSplit[1]);

            }
        }
        return mimVersion;
    }

    private static String getMimVersion(final String mimVersion) {
        String tempMimVersion = null;
        if (mimVersion.contains("lim")) {
            if (mimVersion.contains("-lim")) {
                tempMimVersion = mimVersion.substring(0, mimVersion.indexOf("-lim"));
            } else {
                tempMimVersion = mimVersion.substring(0, mimVersion.indexOf("lim"));
            }

        } else {
            tempMimVersion = mimVersion;
        }

        return tempMimVersion;

    }

    /**
     * 
     * @param date
     * @return String represenation of date
     */
    public static String dateToString(final Date date) {
        String strDate = null;
        final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        strDate = dateFormat.format(date);
        return strDate;

    }

    /**
     * 
     * @param metaData
     * @param network
     *            exp : LTE
     * @param nodeOn
     *            exp : LTE01ERBS00001
     * @param nodeType
     *            exp : ERBS
     * @param file
     */
    public static void prepareTopologyMetaData(final StringBuilder metaData, final String network, final String nodeOn, final String nodeType,
                                               final File file) {
        final String fileSize = file.length() + "";
        final String fileLocation = file.getAbsolutePath();
        final String lastModified = conevrtMilisecondsToDate(file.lastModified());
        final String flsMetadata = nodeOn + PIPE + nodeType + PIPE + TOPOLOGY + "_" + network + PIPE + XML + PIPE + fileSize + PIPE + fileLocation
                + PIPE + lastModified + PIPE + lastModified + PIPE + lastModified + "\n";
        metaData.append(flsMetadata);

    }

    /**
     * 
     * @param topologyFlsMetaData
     * @param metaDataPath
     */
    public static void writeTopologyMetadata(final StringBuilder topologyFlsMetaData, final String metaDataPath) {

        final Date date = new Date();
        final long timeInMiliSec = date.getTime();
        final String fileName = TOPOLOGY_METADATA_FILE_NAME + UNDERSCORE + timeInMiliSec + CSV;

        FileWriter fileWriter;
        try {
            makeDirectory(metaDataPath);
            log.info("Writing of Topology Metadata Started");
            fileWriter = new FileWriter(new File(metaDataPath, fileName));
            fileWriter.write(topologyFlsMetaData.toString());
            fileWriter.close();
            log.info("Writing of Topology Metadata finished at location : " + metaDataPath + " wtih file name :" + fileName);

        } catch (final IOException e) {
            log.error(e);
        }

    }

    /**
     * 
     * @param miliseconds
     * @return String represenation of miliseconds
     */
    public static String conevrtMilisecondsToDate(final long miliseconds) {
        String fileCreationDate;
        final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        final DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(miliseconds);
        fileCreationDate = dateFormat.format(calendar.getTime()) + "T" + timeformat.format(calendar.getTime()) + "+00:00";
        return fileCreationDate;

    }

    public static void makeDirectory(final String path) {
        final File file = new File(path);
        if (!file.exists()) {
            if (file.mkdirs()) {
                log.info(path + " Directory is created for Topology Metadata !");
            } else {
                log.error("Failed to create directory! " + path);
            }
        }
    }

    public static String getFileName(final String dir, final String fileName) {
        final File file = new File(dir);
        final FilenameFilter fnf = new FilenameFilter() {
            @Override
            public boolean accept(final File dir, final String name) {
                return name.contains(fileName);
            }
        };
        final File[] names = file.listFiles(fnf);
        if (names.length > 0) {
            return names[0].getName();
        }
        return null;

    }

    /**
     * 
     * @param prop
     * @return Map represenation of loaded sample topology. key is sample topology name and value is topology data
     */
    public static Map<String, Model> loadSampleTopologyDataMap(final Properties prop) {
        final Map<String, Model> sampleTopologyMap = new HashMap<String, Model>();
        final List<File> listOfFiles = Utility.listFiles(prop.getProperty(SAMPLE_TOPOLOGY_PATH), new ArrayList<File>());

        log.info("Loading Sample Topology File Started..");
        for (final File file : listOfFiles) {
            final String fileName = file.getName().substring(0, file.getName().lastIndexOf(DOT));
            if (sampleTopologyMap.get(fileName) == null) {
                final Model model = LoadOutputXMLService.loadXmlToJavaObjects(file, Constant.TPOLOGY_JAXB_PACKAGE);
                sampleTopologyMap.put(fileName, model);
            }

        }

        log.info("Loading Sample Topology File Finished..");
        return sampleTopologyMap;

    }

    /**
     * 
     * @param model
     *            pass sample topology data
     * @return Map representation of pm group and mo instance
     */
    public static Map<String, Mo> moAttributeMapping(final Model model) {
        final Map<String, Mo> moAttributeMap = new LinkedHashMap<String, Mo>();
        for (final Mo mo : model.getMo()) {
            moAttributeMap.put(lastFdn(mo.getFdn()), mo);

        }
        return moAttributeMap;

    }

    /**
     * 
     * @param mo
     *            pass mo as a parameter
     * @return String representation of pm group
     */
    public static String lastFdn(final String mo) {
        String lastFdn = "";
        try {
            lastFdn = mo.substring(mo.lastIndexOf(COMMA) + 1, mo.lastIndexOf(EQUAL));
        } catch (final Exception e) {
            log.error("Following Mo is incorrect in PM file : " + mo + NEWLINE + "This MO will not be present in Generated Topology.");
        }
        return lastFdn;
    }

    /**
     * 
     * @param noOfNode
     * @param network
     * @param nodePrefixArray
     * @return List representation of node name
     */
    public static List<String> constructNodeList(final int noOfNode, final String network, final String[] nodePrefixArray) {
        final List<String> nodeList = new ArrayList<String>();
        if (network.equalsIgnoreCase(LTE_NETWORK) || network.equalsIgnoreCase(CORE)) {
            final String nodePrefix = nodePrefixArray[0];
            for (int i = 1; i <= noOfNode; i++) {
                String nodeName = "";
                if (i < 10) {
                    nodeName = nodePrefix + "0000" + i;
                } else if (i >= 10 && i < 100) {
                    nodeName = nodePrefix + "000" + i;
                } else if (i >= 100 && i < 1000) {
                    nodeName = nodePrefix + "00" + i;
                } else if (i >= 1000 && i < 10000) {
                    nodeName = nodePrefix + "0" + i;
                } else {
                    nodeName = nodePrefix + i;
                }
                nodeList.add(nodeName);
            }

        } else if (network.equalsIgnoreCase(WCDMA_NETWORK)) {
            final String rncNodePrefix = nodePrefixArray[0];
            nodeList.add(rncNodePrefix);
            final String nodePrefix = nodePrefixArray[1];
            String nodeName = "";
            for (int i = 1; i <= noOfNode; i++) {
                if (i < 10) {
                    nodeName = nodePrefix + "0" + i;
                } else {
                    nodeName = nodePrefix + i;
                }
                nodeList.add(nodeName);
            }
        }
        return nodeList;
    }
}
