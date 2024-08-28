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

import java.io.File;

import javax.xml.stream.*;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;

public class LoadUserInputXMLService {
    static Logger log = Logger.getLogger(LoadUserInputXMLService.class);

    public static <T> T loadXmlToJavaObjects(final File xmlConfigFile, final String configJAXBpkgName) {

        final XMLInputFactory xif = XMLInputFactory.newInstance();
        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        XMLStreamReader xmlConfigFis = null;
        try {
            xmlConfigFis = xif.createXMLStreamReader(new StreamSource(xmlConfigFile));
        } catch (final XMLStreamException e) {
            throw new RuntimeException(String.format("Can't load XML file %s", xmlConfigFile.getName()), e);

        }
        XmlLoader xmlConfigLoader = null;
        xmlConfigLoader = new XmlLoader(configJAXBpkgName);

        return xmlConfigLoader.loadXml(xmlConfigFis);
    }

}
