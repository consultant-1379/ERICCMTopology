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
package com.ericsson.counter.analytics.dao;

import java.util.List;

public interface IKpiInformationDAO {
	
	public List<?> getNodeList(String date_id);
	public List<?> getKpiGroupOutliers(String namedQuery,String date_id,String erbs);
	public List<?> getKpiGraphData(String namedQuery, String date_id,String eutrancellfdd);
	public List<?> getCellAvailibilityByNode(String date_id,String erbs);
	public List<?> getCellAvailibilityByCell(String date_id,String eutrancellfdd);
	public List<?> getCellAvailibilityGridView(String date_id,String erbs);
}
