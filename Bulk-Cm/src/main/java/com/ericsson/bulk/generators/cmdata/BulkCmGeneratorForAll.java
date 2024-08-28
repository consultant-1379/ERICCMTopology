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
package com.ericsson.bulk.generators.cmdata;

import java.io.PrintWriter;
import java.util.*;

import org.apache.log4j.Logger;

import com.ericsson.bulk.parser.mimparser.MimParser;
import com.ericsson.bulk.user.input.jaxb.SimulationData.Simulation;
import com.ericsson.bulk.utilities.BulkCmProperties;
import com.ericsson.bulk.utilities.Utility;

public class BulkCmGeneratorForAll {
    static Logger log = Logger.getLogger(BulkCmGeneratorForAll.class);
    protected Hashtable<String, Integer> moInstances;
    private String swVersion = "";
    private String mimVerison = "";
    private String mirrorMimVerison = "";
    private String dataFmtVersion = "";
    private String usrLbl = "";
    private String userLb = "UserLable";
    private String sId = "ServiceId";
    private HashMap<String, ArrayList<String>> moAttributes = new HashMap<String, ArrayList<String>>();
    private HashMap<String, ArrayList<String>> structRef = new HashMap<String, ArrayList<String>>();
    private ArrayList<String> meContxtLst;
    private List<String> nodeList;
    Simulation simulation;
    String mimFileName;
    public boolean wcdmaRnc;
    public String nodeType;
    PrintWriter localPrintWriter;

    public BulkCmGeneratorForAll(final Simulation simulation, final String mimFileName, final boolean wcdmaRnc, final PrintWriter localPrintWriter) {
        this.simulation = simulation;
        this.mimFileName = mimFileName;
        this.wcdmaRnc = wcdmaRnc;
        this.localPrintWriter = localPrintWriter;
        initParam();
        final List<String> mimDataList = new MimParser(this.mimFileName).getMimData();
        readMimData(mimDataList);
        constructNodeList();
        createFile();
    }

    private void initParam() {

        this.swVersion = BulkCmProperties.SW_VERSION;
        this.mimVerison = BulkCmProperties.MIM_VERSION;
        this.mirrorMimVerison = BulkCmProperties.MIRROR_MIM_VERSION;
        this.dataFmtVersion = BulkCmProperties.DATA_FORMAT_VERSION;
    }

    private void readMimData(final List<String> mimDataList) {
        try {
            this.moInstances = new Hashtable<String, Integer>();
            String pmGroup = "";
            ArrayList<String> listOfAttributes = new ArrayList<String>();
            ArrayList<String> listOfStructAttributes = new ArrayList<String>();
            this.meContxtLst = new ArrayList<String>();
            for (final String mimData : mimDataList) {
                if (!mimData.startsWith("#")) {

                    //MOName,NoOfMOInstances,NoOfCounters,Total,attributes,StructAttributes
                    //e.g. OperatorDefinedQci,1,5,5,OperatorDefinedQciId[string];keyIdOperatorDefinedQci[string];featureStateOperatorDefinedQci[enumRef];licenseStateOperatorDefinedQci[enumRef];serviceStateOperatorDefinedQci[enumRef],ScheduleEntry:time;weekday
                    final String[] mimDataSplit = mimData.split(BulkCmProperties.COMMA);
                    pmGroup = mimDataSplit[0];
                    final String[] attributes = mimDataSplit[4].split(BulkCmProperties.SEMICOLON);
                    final Integer noOfMoInstances = Integer.valueOf(mimDataSplit[1].trim().equals("") ? 1 : new Integer(mimDataSplit[1].trim())
                            .intValue());
                    this.moInstances.put(mimDataSplit[0], noOfMoInstances);
                    for (final String attribute : attributes) {
                        listOfAttributes.add(attribute);
                    }
                    if (pmGroup.equalsIgnoreCase(BulkCmProperties.MECONTEXT)) {
                        for (final String meContextAttribute : attributes) {
                            this.meContxtLst.add(meContextAttribute);
                        }
                    } else {
                        this.moAttributes.put(pmGroup, listOfAttributes);
                        listOfAttributes = new ArrayList<String>();
                    }
                    //If pmGroup contais structure type attributes 
                    //for exp: PlmnId:mcc;mnc:mncLength
                    if (mimDataSplit.length == 6) {
                        final String[] structTypes = mimDataSplit[5].split(BulkCmProperties.COLON);
                        final String[] structTypesAttributes = structTypes[1].split(BulkCmProperties.SEMICOLON);
                        for (final String structAttribute : structTypesAttributes) {
                            listOfStructAttributes.add(structAttribute);
                        }
                        this.structRef.put(structTypes[0], listOfStructAttributes);
                        listOfStructAttributes = new ArrayList<String>();
                    }
                }
            }
        } catch (final Exception localException) {
            log.error(localException);
        }
    }

    private void constructNodeList() {
        this.nodeList = new ArrayList<String>();
        final String[] nodeTypes = simulation.getNodeType().split(BulkCmProperties.COLON);
        final String nodePrefix = simulation.getNodePrefix();
        final int noOfNodes = Integer.parseInt(simulation.getNoOfNodes());
        String nodesOn = null;
        if (simulation.getNetwork().equalsIgnoreCase(BulkCmProperties.WCDMA)) {
            final String[] nodePrefixWcdma = nodePrefix.split(":");
            if (wcdmaRnc) {
                this.nodeList.add(nodePrefixWcdma[0]);
                nodeType = nodeTypes[0];
            } else {
                nodeType = nodeTypes[1];
                for (int i = 1; i <= noOfNodes; i++) {
                    nodesOn = String.format("%s%02d", nodePrefixWcdma[1], i);
                    this.nodeList.add(nodesOn);
                }
            }
        } else {
            nodeType = nodeTypes[0];
            for (int i = 1; i <= noOfNodes; i++) {
                nodesOn = String.format("%s%05d", nodePrefix, i);
                this.nodeList.add(nodesOn);
            }
        }
    }

    private void createFile() {
        try {
            generateCmFile();
        } catch (final Exception localIOException) {
            log.error(localIOException);
        }
    }

    private void generateCmFile() {
        int dataContainerId = 1;
        int nodeIndex = 1;
        final String[] nodePerCell = simulation.getNodePerCell().split(",");
        try {
            localPrintWriter.append("<configData dnPrefix=\"Undefined\">\n<xn:SubNetwork id=\"ONRM_ROOT_MO\">\n");

            for (final String nodeName : this.nodeList) {
                log.info("Bulk-CM writing started for Node : " + nodeName);
                StringBuilder localStringBuilderAll = new StringBuilder();
                this.usrLbl = nodeName;
                localStringBuilderAll.append("<xn:SubNetwork id=\"" + this.usrLbl + "\">\n<xn:MeContext id=\"" + this.usrLbl + "\">\n");
                localStringBuilderAll.append("<xn:VsDataContainer id=\"" + this.usrLbl + "\">\n<xn:attributes>\n");
                localStringBuilderAll.append("<xn:vsDataType>vsDataMeContext</xn:vsDataType>\n<xn:vsDataFormatVersion>" + this.dataFmtVersion
                        + "</xn:vsDataFormatVersion>\n");
                localStringBuilderAll.append(" <es:vsDataMeContext>\n");
                localPrintWriter.append(localStringBuilderAll.toString());
                localStringBuilderAll = new StringBuilder();
                constructAttributes(this.meContxtLst);
                localStringBuilderAll.append("</es:vsDataMeContext>\n</xn:attributes>\n</xn:VsDataContainer>\n");
                localStringBuilderAll.append("<xn:ManagedElement id=\"1\">\n<xn:attributes>\n");
                localStringBuilderAll
                        .append("<xn:locationName></xn:locationName>\n<xn:userDefinedState></xn:userDefinedState>\n<xn:vendorName>Ericsson</xn:vendorName>\n");
                localStringBuilderAll.append("<xn:userLable>" + this.usrLbl + "</xn:userLable>\n<xn:managedElementType>" + this.nodeType
                        + "</xn:managedElementType>\n");

                localStringBuilderAll.append("<xn:swVersion>" + this.swVersion + "</xn:swVersion>\n");
                localStringBuilderAll.append("<xn:managedBy>SubNetwork=ONRM_ROOT_MO,ManagementNode=ONRM</xn:managedBy>\n </xn:attributes>\n");
                for (final String pmGroup : this.moAttributes.keySet()) {
                    int noOfMoInstance = this.moInstances.get(pmGroup).intValue();
                    if (pmGroup.equalsIgnoreCase(BulkCmProperties.EUTRANCELLFDD) || pmGroup.equalsIgnoreCase(BulkCmProperties.LRATEUTRANCELLFDD)
                            || pmGroup.equalsIgnoreCase(BulkCmProperties.PRBSENodeBFunctionEUtranCellFDD)) {
                        final int noOfCells = Utility.getNoOfCells(nodeIndex, nodePerCell);
                        if (simulation.getNbIotCell().equalsIgnoreCase(BulkCmProperties.YES) && noOfCells != 1) {
                            noOfMoInstance = noOfCells - 1;
                        } else {
                            noOfMoInstance = noOfCells;
                        }
                        nodeIndex++;
                    }
                    for (int k = 1; k <= noOfMoInstance; k++) {
                        if (pmGroup.equalsIgnoreCase(BulkCmProperties.NBIOTCELL) || pmGroup.equalsIgnoreCase(BulkCmProperties.LRATNBIOTCELL)) {
                            if (simulation.getNbIotCell().equalsIgnoreCase("NO")) {
                                continue;
                            }
                        }
                        localStringBuilderAll.append("<xn:VsDataContainer id=\"" + dataContainerId + "\">\n");
                        localStringBuilderAll.append("<xn:attributes>\n<xn:vsDataType>vsData" + pmGroup + "</xn:vsDataType>\n");
                        localStringBuilderAll.append("<xn:vsDataFormatVersion>EricssonSpecificAttributes.13.04</xn:vsDataFormatVersion>\n");

                        localStringBuilderAll.append(" <es:vsData" + pmGroup + "" + "" + ">\n");
                        localPrintWriter.append(localStringBuilderAll.toString());
                        localStringBuilderAll = new StringBuilder();
                        constructAttributes(this.moAttributes.get(pmGroup));
                        localStringBuilderAll.append("</es:vsData" + pmGroup + "" + "" + ">\n");
                        localStringBuilderAll.append("</xn:attributes>\n");
                        localStringBuilderAll.append("</xn:VsDataContainer>\n");
                        dataContainerId++;
                    }
                }
                localStringBuilderAll.append("</xn:ManagedElement>\n</xn:MeContext>\n");
                localStringBuilderAll.append("</xn:SubNetwork>\n");
                localPrintWriter.append(localStringBuilderAll.toString());
                localStringBuilderAll = new StringBuilder();
                log.info("Bulk-CM writing Finished for Node : " + nodeName);
            }
            localPrintWriter.append("</xn:SubNetwork>\n");
            localPrintWriter.append("</configData>\n");
        } catch (final Exception localException) {
            log.error(localException);
        }
    }

    private void constructAttributes(final ArrayList<String> attributeList) {
        StringBuilder localStringBuilder = new StringBuilder();
        for (final String attributeWithDataType : attributeList) {
            final String attribute = attributeWithDataType.substring(0, attributeWithDataType.indexOf('['));
            final String attributeDataType = attributeWithDataType.substring(attributeWithDataType.indexOf('[') + 1,
                    attributeWithDataType.indexOf(']'));
            String tempAttribute = "";
            String tempAttributeType = "";
            String tempStructAttribute = "";
            int noOfTempAttributeInstances = 1;
            if (attributeWithDataType.contains("(")) {
                tempAttribute = attribute.substring(0, attribute.indexOf("("));

                noOfTempAttributeInstances = Integer.parseInt(attribute.substring(attribute.indexOf("(") + 1, attribute.indexOf(")")));
            } else {
                tempAttribute = attribute;
            }
            if (attributeDataType.contains("=")) {
                final String[] arrayOfString = attributeDataType.split("=");
                tempAttributeType = arrayOfString[0];

                tempStructAttribute = arrayOfString[1];
            }
            for (int j = 0; j <= noOfTempAttributeInstances - 1; j++) {
                if (tempAttributeType.equals("string")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + genRandomString() + "</es:" + tempAttribute + ">\n");
                }
                if (tempAttributeType.equals("boolean")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">false</es:" + tempAttribute + ">\n");
                } else if (tempAttributeType.equals("longlong")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + genLongRandomNo() + "</es:" + tempAttribute + ">\n");
                } else if (tempAttributeType.equals("structRef")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + "\n");
                    genStructAttribute(localStringBuilder, tempStructAttribute);
                    localStringBuilder.append("</es:" + tempAttribute + ">" + "\n");
                } else if (tempAttribute.equals("userLabel")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + this.userLb + "</es:" + tempAttribute + ">\n");
                } else if (tempAttribute.equals("MbmsServiceId")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + this.sId + "</es:" + tempAttribute + ">\n");
                } else if (tempAttribute.contains("ipAddress")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + genIpAddress() + "</es:" + tempAttribute + ">\n");
                } else if (attribute.contains("MIMversion")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + this.mimVerison + "</es:" + tempAttribute + ">\n");
                } else if (attribute.contains("mirrorMIBversion")) {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + this.mirrorMimVerison + "</es:" + tempAttribute + ">\n");
                } else {
                    localStringBuilder.append("<es:" + tempAttribute + ">" + (10 + (int) (Math.random() * 100.0D)) + "</es:" + tempAttribute + ">\n");
                }
            }
        }
        try {
            localPrintWriter.append(localStringBuilder.toString());
            localStringBuilder = null;
        } catch (final Exception localIOException) {
            log.error(localIOException);
        }
    }

    private void genStructAttribute(final StringBuilder paramStringBuilder, final String structRefName) {
        final ArrayList<String> structAttributeList = this.structRef.get(structRefName);
        if (structAttributeList != null) {
            for (final String structAttribute : structAttributeList) {
                paramStringBuilder.append("<es:" + structAttribute + ">" + (1 + (int) (Math.random() * 50.0D)) + "</es:" + structAttribute + ">\n");
            }
        }
    }

    private String genIpAddress() {
        String ipAddress = "102.15.66.";
        ipAddress = ipAddress + (10 + (int) (Math.random() * 100.0D));
        return ipAddress;
    }

    private String genRandomString() {
        String str = "abc";
        str = str + (10 + (int) (Math.random() * 100.0D));
        return str;
    }

    private long genLongRandomNo() {
        return (long) (10L + (Math.random() * 1.0E13D));
    }
}
