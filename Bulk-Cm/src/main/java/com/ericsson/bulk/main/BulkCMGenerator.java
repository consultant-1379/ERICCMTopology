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
package com.ericsson.bulk.main;

import java.io.File;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.ericsson.bulk.generators.cmdata.BulkCmGeneratorForAll;
import com.ericsson.bulk.user.input.jaxb.SimulationData;
import com.ericsson.bulk.user.input.jaxb.SimulationData.Simulation;
import com.ericsson.bulk.utilities.BulkCmProperties;
import com.ericsson.bulk.utilities.Utility;

public class BulkCMGenerator {
    static Logger log = Logger.getLogger(BulkCMGenerator.class);
    static SimulationData simulationData;
    static {
        System.setProperty("log.timestamp", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()));
        PropertyConfigurator.configure(System.getProperty("log4j.configuration"));
        simulationData = Utility.loadUserInputXml(BulkCmProperties.prop);
    }

    public static void main(final String[] ar) {
        int totalNoOfNode = 0;
        final DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        final Date startDate = new Date();
        log.info("Bulk-CM Tool Started at : " + dateFormat.format(startDate));
        final String bulkcmFileName = Utility.getFileTag(new SimpleDateFormat(BulkCmProperties.CM_FILE_DATE_FORMAT).format(new Date()));
        final String bulkCmFilePath = BulkCmProperties.BULK_CM_OUTPUT_PATH;
        Utility.makeDirectory(bulkCmFilePath);
        PrintWriter localPrintWriter = null;
        localPrintWriter = Utility.prepareBulkCmHeader(bulkCmFilePath + bulkcmFileName);
        final List<Simulation> simulationList = simulationData.getSimulation();
        for (final Simulation simulation : simulationList) {
            totalNoOfNode = totalNoOfNode + Integer.parseInt(simulation.getNoOfNodes());
            boolean wcdmaRnc = true;
            if (simulation.getEnableBulkCmData().equalsIgnoreCase(BulkCmProperties.YES)) {
                String fileName = null;
                final List<String> simMimList = Arrays.asList(simulation.getSimMimVer().split(BulkCmProperties.COLON));
                for (final String tempMim : simMimList) {
                    final String mimVer = Utility.getMimVersion(tempMim);
                    fileName = Utility.getFileName(BulkCmProperties.MIM_FILES_PATH, mimVer + BulkCmProperties.XML_FILE_EXTENSION);

                    if (fileName != null) {
                        fileName = BulkCmProperties.MIM_FILES_PATH + File.separator + fileName;
                        new BulkCmGeneratorForAll(simulation, fileName, wcdmaRnc, localPrintWriter);
                        if (simulation.getNetwork().equalsIgnoreCase(BulkCmProperties.WCDMA)) {
                            wcdmaRnc = false;
                        }
                    }

                }

            }

        }
        Utility.prepareBulkCmFooter(localPrintWriter, bulkCmFilePath + bulkcmFileName);
        log.info("Bulk CM Generated on : " + bulkCmFilePath);
        final Date endDate = new Date();
        log.info("Bulk-CM Tool Stopped at : " + dateFormat.format(endDate));

    }

}
