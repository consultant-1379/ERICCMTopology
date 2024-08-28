/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.counter.analytics.service;

import java.util.List;

import com.ericsson.counter.analytics.model.view.CorelatedKpiInformationView;

public interface ICorelatedKpiInformationService {

	public List<CorelatedKpiInformationView> getCorelatedKpi(String kpi_group,String kpi_name);
}
