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
package com.ericsson.bulk.parser.mimparser;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.xml.parsers.*;

import org.apache.log4j.Logger;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class MimParser extends DefaultHandler {
    static Logger log = Logger.getLogger(MimParser.class);
    private String mimFileName;
    private String currMO;
    private String ctrName;
    private String attributeName;
    private ArrayList<String> attributes;
    private String dataType = "";
    private String structNm = "";
    private String structMemberNm = "";
    private String atbStrutRefNm = "";
    private boolean isAttribute;
    private boolean isdataType = false;
    private boolean isStMembr = false;
    private HashMap<String, ArrayList<String>> moAttributesMap = new HashMap<String, ArrayList<String>>();
    private HashMap<String, ArrayList<String>> structRef = new HashMap<String, ArrayList<String>>();
    private ArrayList<String> stLst = new ArrayList<String>();
    public ArrayList<String> mimDataList = null;

    public MimParser(final String mimFileName) {
        mimDataList = new ArrayList<String>();
        this.mimFileName = mimFileName;
        this.currMO = "Unknown";
        this.attributes = new ArrayList<String>();
        initReader();
        genConfigFile();
    }

    @Override
    public void startElement(final String uri, final String tag, final String qName, final Attributes attributes) throws SAXException {
        if (qName.equals("class")) {
            this.currMO = attributes.getValue(0);
        } else if (qName.equals("attribute")) {
            if (attributes.getValue(0).indexOf("pm") != 0) {
                this.attributeName = attributes.getValue(0);
                this.isAttribute = true;
            }
        } else if (qName.equals("struct")) {
            this.structNm = attributes.getValue(0);
        } else if (qName.equals("structMember")) {
            this.structMemberNm = attributes.getValue(0);
            this.isStMembr = true;
        } else if (qName.equals("dataType")) {
            this.isdataType = true;
        } else if (this.isdataType) {
            if (qName.equals("structRef")) {
                this.atbStrutRefNm = attributes.getValue(0);
            }
            this.dataType = qName;
            this.isdataType = false;
        }
    }

    @Override
    public void endElement(final String uri, final String tag, final String qName) throws SAXException {
        if ((qName.equals("maxLength")) && (this.isAttribute)) {
            this.attributeName = (this.attributeName + "(" + this.ctrName.trim() + ")");
        } else if ((qName.equals("attribute")) && (this.isAttribute)) {
            if (this.dataType.equals("structRef")) {
                this.attributeName = (this.attributeName + "[" + this.dataType.trim() + "=" + this.atbStrutRefNm + "]");
            } else {
                this.attributeName = (this.attributeName + "[" + this.dataType.trim() + "]");
            }
            this.attributes.add(this.attributeName);
            this.isAttribute = false;
        } else if ((qName.equals("structMember")) && (this.isStMembr)) {
            this.stLst.add(this.structMemberNm);
            this.isStMembr = false;
        } else if (qName.equals("struct")) {
            this.structRef.put(this.structNm, this.stLst);
            this.stLst = new ArrayList<String>();
        } else if (qName.equals("class")) {
            processMOs();
        }
    }

    @Override
    public void characters(final char[] ch, final int start, final int length) throws SAXException {
        this.ctrName = new String(ch, start, length);
    }

    @Override
    public void endDocument() throws SAXException {
    }

    private void processMOs() {
        if (this.attributes.size() > 0) {
            this.moAttributesMap.put(this.currMO, this.attributes);
            this.attributes = new ArrayList<String>();
        }
    }

    public HashMap<String, ArrayList<String>> getMOsAttributes() {
        return this.moAttributesMap;
    }

    public HashMap<String, ArrayList<String>> getStructRef() {
        return this.structRef;
    }

    void initReader() {
        final MimParser localBcgXmlParser = this;

        final SAXParserFactory localSAXParserFactory = SAXParserFactory.newInstance();
        localSAXParserFactory.setValidating(true);
        try {
            localSAXParserFactory.setFeature("http://xml.org/sax/features/validation", false);
            localSAXParserFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
            localSAXParserFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            localSAXParserFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
            localSAXParserFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        } catch (final Exception exception) {
            log.error(exception);
        }
        try {
            final SAXParser localSAXParser = localSAXParserFactory.newSAXParser();
            localSAXParser.parse(new File(this.mimFileName), localBcgXmlParser);
        } catch (final SAXParseException localSAXParseException) {
            log.error("\n** Parsing error, line " + localSAXParseException.getLineNumber() + ", uri " + localSAXParseException.getSystemId());

            log.error("   " + localSAXParseException.getMessage());

            Object localObject = localSAXParseException;
            if (localSAXParseException.getException() != null) {
                localObject = localSAXParseException.getException();
            }
            log.error(localObject);
        } catch (final SAXException localSAXException) {
            Object localObject = localSAXException;
            if (localSAXException.getException() != null) {
                localObject = localSAXException.getException();
            }
            log.error(localObject);
        } catch (final ParserConfigurationException localParserConfigurationException) {
            log.error(localParserConfigurationException);
        } catch (final IOException localIOException) {
            log.error(localIOException);
        }
    }

    private void genConfigFile() {
        final HashMap<String, ArrayList<String>> localAttributesMap = getMOsAttributes();
        try {

            String mimData = null;
            String attributes = "";
            final ArrayList<String> localArrayList1 = new ArrayList<String>();
            int i = 0;
            String structAttributes = "";
            ArrayList<String> attributesList = null;
            for (final Iterator<String> localIterator = this.structRef.keySet().iterator(); localIterator.hasNext();) {
                final String str4 = localIterator.next();
                localArrayList1.add(str4);
            }
            String pmGroup;
            for (final Iterator<String> localIterator = localAttributesMap.keySet().iterator(); localIterator.hasNext();) {
                pmGroup = localIterator.next();
                attributesList = localAttributesMap.get(pmGroup);
                attributes = "";
                for (int j = 0; j < attributesList.size(); j++) {
                    if (j < attributesList.size() - 1) {
                        attributes = attributes + attributesList.get(j) + ";";
                    } else if (j == attributesList.size() - 1) {
                        attributes = attributes + attributesList.get(j);
                    }
                }
                if (i < localArrayList1.size()) {
                    final String structRefType = localArrayList1.get(i);
                    structAttributes = structRefType + ":";
                    for (int k = 0; k < this.structRef.get(structRefType).size(); k++) {
                        if (k == 0) {
                            structAttributes = structAttributes + this.structRef.get(structRefType).get(k);
                        } else {
                            structAttributes = structAttributes + ";" + this.structRef.get(structRefType).get(k);
                        }
                    }
                }
                i++;
                mimData = pmGroup + "," + "1," + attributesList.size() + "," + attributesList.size() + "," + attributes + "," + structAttributes;
                if (i == localArrayList1.size()) {
                    structAttributes = "";
                }

                mimDataList.add(mimData);

                attributes = null;
            }

        } catch (final Exception localIOException) {
            log.error(localIOException);
        }
    }

    public List<String> getMimData() {
        return mimDataList;

    }
}
