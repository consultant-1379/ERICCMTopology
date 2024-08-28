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

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ericsson.counter.analytics.common.Constant;
import com.ericsson.counter.analytics.dao.impl.KpiInformationDAO;
import com.ericsson.counter.analytics.dao.query.holder.NamedQueryHolder;
import com.ericsson.counter.analytics.model.view.*;
import com.ericsson.counter.analytics.service.IKpiInformationService;

@Service
@Named
@Transactional(readOnly = true)
public class KpiInformationService implements IKpiInformationService, Constant,
		NamedQueryHolder {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ericsson.counter.analytics.service.IKpiInformationService#
	 * getAccessbilityOutlier(java.lang.String, java.lang.String)
	 */
	@Inject
	KpiInformationDAO kpiInformationDAO;

	@Transactional(readOnly = false)
	public List<OutlierView> getKpiGroupOutliers(String kpi_group,
			String date_id, String erbs) {
		String namedQuery = "";
		if (kpi_group.equalsIgnoreCase(MOBILITY_KPI_GROUP)) {
			namedQuery = MOBILITYOUTLIER;
		} else if (kpi_group.equalsIgnoreCase(ACCESSBILITY_KPI_GROUP)) {
			namedQuery = ACCESSBILITYOUTLIER;
		} else if (kpi_group.equalsIgnoreCase(INTEGRITY_KPI_GROUP)) {
			namedQuery = INTEGRITYOUTLIER;
		} else if (kpi_group.equalsIgnoreCase(RETAINABILITY_KPI_GROUP)) {
			namedQuery = RETAINBILITYOUTLIER;
		}
		List<OutlierView> outlierViews = new ArrayList<OutlierView>();
		OutlierView outlierView = null;
		List<?> queryList = kpiInformationDAO.getKpiGroupOutliers(namedQuery,
				date_id, erbs);
		if (null != queryList) {
			for (Object resultSets : queryList) {
				outlierView = new OutlierView();
				Object[] resultSet = (Object[]) resultSets;
				outlierView.setDate_id((String) resultSet[0]);
				outlierView.setErbs((String) resultSet[1]);
				outlierView.setCell((String) resultSet[2]);
				outlierView.setOutlier((Long) resultSet[3]);
				outlierViews.add(outlierView);
			}
		}
		return outlierViews;
	}

	public List<String> getNodeList(String date_id) {
		@SuppressWarnings("unchecked")
		List<String> nodeList = (List<String>) kpiInformationDAO.getNodeList(date_id);
		return nodeList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ericsson.counter.analytics.service.IKpiInformationService#getKpiGraphData
	 * (java.lang.String, java.lang.String, java.lang.String)
	 */
	public List<KpiGraphView> getKpiGraphData(String kpi_name, String date_id,
			String eutrancellfdd) {
		List<KpiGraphView> kpiGraphViews = new ArrayList<KpiGraphView>();
		String namedQuery = "";
		if (kpi_name
				.equals(ACCESSIBILITY_INITIAL_E_RAB_ESTABLISHMENT_SUCCESS_RATE_KPI)) {
			namedQuery = ACCESSIBILITY_INITIAL_E_RAB_ESTABLISHMENT_SUCCESS_RATE;
		} else if (kpi_name
				.equals(ACCESSIBILITY_ADDED_E_RAB_ESTABLISHMENT_SUCCESS_RATE_KPI)) {
			namedQuery = ACCESSIBILITY_ADDED_E_RAB_ESTABLISHMENT_SUCCESS_RATE;
		} else if (kpi_name
				.equals(INTEGRITY_AVERAGE_DL_MAC_CELL_THROUGHPUT_KPI)) {
			namedQuery = INTEGRITY_AVERAGE_DL_MAC_CELL_THROUGHPUT;
		} else if (kpi_name
				.equals(INTEGRITY_AVERAGE_DL_PDCP_CELL_THROUGHPUT_KPI)) {
			namedQuery = INTEGRITY_AVERAGE_DL_PDCP_CELL_THROUGHPUT;
		} else if (kpi_name.equals(INTEGRITY_AVERAGE_DL_PDCP_UE_THROUGHPUT_KPI)) {
			namedQuery = INTEGRITY_AVERAGE_DL_PDCP_UE_THROUGHPUT;
		} else if (kpi_name.equals(INTEGRITY_AVERAGE_DL_UE_LATENCY_KPI)) {
			namedQuery = INTEGRITY_AVERAGE_DL_UE_LATENCY;
		} else if (kpi_name
				.equals(INTEGRITY_AVERAGE_UL_MAC_CELL_THROUGHPUT_KPI)) {
			namedQuery = INTEGRITY_AVERAGE_UL_MAC_CELL_THROUGHPUT;
		} else if (kpi_name
				.equals(INTEGRITY_AVERAGE_UL_PDCP_CELL_THROUGHPUT_KPI)) {
			namedQuery = INTEGRITY_AVERAGE_UL_PDCP_CELL_THROUGHPUT;
		} else if (kpi_name.equals(INTEGRITY_AVERAGE_UL_PDCP_UE_THROUGHPUT_KPI)) {
			namedQuery = INTEGRITY_AVERAGE_UL_PDCP_UE_THROUGHPUT;
		} else if (kpi_name.equals(INTEGRITY_UL_PACKET_LOSS_RATE_KPI)) {
			namedQuery = INTEGRITY_UL_PACKET_LOSS_RATE;
		} else if (kpi_name.equals(INTEGRITY_VOIP_INTEGRITY_KPI)) {
			namedQuery = INTEGRITY_VOIP_INTEGRITY;
		} else if (kpi_name.equals(MOBILITY_SUCCESS_RATE_KPI)) {
			namedQuery = MOBILITY_SUCCESS_RATE_KPI;
		} else if (kpi_name.equals(RETAINABILITY_E_RAB_PERCENTAGE_LOST_KPI)) {
			namedQuery = RETAINABILITY_E_RAB_PERCENTAGE_LOST;
		} else if (kpi_name
				.equals(RETAINABILITY_E_RAB_SESSION_TIME_NORMALIZED_LOSS_RATE_KPI)) {
			namedQuery = RETAINABILITY_E_RAB_SESSION_TIME_NORMALIZED_LOSS_RATE;
		}
		List<?> queryList = kpiInformationDAO.getKpiGraphData(namedQuery,
				date_id, eutrancellfdd);
		if (null != queryList) {
			for (Object resultSets : queryList) {
				KpiGraphView kpiGraphView = new KpiGraphView();
				Object[] resultSet = (Object[]) resultSets;
				kpiGraphView.setErbs((String) resultSet[0]);
				kpiGraphView.setEutrancellfdd((String) resultSet[1]);
				kpiGraphView.setDate_id((String) resultSet[2]);
				kpiGraphView.setActual((Float) resultSet[3]);
				kpiGraphView.setPredicted((Float) resultSet[4]);
				kpiGraphView.setAnom((Float) resultSet[5]);
				kpiGraphViews.add(kpiGraphView);
			}
		}
		return kpiGraphViews;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ericsson.counter.analytics.service.IKpiInformationService#
	 * getCellAvailibilityByNode(java.lang.String, java.lang.String)
	 */
	public List<CellAvailabilityView> getCellAvailibilityByNode(String date_id,
			String erbs) {
		List<CellAvailabilityView> cellAvailabilityViews = new ArrayList<CellAvailabilityView>();
		CellAvailabilityView cellAvailabilityView = null;
		// TODO Auto-generated method stub
		List<?> queryList = kpiInformationDAO.getCellAvailibilityByNode(
				date_id, erbs);
		if (null != queryList) {
			for (Object resultSets : queryList) {
				cellAvailabilityView = new CellAvailabilityView();
				Object[] resultSet = (Object[]) resultSets;
				cellAvailabilityView.setErbs((String) resultSet[0]);
				cellAvailabilityView.setCell(null);
				cellAvailabilityView.setDatetime_id((String) resultSet[1]);
				cellAvailabilityView
						.setCell_availability((Double) resultSet[2]);
				cellAvailabilityViews.add(cellAvailabilityView);
			}
		}
		return cellAvailabilityViews;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ericsson.counter.analytics.service.IKpiInformationService#
	 * getCellAvailibilityByCell(java.lang.String, java.lang.String)
	 */
	public List<CellAvailabilityView> getCellAvailibilityByCell(String date_id,
			String eutrancellfdd) {
		// TODO Auto-generated method stub
		List<CellAvailabilityView> cellAvailabilityViews = new ArrayList<CellAvailabilityView>();
		CellAvailabilityView cellAvailabilityView = null;
		// TODO Auto-generated method stub
		List<?> queryList = kpiInformationDAO.getCellAvailibilityByCell(
				date_id, eutrancellfdd);
		if (null != queryList) {
			for (Object resultSets : queryList) {
				cellAvailabilityView = new CellAvailabilityView();
				Object[] resultSet = (Object[]) resultSets;
				cellAvailabilityView.setErbs((String) resultSet[0]);
				cellAvailabilityView.setCell((String) resultSet[1]);
				cellAvailabilityView.setDatetime_id((String) resultSet[2]);
				cellAvailabilityView
						.setCell_availability((Double) resultSet[3]);
				cellAvailabilityViews.add(cellAvailabilityView);
			}
		}
		return cellAvailabilityViews;
	}

	/* (non-Javadoc)
	 * @see com.ericsson.counter.analytics.service.IKpiInformationService#getCellAvailibilityGridView(java.lang.String, java.lang.String)
	 */
	public List<CellAvailibilityGridView> getCellAvailibilityGridView(
			String date_id, String erbs) {
		// TODO Auto-generated method stub
		List<CellAvailibilityGridView> cellAvailibilityGridViews = new ArrayList<CellAvailibilityGridView>();
		CellAvailibilityGridView cellAvailibilityGridView=null;
		// TODO Auto-generated method stub
		List<?> queryList = kpiInformationDAO.getCellAvailibilityGridView(date_id, erbs);
		if (null != queryList) {
			for (Object resultSets : queryList) {
				cellAvailibilityGridView = new CellAvailibilityGridView();
				Object[] resultSet = (Object[]) resultSets;
				cellAvailibilityGridView.setCell((String) resultSet[0]);
				cellAvailibilityGridView.setAvailibilityPercentage((Float) resultSet[1]);
				cellAvailibilityGridViews.add(cellAvailibilityGridView);
			}
		}
		return cellAvailibilityGridViews;
	}

	
}
