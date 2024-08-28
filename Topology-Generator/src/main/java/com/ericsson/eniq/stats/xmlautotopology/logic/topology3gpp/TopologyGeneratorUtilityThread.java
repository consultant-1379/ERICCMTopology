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
package com.ericsson.eniq.stats.xmlautotopology.logic.topology3gpp;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;

import com.ericsson.eniq.stats.counter.parser.CounterParser;
import com.ericsson.eniq.stats.parser.topology.jaxb.*;
import com.ericsson.eniq.stats.service.implementation.XmlWriterService;
import com.ericsson.eniq.stats.utility.Constant;
import com.ericsson.eniq.stats.utility.Utility;

public class TopologyGeneratorUtilityThread implements Constant, Runnable {
    static Logger log = Logger.getLogger(TopologyGeneratorUtilityThread.class);
    private final File counterFileXml;
    private final Map<String, Mo> moAttributeMap;
    private final String nodeType;
    private String nodeOn;
    private final String nodeRelease;
    private final String mimVersion;
    private String parentFdn;
    private final StringBuilder topologyFlsMetaData;
    private final String ossDir;
    private final String network;
    private final String outputLocation;

    public TopologyGeneratorUtilityThread(final File counterFileXml, final Map<String, Mo> moAttributeMap, final String nodeType,
                                          final String nodeOn, final String nodeRelease, final String mimVersion, final String network,
                                          final String ossDir, final StringBuilder topologyFlsMetaData, final String outputLocation,
                                          final String parentFdn) {

        this.counterFileXml = counterFileXml;
        this.moAttributeMap = moAttributeMap;
        this.nodeType = nodeType;
        this.nodeOn = nodeOn;
        this.nodeRelease = nodeRelease;
        this.mimVersion = mimVersion;
        this.ossDir = ossDir;
        this.network = network;
        this.topologyFlsMetaData = topologyFlsMetaData;
        this.outputLocation = outputLocation;
        this.parentFdn = parentFdn;

    }

    @Override
    public void run() {
        Thread.currentThread().setName(nodeOn);
        final String threadName = Thread.currentThread().getName();
        log.info("Processing of Node - " + threadName + " Started");
        final Date date = new Date();
        final String timestampOfChange = Utility.dateToString(date);
        final String lastModified = "" + date.getTime();
        final Map<String, List<String>> pmGroupMapping = new CounterParser().prepareMOList(network, counterFileXml, nodeType);
        final Model genratedTopologyModel = new Model();
        for (final String pmGroup : moAttributeMap.keySet()) {
            final Mo referenceTopologyMo = moAttributeMap.get(pmGroup);
            final String referenceTopoFdn = referenceTopologyMo.getFdn();
            final List<String> moList = pmGroupMapping.get(pmGroup);
            if (moList != null) {
                for (final String mo : moList) {
                    final Mo generatedTopologyMo = new Mo();
                    final String lastFdn = Utility.lastFdn(mo);
                    String fullFdn = parentFdn.toString();
                    if (!lastFdn.equals(MECONTEXT)) {
                        fullFdn = fullFdn + COMMA + mo;
                    }
                    generatedTopologyMo.setFdn(fullFdn);
                    generatedTopologyMo.setLastModified(new BigInteger(lastModified));
                    generatedTopologyMo.setMimName(referenceTopologyMo.getMimName());
                    for (final Attr attribute : referenceTopologyMo.getAttr()) {
                        final Attr generatedAttribute = prepareAttribute(attribute, timestampOfChange, fullFdn);
                        generatedTopologyMo.getAttr().add(generatedAttribute);
                    }
                    genratedTopologyModel.getMo().add(generatedTopologyMo);
                }

            } else {
                if (referenceTopologyMo != null) {
                    final Mo generatedTopologyMo = new Mo();
                    String fullFdn = parentFdn.toString();
                    final String lastFdn = Utility.lastFdn(referenceTopoFdn);
                    String fdnFromManagedElement = "";
                    if (!lastFdn.equals(MECONTEXT) && !lastFdn.equals(MANAGEDELEMENT)) {
                        fdnFromManagedElement = referenceTopoFdn.substring(referenceTopoFdn.indexOf(MANAGEDELEMENT));
                        final String manegeElementValue = fdnFromManagedElement.substring(fdnFromManagedElement.indexOf(EQUAL) + 1,
                                fdnFromManagedElement.indexOf(COMMA));
                        if (!manegeElementValue.matches(DIGITVALUE)) {
                            fullFdn = fullFdn + COMMA + MANAGEDELEMENT + EQUAL + nodeOn + COMMA
                                    + fdnFromManagedElement.substring(fdnFromManagedElement.indexOf(COMMA) + 1);
                        } else {
                            fullFdn = fullFdn + COMMA + fdnFromManagedElement;
                        }

                    }
                    generatedTopologyMo.setFdn(fullFdn);
                    generatedTopologyMo.setLastModified(new BigInteger(lastModified));
                    generatedTopologyMo.setMimName(referenceTopologyMo.getMimName());
                    for (final Attr attribute : referenceTopologyMo.getAttr()) {
                        final Attr generatedAttribute = prepareAttribute(attribute, timestampOfChange, fullFdn);
                        generatedTopologyMo.getAttr().add(generatedAttribute);
                    }
                    genratedTopologyModel.getMo().add(generatedTopologyMo);
                }
            }

        }
        try {
            final XmlWriterService xmlWriteService = new XmlWriterService(Constant.TPOLOGY_JAXB_PACKAGE);
            final String outputLocation1 = Utility.prepareDirectory(outputLocation, network, nodeType, nodeOn);
            final File file = new File(outputLocation1, parentFdn + DOT + XML);
            final FileOutputStream fos = new FileOutputStream(file);
            xmlWriteService.marshallCounter3GPPToGzipOutputFile(genratedTopologyModel, fos);
            Utility.prepareTopologyMetaData(topologyFlsMetaData, network, nodeOn, nodeType, file);
        } catch (final JAXBException e) {
            log.error(e);
        } catch (final FileNotFoundException e) {
            log.error(e);
        }
        log.info("Processing of Node - " + threadName + " Finished");
    }

    /**
     * Modified the attribute value for mo's
     * 
     * @param attr
     * @param timestampOfChange
     * @param fullFdn
     * @return Attr
     */
    private synchronized Attr prepareAttribute(final Attr attr, final String timestampOfChange, final String fullFdn) {

        final String attributeName = attr.getName();
        final Attr genratedAttribute = new Attr();
        genratedAttribute.setName(attributeName);
        for (final Object content : attr.getContent()) {
            genratedAttribute.getContent().add(content);
        }
        if (attributeName.equalsIgnoreCase(TIMESTAMPOFCHANGE)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, timestampOfChange);
            } else {
                genratedAttribute.getContent().add(0, timestampOfChange);
            }

        } else if (attributeName.equalsIgnoreCase(NODEIPADDRESS)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, IPV4ADDRESS);
            } else {
                genratedAttribute.getContent().add(0, IPV4ADDRESS);
            }
        } else if (attributeName.equalsIgnoreCase(NODEIPV6ADDRESS)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, IPV6ADDRESS);
            } else {
                genratedAttribute.getContent().add(0, IPV6ADDRESS);
            }
        } else if (attributeName.equalsIgnoreCase(FINGERPRINT)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, nodeOn + FP);
            } else {
                genratedAttribute.getContent().add(0, nodeOn + FP);
            }
        } else if (attributeName.equalsIgnoreCase(NODEVERSION) || attributeName.equalsIgnoreCase(RELEASE)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, nodeRelease);
            } else {
                genratedAttribute.getContent().add(0, nodeRelease);
            }

        } else if (attributeName.equalsIgnoreCase(NEMIMVERSION)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, mimVersion);
            } else {
                genratedAttribute.getContent().add(0, mimVersion);
            }

        } else if (attributeName.equalsIgnoreCase(MANAGEDELEMENTTYPE) && !network.equalsIgnoreCase(CORE)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, nodeType);
            } else {
                genratedAttribute.getContent().add(0, nodeType);
            }

        } else if (attributeName.equalsIgnoreCase(EUTRANCELLFDDID) || attributeName.equalsIgnoreCase(EUTRANCELLTDDID)) {
            final String cellValue = fullFdn.substring(fullFdn.lastIndexOf(EQUAL) + 1);
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, cellValue);
            } else {
                genratedAttribute.getContent().add(0, cellValue);
            }

        } else if (attributeName.equalsIgnoreCase(CELLID)) {
            final String cellId = fullFdn.substring(fullFdn.lastIndexOf("-") + 1);
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, cellId);
            } else {
                genratedAttribute.getContent().add(0, cellId);
            }

        } else if (attributeName.equals(USERLABEL) || attributeName.equals(MECONTEXTID) || attributeName.equalsIgnoreCase(MANAGEDELEMENTID)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, nodeOn);
            } else {
                genratedAttribute.getContent().add(0, nodeOn);
            }
        } else if (attributeName.equalsIgnoreCase(SITEREF) || attributeName.equalsIgnoreCase(DNPREFIX)) {
            String siteRefFdn = "";
            if (parentFdn.contains(MECONTEXT)) {
                siteRefFdn = parentFdn.substring(0, parentFdn.indexOf(MECONTEXT)) + SITE + EQUAL + nodeOn;
            } else {
                siteRefFdn = parentFdn.substring(0, parentFdn.indexOf(MANAGEDELEMENT)) + SITE + EQUAL + nodeOn;
            }

            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, siteRefFdn);
            } else {
                genratedAttribute.getContent().add(0, siteRefFdn);
            }

        } else if (attributeName.equalsIgnoreCase(SOURCE_FDN)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, parentFdn + ENODEBFUNCTIONONE);
            } else {
                genratedAttribute.getContent().add(0, parentFdn + ENODEBFUNCTIONONE);
            }

        } else if (attributeName.equalsIgnoreCase(GERANCELLRELATIONID) || attributeName.equalsIgnoreCase(UTRANCELLRELATIONID)
                || attributeName.equalsIgnoreCase(CDMA20001XRTTCELLRALATION)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, fullFdn.substring(fullFdn.lastIndexOf(EQUAL) + 1));
            } else {
                genratedAttribute.getContent().add(0, fullFdn.substring(fullFdn.lastIndexOf(EQUAL) + 1));
            }

        } else if (attributeName.equalsIgnoreCase(PROCESSORLOADID)) {
            if (genratedAttribute.getContent().size() > 0) {
                genratedAttribute.getContent().set(0, fullFdn.substring(fullFdn.lastIndexOf(EQUAL) + 1));
            } else {
                genratedAttribute.getContent().add(0, fullFdn.substring(fullFdn.lastIndexOf(EQUAL) + 1));
            }

        } else if (attributeName.equalsIgnoreCase(SECTORCARRIERREF) || attributeName.equalsIgnoreCase(RESERVEDBY)
                || attributeName.equalsIgnoreCase(CARRIERSREF) || attributeName.equalsIgnoreCase(RPUREFS)) {
            final List<Object> contentList = genratedAttribute.getContent();
            int i = 0;
            for (final Object content : contentList) {
                if (content instanceof Seq) {
                    final Seq tempSeq = (Seq) content;
                    contentList.set(i, prepareSeq(tempSeq));
                } else {
                    final String reservedByContent = ((String) content).trim();
                    if (!reservedByContent.equals(null) && !reservedByContent.equals(SPACE)) {
                        final String managedElementMo = reservedByContent.substring(reservedByContent.indexOf(MANAGEDELEMENT));
                        final String managedElementValue = managedElementMo.substring(managedElementMo.indexOf(EQUAL) + 1,
                                managedElementMo.indexOf(COMMA));
                        if (!managedElementValue.matches(DIGITVALUE)) {
                            final String reservedByContentFdn = parentFdn + COMMA + MANAGEDELEMENT + EQUAL + nodeOn + COMMA
                                    + managedElementMo.substring(managedElementMo.indexOf(COMMA) + 1);
                            genratedAttribute.getContent().set(0, reservedByContentFdn);
                        } else {
                            genratedAttribute.getContent().set(0,
                                    parentFdn + reservedByContent.substring(reservedByContent.indexOf(COMMA + MANAGEDELEMENT)));

                        }
                    }
                }
                i++;
            }
        } else if (attributeName.equalsIgnoreCase(EXTERNAL_UTRAN_CELL_FDD_REF) || attributeName.equalsIgnoreCase(SOURCEFDN)
                || attributeName.equalsIgnoreCase(CARRIERREF) || attributeName.equalsIgnoreCase(LAGREF)) {

            if (genratedAttribute.getContent().size() > 0) {
                final String externalUtranCellFddRefValue = (String) genratedAttribute.getContent().get(0);
                final String managedElementMo = externalUtranCellFddRefValue.substring(externalUtranCellFddRefValue.indexOf(MANAGEDELEMENT));
                final String managedElementValue = managedElementMo.substring(managedElementMo.indexOf(EQUAL) + 1, managedElementMo.indexOf(COMMA));
                if (!managedElementValue.matches(DIGITVALUE)) {
                    final String externalUtranCellFddRefFdn = parentFdn + COMMA + MANAGEDELEMENT + EQUAL + nodeOn + COMMA
                            + managedElementMo.substring(managedElementMo.indexOf(COMMA) + 1);
                    genratedAttribute.getContent().set(0, externalUtranCellFddRefFdn);
                } else {
                    genratedAttribute.getContent().set(0,
                            parentFdn + externalUtranCellFddRefValue.substring(externalUtranCellFddRefValue.indexOf(COMMA + MANAGEDELEMENT)));
                }

            }
        } else if (attributeName.equalsIgnoreCase(EUTRAN_FREQUENCY_REF) || attributeName.equalsIgnoreCase(NEIGHBOUR_CELL_REF)) {
            if (genratedAttribute.getContent().size() > 0) {
                final String eutranFrequencyRefValue = (String) genratedAttribute.getContent().get(0);
                final String managedElementMo = eutranFrequencyRefValue.substring(eutranFrequencyRefValue.indexOf(MANAGEDELEMENT));
                final String managedElementValue = managedElementMo.substring(managedElementMo.indexOf(EQUAL) + 1, managedElementMo.indexOf(COMMA));
                if (!managedElementValue.matches(DIGITVALUE)) {
                    final String eutranFrequencyRefFdn = parentFdn + COMMA + MANAGEDELEMENT + EQUAL + nodeOn + COMMA
                            + managedElementMo.substring(managedElementMo.indexOf(COMMA) + 1);
                    genratedAttribute.getContent().set(0, eutranFrequencyRefFdn);

                } else {
                    genratedAttribute.getContent().set(0,
                            parentFdn + eutranFrequencyRefValue.substring(eutranFrequencyRefValue.indexOf(COMMA + MANAGEDELEMENT)));
                }

            }

        } else if (attributeName.equalsIgnoreCase(HOSTINGDIGITALUNIT)) {
            if (genratedAttribute.getContent().size() > 0) {
                final String hostingDigitalUnit = (String) genratedAttribute.getContent().get(0);
                final String managedElementMo = hostingDigitalUnit.substring(hostingDigitalUnit.indexOf(MANAGEDELEMENT));
                final String managedElementValue = managedElementMo.substring(managedElementMo.indexOf(EQUAL) + 1);
                if (!managedElementValue.matches(DIGITVALUE)) {
                    final String hostingDigitalUnitFdn = parentFdn + COMMA + MANAGEDELEMENT + EQUAL + nodeOn;
                    genratedAttribute.getContent().set(0, hostingDigitalUnitFdn);

                } else {
                    genratedAttribute.getContent().set(0,
                            parentFdn + hostingDigitalUnit.substring(hostingDigitalUnit.indexOf(COMMA + MANAGEDELEMENT)));
                }

            }

        } else if (attributeName.equalsIgnoreCase(EXTGERANCELLREF) || attributeName.equalsIgnoreCase(RFBRANCHRXREF)) {
            if (genratedAttribute.getContent().size() > 0) {
                final String extGeranCellRefOrRefBranchRxRef = (String) genratedAttribute.getContent().get(0);
                final String managedElementMo = extGeranCellRefOrRefBranchRxRef.substring(extGeranCellRefOrRefBranchRxRef.indexOf(MANAGEDELEMENT));
                final String managedElementValue = managedElementMo.substring(managedElementMo.indexOf(EQUAL) + 1, managedElementMo.indexOf(COMMA));
                if (!managedElementValue.matches(DIGITVALUE)) {
                    final String extGeranCellRefOrRefBranchRxRefFdn = parentFdn + COMMA + MANAGEDELEMENT + EQUAL + nodeOn + COMMA
                            + managedElementMo.substring(managedElementMo.indexOf(COMMA) + 1);
                    genratedAttribute.getContent().set(0, extGeranCellRefOrRefBranchRxRefFdn);

                } else {
                    genratedAttribute.getContent().set(0,
                            parentFdn + extGeranCellRefOrRefBranchRxRef.substring(extGeranCellRefOrRefBranchRxRef.indexOf(COMMA + MANAGEDELEMENT)));
                }

            }

        } else if (attributeName.equalsIgnoreCase(RNCMODULEREF) || attributeName.equalsIgnoreCase(UTRANCELLIUBLINK)
                || attributeName.equalsIgnoreCase(ADJACENTCELL) || attributeName.equalsIgnoreCase(EXTERNALGSMCELLREF)
                || attributeName.equalsIgnoreCase(ADMPASSIVESLOT) || attributeName.equalsIgnoreCase(ADMACTIVESLOT)
                || attributeName.equalsIgnoreCase(ATMTRAFFICDESCRIPTORID)) {
            if (genratedAttribute.getContent().size() > 0) {
                final String attributeValue = (String) genratedAttribute.getContent().get(0);
                if (attributeValue.contains(MANAGEDELEMENT)) {
                    final String managedElementString = attributeValue.substring(attributeValue.indexOf(MANAGEDELEMENT));
                    final String managedElementValue = managedElementString.substring(managedElementString.indexOf(EQUAL) + 1,
                            managedElementString.indexOf(COMMA));
                    if (!managedElementValue.matches(DIGITVALUE)) {
                        final String attributeValueFdn = parentFdn + COMMA + MANAGEDELEMENT + EQUAL + nodeOn + COMMA
                                + managedElementString.substring(managedElementString.indexOf(COMMA) + 1);
                        genratedAttribute.getContent().set(0, attributeValueFdn);
                    } else {
                        genratedAttribute.getContent().set(0, parentFdn + attributeValue.substring(attributeValue.indexOf(COMMA + MANAGEDELEMENT)));
                    }

                }
            }

        }

        return genratedAttribute;
    }

    /**
     * Modified the Seq typye attribute
     * 
     * @param seqTemp
     * @return Seq
     */
    public synchronized Seq prepareSeq(final Seq seqTemp) {
        final Seq seq = new Seq();
        seq.setCount(seqTemp.getCount());
        for (final Item tempItem : seqTemp.getItem()) {
            final String itemName = (String) tempItem.getContent().get(0);
            String itemNameFdn = "";
            final String managedElementMo = itemName.substring(itemName.indexOf(MANAGEDELEMENT));
            final String managedElementValue = managedElementMo.substring(managedElementMo.indexOf(EQUAL) + 1, managedElementMo.indexOf(COMMA));

            if (!managedElementValue.matches(DIGITVALUE)) {
                itemNameFdn = parentFdn + COMMA + MANAGEDELEMENT + EQUAL + nodeOn + COMMA
                        + managedElementMo.substring(managedElementMo.indexOf(COMMA) + 1);

            } else {
                itemNameFdn = parentFdn + itemName.substring(itemName.indexOf(COMMA + MANAGEDELEMENT));
            }
            final Item item = new Item();
            item.getContent().add(itemNameFdn);
            seq.getItem().add(item);

        }
        return seq;
    }
}
