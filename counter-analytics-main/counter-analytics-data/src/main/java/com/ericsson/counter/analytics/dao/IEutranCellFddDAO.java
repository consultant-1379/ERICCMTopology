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

public interface IEutranCellFddDAO {
	public List<?> getServiceImpactCounterData(String date_id,String eutrancellfdd,String datetime_id,String query);
	public List<?> getKpiCountereventParameterData(String date_id,String eutrancellfdd, String datetime_id,String query);

}
