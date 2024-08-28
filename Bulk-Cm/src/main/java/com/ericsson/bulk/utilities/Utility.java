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
package com.ericsson.bulk.utilities;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.ericsson.bulk.user.input.jaxb.SimulationData;

public class Utility {
    static Logger log = Logger.getLogger(Utility.class);

    public static Properties loadPropertyFile() {
        log.info("Loading Of Properties file for Bulk-CM is started.");
        final Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(new File(System.getProperty("propertyFile"))));
        } catch (final Exception e) {
            log.error("Bulk-CM Properties File Not Found. Exit From the process." + e);
            System.exit(0);
        }
        log.info("Loading Of Properties file for Bulk-CM is Finished.");
        return prop;

    }

    public static Date convertStringTimeInDate(final String paramString) {
        Date localDate = null;
        final String str = paramString.replaceAll(":", "-");
        SimpleDateFormat localSimpleDateFormat = null;
        try {
            localSimpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm");
            localDate = localSimpleDateFormat.parse(str);
        } catch (final ParseException localParseException) {
            log.error(localParseException);
        }
        return localDate;
    }

    public static SimulationData loadUserInputXml(final Properties prop) {
        log.info("Loading Of User Input Xml Started.");
        final SimulationData simulationData = LoadUserInputXMLService.loadXmlToJavaObjects(new File(prop.getProperty("USER_INPUT_XML_PATH")),
                BulkCmProperties.USER_INPUT_XML_JAXB_PACKAGE);
        log.info("Loading User Input Xml Finished.");
        return simulationData;

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

    public static void makeDirectory(final String path) {
        final File file = new File(path);
        if (!file.exists()) {
            if (file.mkdirs()) {
                log.info(path + " directory is created. Bulk-CM file will be generate in this directory.");
            } else {
                log.error("Failed to create directory!");
            }
        }

    }

    public static String getFileTag(final String paramString) {
        final StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("AOM").append(BulkCmProperties.AOM_NUMBER).append(BulkCmProperties.UNDRSCORE).append(BulkCmProperties.CU_NUMBER)
                .append(BulkCmProperties.UNDRSCORE).append(BulkCmProperties.ENIQ_VERSION).append(BulkCmProperties.UNDRSCORE).append(paramString)
                .append("+").append("0000").append("_bcg_ALL").append(BulkCmProperties.XML_FILE_EXTENSION);

        return localStringBuilder.toString();
    }

    public static PrintWriter prepareBulkCmHeader(final String path) {
        log.info("Generation of Bulk CM is started....");

        PrintWriter localPrintWriter = null;
        try {
            localPrintWriter = new PrintWriter(path);
        } catch (final FileNotFoundException e) {
            log.error(e);
        }
        localPrintWriter.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        localPrintWriter.append("<bulkCmConfigDataFile xmlns:es=\"" + BulkCmProperties.DATA_FORMAT_VERSION
                + ".xsd\" xmlns:un=\"utranNrm.xsd\" xmlns:xn=\"genericNrm.xsd\" " + "xmlns:gn=\"geranNrm.xsd\" xmlns=\"configData.xsd\">\n");

        localPrintWriter.append("<fileHeader fileFormatVersion=\"" + BulkCmProperties.FILE_FORMAT_VERSION + "\" vendorName=\"Ericsson\"/>\n");
        return localPrintWriter;
    }

    public static void prepareBulkCmFooter(final PrintWriter localPrintWriter, String path) {
        final PrintWriter localPrintWriter1 = localPrintWriter;
        localPrintWriter1.append("<fileFooter dateTime=\"" + new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'").format(new Date()) + "\"/>\n");
        localPrintWriter1.append("</bulkCmConfigDataFile>");
        localPrintWriter1.flush();
        localPrintWriter1.close();
        ZipUtility.zipUtility(path);
        path = path + ".gz";
        log.info("Generation of Bulk CM is finished...");

    }

    public static Date getCurrentDate() {
        final Date date = new Date();
        return date;
    }

    public static String getMimVersion(final String tempMim) {
        String mimVer = null;
        if (tempMim.contains("lim")) {
            if (tempMim.contains("-lim")) {
                mimVer = tempMim.substring(0, tempMim.indexOf("-lim"));
            } else {
                mimVer = tempMim.substring(0, tempMim.indexOf("lim"));
            }

        } else {
            mimVer = tempMim;
        }
        return mimVer;

    }

    public static int getNoOfCells(int nodeIndex, String [] nodePerCell){
    	int noOfCells = 0;
    	if(nodeIndex <= Integer.parseInt(nodePerCell[0])){
    		noOfCells = 1;
    	}
    	else if(nodeIndex <= (Integer.parseInt(nodePerCell[0]) + Integer.parseInt(nodePerCell[1]))){
     		noOfCells = 3;
     	}
     	else if(nodeIndex <= (Integer.parseInt(nodePerCell[0]) + Integer.parseInt(nodePerCell[1]) + Integer.parseInt(nodePerCell[2]))){
     		noOfCells = 6;
     	}
     	else if(nodeIndex <= (Integer.parseInt(nodePerCell[0]) + Integer.parseInt(nodePerCell[1]) + Integer.parseInt(nodePerCell[2] + Integer.parseInt(nodePerCell[3])) + Integer.parseInt(nodePerCell[3]))){
     		noOfCells = 12;
     	}
    	return noOfCells;
    }

}
