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
package com.ericsson.counter.analytics.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.WordUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ericsson.counter.analytics.common.Constant;
import com.ericsson.counter.analytics.dao.ICorelatedKpiInformationDAO;
import com.ericsson.counter.analytics.model.view.CorelatedKpiInformationView;
import com.ericsson.counter.analytics.service.ICorelatedKpiInformationService;

@Service
@Named
@Transactional(readOnly = true)
public class CorelatedKpiInformationService implements
		ICorelatedKpiInformationService, Constant {

	@Inject
	private ICorelatedKpiInformationDAO iCorelatedKpiInformationDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ericsson.counter.analytics.service.ICorelatedKpiInformationService
	 * #getCorelatedKpi(java.lang.String, java.lang.String)
	 */
	public List<CorelatedKpiInformationView> getCorelatedKpi(String kpi_group,
			String kpi_name) {
		List<CorelatedKpiInformationView> corelatedKpiInformationViews = new ArrayList<CorelatedKpiInformationView>();
		CorelatedKpiInformationView corelatedKpiInformationView = null;
		// TODO Auto-generated method stub
		List<?> corelatedKpiInformationData = iCorelatedKpiInformationDAO
				.getCorelatedKpi(kpi_group, kpi_name);
		if (null != corelatedKpiInformationData) {
			for (Object corelatedKpiInformationDataSet : corelatedKpiInformationData) {
				Object[] corelatedKpiInformationDataSets = (Object[]) corelatedKpiInformationDataSet;
				corelatedKpiInformationView = new CorelatedKpiInformationView();
				String kpi_id = (String) corelatedKpiInformationDataSets[1];
				corelatedKpiInformationView.setCorelated_kpi_id(kpi_id);
				String corelated_kpi_name = WordUtils.capitalize(kpi_id
						.replaceAll(UNDERSCORE, SPACE));
				corelatedKpiInformationView
						.setCorelated_kpi_name(corelated_kpi_name);
				corelatedKpiInformationViews.add(corelatedKpiInformationView);

			}
		}
		return corelatedKpiInformationViews;
	}

}
