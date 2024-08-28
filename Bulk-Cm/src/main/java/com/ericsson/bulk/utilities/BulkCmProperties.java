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

import java.util.Properties;

import org.apache.log4j.Logger;

public class BulkCmProperties {
    static Logger log = Logger.getLogger(BulkCmProperties.class);
    public static String FILE_FORMAT_VERSION;
    public static String SW_VERSION;
    public static String MIM_VERSION;
    public static String MIRROR_MIM_VERSION;
    public static String DATA_FORMAT_VERSION;
    public static String USER_INPUT_XML_JAXB_PACKAGE;
    public static String MIM_FILES_PATH;
    public static String BULK_CM_OUTPUT_PATH;
    public static String AOM_NUMBER;
    public static String CU_NUMBER;
    public static String ENIQ_VERSION;
    public static String CM_FILE_DATE_FORMAT = "yyyyMMddHHmm";
    public static String XML_FILE_EXTENSION = ".xml";
    public static String COMMA = ",";
    public static String SEMICOLON = ";";
    public static String COLON = ":";
    public static String UNDRSCORE = "_";
    public static String LTE = "LTE";
    public static String WCDMA = "WCDMA";
    public static String YES = "YES";
    public static String MECONTEXT = "MeContext";
    public static String EUTRANCELLFDD = "EUtranCellFDD";
    public static String LRATEUTRANCELLFDD = "Lrat:EUtranCellFDD";
    public static String NBIOTCELL = "NbIotCell";
    public static String LRATNBIOTCELL = "Lrat:NbIotCell";
    public static Properties prop;
    public static String PRBSENodeBFunctionEUtranCellFDD ="MSRBS_V1_eNodeBFunction:EUtranCellFDD";

    static {
        USER_INPUT_XML_JAXB_PACKAGE = "com.ericsson.bulk.user.input.jaxb";
        prop = Utility.loadPropertyFile();
        AOM_NUMBER = prop.getProperty("AOM_NUMBER");
        CU_NUMBER = prop.getProperty("CU_NUMBER");
        ENIQ_VERSION = prop.getProperty("ENIQ_VERSION");
        BULK_CM_OUTPUT_PATH = prop.getProperty("OUTPUT_PATH");
        MIM_FILES_PATH = prop.getProperty("MIM_FILE_PATH");
        FILE_FORMAT_VERSION = prop.getProperty("FILE_FORMAT_VERSION");
        SW_VERSION = prop.getProperty("SW_VERSION");
        MIM_VERSION = prop.getProperty("MIM_VERSION");
        MIRROR_MIM_VERSION = prop.getProperty("MIRROR_MIM_VERSION");
        DATA_FORMAT_VERSION = prop.getProperty("DATA_FORMAT_VERSION");
    }

}
