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
package com.ericsson.eniq.stats.service.implementation;

import java.io.OutputStream;

import javax.xml.bind.*;

import org.apache.log4j.Logger;

import com.ericsson.eniq.stats.parser.topology.jaxb.Model;

public class XmlWriterService {
    static Logger log = Logger.getLogger(XmlWriterService.class);
    private final JAXBContext jaxbContext;

    private final Marshaller marshaller;

    public XmlWriterService(final String packageName) throws JAXBException {
        jaxbContext = JAXBContext.newInstance(packageName);
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
    }

    public void marshallCounter3GPPToGzipOutputFile(final Model topology3gppModel, final OutputStream outputStream) throws JAXBException {

        marshaller.marshal(topology3gppModel, outputStream);

    }

}
