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

import javax.xml.bind.*;
import javax.xml.stream.XMLStreamReader;

import org.apache.log4j.Logger;

public class XmlLoader {
    static Logger log = Logger.getLogger(XmlLoader.class);
    private JAXBContext jaxbContext;
    private Unmarshaller unmarshaller;

    public XmlLoader(final String packageName) {
        try {
            jaxbContext = JAXBContext.newInstance(packageName);
            unmarshaller = jaxbContext.createUnmarshaller();
        } catch (final JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T loadXml(final XMLStreamReader istrm) {
        try {
            return (T) unmarshaller.unmarshal(istrm);
        } catch (final JAXBException e) {
            throw new RuntimeException(e);
        }
    }

}
