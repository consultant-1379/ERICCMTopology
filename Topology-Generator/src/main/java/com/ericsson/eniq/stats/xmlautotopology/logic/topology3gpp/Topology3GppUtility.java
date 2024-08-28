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

import com.ericsson.eniq.stats.parser.topology.jaxb.*;
import com.ericsson.eniq.stats.service.implementation.XmlWriterService;
import com.ericsson.eniq.stats.utility.Constant;
import com.ericsson.eniq.stats.utility.Utility;

public class Topology3GppUtility implements Constant {
    static Logger log = Logger.getLogger(Topology3GppUtility.class);
    public Model model;
    public String parentFdn;
    public String outputLocation;
    public int noOfcells;
    public String ossDir;
    public String network;
    public String nodeType;
    public String simulationName;
    public List<String> nodeCellRelationList;
    public String nodeOn;
    public String nodeRelease;
    public String mimVersion;
    public String nbIotCellFlag;
    public boolean eutranCellfddFlag;
    public boolean eUtranCellRelationFlag;
    public boolean geranCellRelationFlag;
    public boolean utranCellRelationFlag;
    public boolean eUtranFreqRelationFlag;
    public boolean utranFreqRelationFlag;
    public StringBuilder metaDataBuilder;

    public Topology3GppUtility(final Model model, final String parentFdn, final String outputLocation, final int noOfcells, final String ossDir,
                               final String network, final String nodeType, final String simulationName, final List<String> nodeCellRelationList,
                               final String nodeOn, final String nodeRelease, final String mimVersion, final String nbIotCellFlag,
                               final StringBuilder metaDataBuilder) {

        this.model = model;
        this.parentFdn = parentFdn;
        this.outputLocation = outputLocation;
        this.noOfcells = noOfcells;
        this.ossDir = ossDir;
        this.network = network;
        this.nodeType = nodeType;
        this.simulationName = simulationName;
        this.nodeCellRelationList = nodeCellRelationList;
        this.eutranCellfddFlag = true;
        this.geranCellRelationFlag = true;
        this.eUtranCellRelationFlag = true;
        this.utranCellRelationFlag = true;
        this.eUtranFreqRelationFlag = true;
        this.utranFreqRelationFlag = true;
        this.nodeOn = nodeOn;
        this.nodeRelease = nodeRelease;
        this.mimVersion = mimVersion;
        this.nbIotCellFlag = nbIotCellFlag;
        this.metaDataBuilder = metaDataBuilder;
    }

    public void run() {
        final Date date = new Date();
        final String timestampOfChange = Utility.dateToString(date);
        final String lastModified = "" + date.getTime();
        final Model modelGen = new Model();
        String attrName = null;
        for (final Mo mo : model.getMo()) {
            final String fdn = mo.getFdn();
            if (fdn.contains(COMMA + EUTRANCELLFDD)) {
                if (!fdn.contains(COMMA + EUTRANCELLREALTION) && !fdn.contains(COMMA + GERANCELLRELATION) && !fdn.contains(COMMA + UTRANCELLRELATION)
                        && !fdn.contains(COMMA + EUTRANFREQRELATION) && eutranCellfddFlag) {
                    this.eutranCellfddFlag = false;
                    int i = 1;
                    if (this.nbIotCellFlag.equalsIgnoreCase(YES)) {
                        i = i + 1;
                    }
                    while (i <= noOfcells) {
                        final Mo tempMo = new Mo();
                        tempMo.setFdn(prepareFdn(fdn, parentFdn, i));
                        tempMo.setLastModified(new BigInteger(lastModified));
                        for (final Attr attr : mo.getAttr()) {
                            attrName = attr.getName();
                            if (attrName.equalsIgnoreCase(TIMESTAMPOFCHANGE)) {
                                attr.getContent().set(0, timestampOfChange);
                            }
                            if (attrName.equalsIgnoreCase(HOSTINGDIGITALUNIT)) {
                                attr.getContent().set(0, parentFdn + COMMA + MANAGEDELEMENT + EQUAL + "1");
                            }
                            if (attrName.equalsIgnoreCase(SOURCE_FDN) || attrName.equalsIgnoreCase(EUTRAN_FREQUENCY_REF)
                                    || attrName.equalsIgnoreCase(NEIGHBOUR_CELL_REF) || attrName.equalsIgnoreCase(EXTERNAL_UTRAN_CELL_FDD_REF)
                                    || attrName.equalsIgnoreCase(MECONTEXTID) || attrName.equalsIgnoreCase(USERLABEL)
                                    || attrName.equalsIgnoreCase("SITEREF")) {
                                if (attr.getContent().size() > 0) {
                                    String tempSourceFdn = (String) attr.getContent().get(0);
                                    tempSourceFdn = prepareFdn(tempSourceFdn, parentFdn, i);
                                    attr.getContent().set(0, tempSourceFdn.substring(tempSourceFdn.lastIndexOf(EQUAL) + 1));
                                }

                            }
                            if (attrName.equalsIgnoreCase(EUTRANCELLFDDID) || attrName.equalsIgnoreCase(EUTRANCELLTDDID)
                                    || attrName.equalsIgnoreCase(CELLID)) {
                                final String tempSourceFdn = tempMo.getFdn();
                                final Attr tempAttr = new Attr();
                                if (attrName.equalsIgnoreCase(CELLID)) {

                                    tempAttr.setName(attrName);
                                    tempAttr.getContent().add(i + "");
                                    tempMo.getAttr().add(tempAttr);
                                } else {
                                    tempAttr.setName(attrName);
                                    tempAttr.getContent().add(tempSourceFdn.substring(tempSourceFdn.lastIndexOf(EQUAL) + 1));
                                    tempMo.getAttr().add(tempAttr);
                                }

                            } else {
                                prepareItem(attr, parentFdn);
                                tempMo.getAttr().add(attr);
                            }
                        }
                        modelGen.getMo().add(tempMo);
                        i++;
                    }
                } else {
                    List<Mo> moList = null;
                    final String lastFdn = fdn.substring(fdn.lastIndexOf(COMMA) + 1, fdn.lastIndexOf(EQUAL));
                    if (fdn.contains(COMMA + EUTRANCELLREALTION) && this.eUtranCellRelationFlag) {
                        this.eUtranCellRelationFlag = false;
                        moList = prepareCellRelationMo(modelGen, mo, nodeCellRelationList, fdn, parentFdn, noOfcells, lastModified, timestampOfChange);
                    } else if (fdn.contains(COMMA + UTRANCELLRELATION) && this.utranCellRelationFlag) {
                        this.utranCellRelationFlag = false;
                        moList = prepareCellRelationMo(modelGen, mo, nodeCellRelationList, fdn, parentFdn, noOfcells, lastModified, timestampOfChange);
                    } else if (fdn.contains(COMMA + GERANCELLRELATION) && this.geranCellRelationFlag) {
                        moList = prepareCellRelationMo(modelGen, mo, nodeCellRelationList, fdn, parentFdn, noOfcells, lastModified, timestampOfChange);
                        this.geranCellRelationFlag = false;
                    } else if (lastFdn.equalsIgnoreCase(EUTRANFREQRELATION) && this.eUtranFreqRelationFlag) {
                        moList = prepareFreqRelationMo(mo, lastModified, timestampOfChange);
                        this.eUtranFreqRelationFlag = false;
                    } else if (lastFdn.equalsIgnoreCase(UTRANFREQRELATION) && this.utranFreqRelationFlag) {
                        moList = prepareFreqRelationMo(mo, lastModified, timestampOfChange);
                        this.utranFreqRelationFlag = false;
                    }
                    if (moList != null) {
                        for (final Mo cellRelationMo : moList) {
                            modelGen.getMo().add(cellRelationMo);
                        }
                        moList.clear();
                    }
                }
            } else {
                mo.setFdn(prepareFdn(fdn, parentFdn, 0));
                mo.setLastModified(new BigInteger(lastModified));
                for (final Attr attr : mo.getAttr()) {
                    attrName = attr.getName();
                    if (attrName.equalsIgnoreCase(TIMESTAMPOFCHANGE)) {
                        attr.getContent().set(0, timestampOfChange);
                    }
                    if (attrName.equalsIgnoreCase(NODEIPADDRESS)) {
                        if (attr.getContent().size() > 0) {
                            attr.getContent().set(0, IPV4ADDRESS);
                        } else {
                            attr.getContent().add(0, IPV4ADDRESS);
                        }
                    }
                    if (attrName.equalsIgnoreCase(NODEIPV6ADDRESS)) {
                        if (attr.getContent().size() > 0) {
                            attr.getContent().set(0, IPV6ADDRESS);
                        } else {
                            attr.getContent().add(0, IPV6ADDRESS);
                        }
                    }
                    if (attrName.equalsIgnoreCase(FINGERPRINT)) {
                        if (attr.getContent().size() > 0) {
                            attr.getContent().set(0, nodeOn + FP);
                        }
                    }
                    if (attrName.equalsIgnoreCase(NODEVERSION)) {
                        attr.getContent().set(0, nodeRelease);
                    }
                    if (attrName.equalsIgnoreCase(NEMIMVERSION)) {
                        attr.getContent().set(0, mimVersion);
                    }
                    if (attrName.equalsIgnoreCase(MANAGEDELEMENTTYPE)) {
                        attr.getContent().set(0, nodeType);
                    }
                    if (attrName.equalsIgnoreCase(SOURCE_FDN)) {
                        if (attr.getContent().size() > 0) {
                            attr.getContent().set(0, parentFdn + COMMA + MANAGEDELEMENT + EQUAL + "1" + COMMA + ENODEBFUNCTION + EQUAL + "1");
                        }
                    }
                    if (attrName.equalsIgnoreCase(NBIOTCELLID)) {
                        attr.getContent().set(0, nodeOn + HYPHEN + "1");
                    }
                    if (attrName.equalsIgnoreCase(EUTRAN_FREQUENCY_REF) || attrName.equalsIgnoreCase(NEIGHBOUR_CELL_REF)
                            || attrName.equalsIgnoreCase(EXTERNAL_UTRAN_CELL_FDD_REF) || attrName.equalsIgnoreCase(MECONTEXTID)
                            || attrName.equalsIgnoreCase(USERLABEL) || attrName.equalsIgnoreCase(SITEREF)) {
                        if (attr.getContent().size() > 0) {
                            String tempSourceFdn = (String) attr.getContent().get(0);
                            tempSourceFdn = prepareFdn(tempSourceFdn, parentFdn, 0);
                            if (attrName.equalsIgnoreCase(SITEREF)) {
                                attr.getContent().set(0, tempSourceFdn);
                            } else {
                                attr.getContent().set(0, tempSourceFdn.substring(tempSourceFdn.lastIndexOf(EQUAL) + 1));
                            }

                        }

                    }
                    prepareItem(attr, parentFdn);
                }
                if (mo.getFdn().contains(NBIOTCELL)) {
                    if (this.nbIotCellFlag.equalsIgnoreCase(YES)) {
                        String nbIotFdn = mo.getFdn();
                        nbIotFdn = nbIotFdn.substring(0, nbIotFdn.lastIndexOf(EQUAL)) + EQUAL + nodeOn + HYPHEN + "1";
                        mo.setFdn(nbIotFdn);
                        modelGen.getMo().add(mo);
                    }
                } else {
                    modelGen.getMo().add(mo);
                }
            }

        }
        try {
            final XmlWriterService xmlWriteService = new XmlWriterService(Constant.TPOLOGY_JAXB_PACKAGE);
            final String outputLocation1 = Utility.prepareDirectory(outputLocation, network, nodeType, nodeOn);
            final File file = new File(outputLocation1, parentFdn + DOT + XML);
            final FileOutputStream fos = new FileOutputStream(file);
            xmlWriteService.marshallCounter3GPPToGzipOutputFile(modelGen, fos);
            Utility.prepareTopologyMetaData(metaDataBuilder, network, nodeOn, nodeType, file);
        } catch (final JAXBException e) {
            e.printStackTrace();
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public String prepareFdn(final String fdn, final String parentFdn, final int cellId) {
        String tempFdn = fdn;
        final String meContextVale = parentFdn.substring(parentFdn.lastIndexOf(EQUAL));
        if (tempFdn.contains(EUTRANCELLFDD)) {
            final List<String> list = Arrays.asList(tempFdn.split(COMMA));

            final StringBuilder sb = new StringBuilder();
            int index = 0;
            for (final String tempString : list) {
                if (tempString.contains(EUTRANCELLFDD)) {
                    final String[] a = tempString.split(EQUAL);

                    list.set(index, a[0] + meContextVale + HYPHEN + cellId);
                }
                if (tempString.contains(MANAGEDELEMENT)) {
                    final String[] a = tempString.split(EQUAL);
                    if (a[1].matches("\\d+")) {
                        list.set(index, a[0] + EQUAL + "1");
                    } else {
                        list.set(index, a[0] + meContextVale);
                    }
                }
                index++;
            }
            for (final String tempString1 : list) {

                sb.append(tempString1 + COMMA);
            }
            tempFdn = parentFdn + COMMA + sb.substring(sb.indexOf(MANAGEDELEMENT));
            tempFdn = tempFdn.substring(0, tempFdn.lastIndexOf(COMMA));
        } else if (tempFdn.contains(MANAGEDELEMENT)) {
            tempFdn = tempFdn.substring(tempFdn.indexOf(MANAGEDELEMENT));
            final String[] a = tempFdn.split(COMMA);
            final String[] manageElement = a[0].split(EQUAL);
            if (!manageElement[1].matches("\\d+")) {
                manageElement[1] = meContextVale;
                if (!tempFdn.contains(COMMA)) {
                    final String[] tempFdnIntermediate = tempFdn.split(EQUAL);
                    tempFdn = parentFdn + "," + tempFdnIntermediate[0] + meContextVale;
                } else {
                    tempFdn = tempFdn.substring(tempFdn.indexOf(COMMA));
                    tempFdn = parentFdn + COMMA + manageElement[0] + manageElement[1] + tempFdn;
                }
            } else {
                tempFdn = parentFdn + COMMA + tempFdn;
            }
        } else {
            tempFdn = parentFdn;
        }
        return tempFdn;
    }

    public void prepareItem(final Attr attr, final String parentFdn) {
        final List<Object> contentList = attr.getContent();
        for (final Object obj : contentList) {
            if (obj instanceof Seq) {
                final Seq seq = (Seq) obj;
                final List<Item> itemList = seq.getItem();
                for (final Item item : itemList) {
                    for (int i = 0; i < item.getContent().size(); i++) {
                        final Object obj1 = item.getContent().get(i);
                        if (!(obj1 instanceof Struct)) {
                            final String fdn = (String) obj1;
                            if (fdn.contains(SUBNETWORK)) {
                                final String tempFdn = prepareFdn(fdn, parentFdn, 0);
                                item.getContent().set(i, tempFdn);
                            }
                        }
                    }
                }
            }
        }

    }

    public List<Mo> prepareCellRelationMo(final Model modelGen, final Mo mo, final List<String> nodeCellRelationList, final String fdn,
                                          final String parentFdn, final int noOfcells, final String lastModified, final String timestampOfChange) {
        final List<Mo> moList = new ArrayList<Mo>();
        final Map<String, List<String>> cellRelationMap = Utility.nodeCellRealtionMap(nodeCellRelationList);
        int i = 1;
        if (this.nbIotCellFlag.equalsIgnoreCase(YES)) {
            i = i + 1;
        }
        while (i <= noOfcells) {
            final String tFdn = prepareFdn(fdn, parentFdn, i);
            String cells = null;
            final String[] fdnSplit = tFdn.split(COMMA);
            for (final String eFdn : fdnSplit) {
                if (eFdn.contains(EUTRANCELLFDD)) {
                    cells = eFdn.split(EQUAL)[1];
                }
            }
            String lastFdn = tFdn.substring(tFdn.lastIndexOf(COMMA) + 1, tFdn.length());
            lastFdn = lastFdn.substring(0, lastFdn.indexOf(EQUAL));
            final String tempLastFdn = "=" + lastFdn;
            final List<String> cellRelationList = cellRelationMap.get(cells);
            if (cellRelationList != null) {
                for (final String cellRelation : cellRelationList) {
                    final String tempCellRelation = EQUAL + cellRelation;
                    if (tempCellRelation.contains(tempLastFdn)) {
                        final String[] cellRelationSplit = cellRelation.split(EQUAL);
                        final int noOfRelations = Integer.parseInt(cellRelationSplit[1]);
                        if (noOfRelations > 0) {
                            final String[] cellRelationValueArray = cellRelationSplit[2].split(COMMA);
                            for (final String cellRelationValue : cellRelationValueArray) {
                                final Mo cellRelationMo = new Mo();
                                final String cellRelationFdn = tFdn.substring(0, tFdn.indexOf(lastFdn)) + lastFdn + EQUAL + cellRelationValue;
                                cellRelationMo.setFdn(cellRelationFdn);
                                cellRelationMo.setLastModified(new BigInteger(lastModified));
                                cellRelationMo.setMimName(mo.getMimName());
                                for (Attr attr : mo.getAttr()) {
                                    final String attrName = attr.getName();
                                    if (attrName.equalsIgnoreCase(NEIGHBOUR_CELL_REF) || attrName.equalsIgnoreCase(EXTERNAL_UTRAN_CELL_FDD_REF)) {
                                        attr = getNeighborCellReference(attr);
                                    }
                                    if (attrName.equalsIgnoreCase(TIMESTAMPOFCHANGE)) {
                                        attr.getContent().set(0, timestampOfChange);
                                    }
                                    if (attrName.equalsIgnoreCase(GERANCELLRELATIONID) || attrName.equalsIgnoreCase(UTRANCELLRELATIONID)) {
                                        final Attr attrTemp = new Attr();
                                        attrTemp.setName(attrName);
                                        attrTemp.getContent().add(0, cellRelationValue);
                                        attr = attrTemp;
                                    }
                                    cellRelationMo.getAttr().add(attr);
                                }
                                moList.add(cellRelationMo);
                            }
                        }
                    }
                }
            }
            i++;
        }
        return moList;
    }

    private Attr getNeighborCellReference(final Attr attr) {
        final Attr attrTemp = new Attr();
        attrTemp.setName(attr.getName());
        if (attr.getContent().size() > 0) {
            String neighborCellReferenceValue = (String) attr.getContent().get(0);
            neighborCellReferenceValue = parentFdn + COMMA + neighborCellReferenceValue.substring(neighborCellReferenceValue.indexOf(MANAGEDELEMENT));
            attrTemp.getContent().add(0, neighborCellReferenceValue);
        }
        return attrTemp;
    }

    private List<Mo> prepareFreqRelationMo(final Mo mo, final String lastModified, final String timestampOfChange) {
        final List<Mo> freqRelationMoList = new ArrayList<Mo>();
        int i = 1;
        if (this.nbIotCellFlag.equalsIgnoreCase(YES)) {
            i = i + 1;
        }
        while (i <= noOfcells) {
            final Mo freqRelationMo = new Mo();
            freqRelationMo.setFdn(prepareFdn(mo.getFdn(), parentFdn, i));
            freqRelationMo.setMimName(mo.getMimName());
            freqRelationMo.setLastModified(new BigInteger(lastModified));
            for (Attr attr : mo.getAttr()) {
                final String attrName = attr.getName();
                if (attrName.equalsIgnoreCase(NEIGHBOUR_CELL_REF) || attrName.equalsIgnoreCase(EXTERNAL_UTRAN_CELL_FDD_REF)
                        || attrName.equalsIgnoreCase(EUTRAN_FREQUENCY_REF)) {
                    attr = getNeighborCellReference(attr);
                }
                if (attrName.equalsIgnoreCase(TIMESTAMPOFCHANGE)) {
                    attr.getContent().set(0, timestampOfChange);
                }
                freqRelationMo.getAttr().add(attr);
            }
            freqRelationMoList.add(freqRelationMo);
            i++;
        }
        return freqRelationMoList;
    }
}
