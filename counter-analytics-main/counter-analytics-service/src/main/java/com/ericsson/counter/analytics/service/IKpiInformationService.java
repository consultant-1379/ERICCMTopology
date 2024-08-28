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

import com.ericsson.counter.analytics.model.view.*;

public interface IKpiInformationService {
	public List<String> getNodeList(String date_id);
	public List<KpiGraphView> getKpiGraphData(String kpi_name,String date_id,String eutrancellfdd);
	public List<OutlierView> getKpiGroupOutliers(String kpi_group,String date_id,String erbs);
	public List<CellAvailabilityView> getCellAvailibilityByNode(String date_id,String erbs);
	public List<CellAvailabilityView> getCellAvailibilityByCell(String date_id,String eutrancellfdd);
	public List<CellAvailibilityGridView> getCellAvailibilityGridView(String date_id,String erbs);

}
