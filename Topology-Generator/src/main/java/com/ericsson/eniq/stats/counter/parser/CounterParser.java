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
package com.ericsson.eniq.stats.counter.parser;

import java.io.File;
import java.util.*;

import org.apache.log4j.Logger;

import com.ericsson.eniq.stats.parser.cppcounter.jaxb.*;
import com.ericsson.eniq.stats.parser.ecimcounter.jaxb.*;
import com.ericsson.eniq.stats.parser.ecimcounter.jaxb.MeasCollecFile.MeasData.MeasInfo;
import com.ericsson.eniq.stats.parser.ecimcounter.jaxb.MeasCollecFile.MeasData.MeasInfo.MeasValue;
import com.ericsson.eniq.stats.utility.Constant;
import com.ericsson.eniq.stats.utility.Utility;

public class CounterParser implements Constant {
    static Logger log = Logger.getLogger(CounterParser.class);

    public Map<String, List<String>> prepareMOList(final String network, final File counterFileXml, final String nodeType) {
        final Map<String, List<String>> pmGroupMapping = new HashMap<String, List<String>>();
        List<String> moList;
        if (counterFileXml != null) {
            if (nodeType.equalsIgnoreCase(ERBS) || nodeType.equalsIgnoreCase(RBS) || nodeType.equalsIgnoreCase(RNC)) {
                final Mdc mdc = Utility.loadXmlToJavaObjects(counterFileXml, CPP_COUNTER_JAXB_PACKAGE);
                for (final Md md : mdc.getMd()) {
                    for (final Mv mv : md.getMi().getMv()) {
                        final String moId = mv.getMoid();
                        final String lastFdn = Utility.lastFdn(moId);
                        if (pmGroupMapping.get(lastFdn) == null) {
                            moList = new ArrayList<String>();
                            moList.add(moId);
                            pmGroupMapping.put(lastFdn, moList);
                        } else {
                            pmGroupMapping.get(lastFdn).add(moId);
                        }

                    }

                }
            } else if (nodeType.equalsIgnoreCase(MSRBS_V2) || nodeType.equalsIgnoreCase(PRBS)) {
                final MeasCollecFile measCollectFile = Utility.loadXmlToJavaObjects(counterFileXml, ECIM_COUNTER_JAXB_PACKAGE);
                for (final MeasInfo measInfo : measCollectFile.getMeasData().getMeasInfo()) {
                    for (final MeasValue measValue : measInfo.getMeasValue()) {
                        final String measObjLdn = measValue.getMeasObjLdn();
                        final String lastFdn = Utility.lastFdn(measObjLdn);
                        if (pmGroupMapping.get(lastFdn) == null) {
                            moList = new ArrayList<String>();
                            moList.add(measObjLdn);
                            pmGroupMapping.put(lastFdn, moList);
                        } else {
                            pmGroupMapping.get(lastFdn).add(measObjLdn);
                        }

                    }
                }

            }
        }
        return pmGroupMapping;
    }
}
