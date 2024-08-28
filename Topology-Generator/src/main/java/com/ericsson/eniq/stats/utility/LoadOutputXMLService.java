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

import java.io.File;

import javax.xml.stream.*;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;

public class LoadOutputXMLService {
    static Logger log = Logger.getLogger(LoadOutputXMLService.class);

    public static <T> T loadXmlToJavaObjects(final File xmlConfigFile, final String configJAXBpkgName) {

        final XMLInputFactory xif = XMLInputFactory.newInstance();
        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        XMLStreamReader xmlConfigFis = null;
        try {
            xmlConfigFis = xif.createXMLStreamReader(new StreamSource(xmlConfigFile));
        } catch (final XMLStreamException e) {
            log.error(e + "  Exit from the process.");
            System.exit(0);
        }
        XmlLoader xmlConfigLoader = null;
        xmlConfigLoader = new XmlLoader(configJAXBpkgName);
        return xmlConfigLoader.loadXml(xmlConfigFis);
    }

}
