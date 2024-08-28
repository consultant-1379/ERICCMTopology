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
package com.ericsson.counter.analytics.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import com.ericsson.counter.analytics.model.view.ServiceImpactCounterDataView;
import com.ericsson.counter.analytics.service.IEutranCellFddService;


@CrossOrigin
@RestController
public class EutranCellFddController {
	@Inject
	private IEutranCellFddService iEutranCellFddService;
	
	@RequestMapping(value="/getServiceImpactCounterData", method=RequestMethod.GET,headers="Accept=application/json")
	public List<ServiceImpactCounterDataView> getServiceImpactCounterData(@RequestParam("date_id")String date_id, @RequestParam("eutrancellfdd")String eutrancellfdd,@RequestParam("datetime_id")String datetime_id) {
		List<ServiceImpactCounterDataView> serviceImpactCounterDataViews=iEutranCellFddService.getServiceImpactCounterData(date_id, eutrancellfdd,datetime_id);
		return serviceImpactCounterDataViews;
	}
	
	@RequestMapping(value="/getKpiEventParameterData",method=RequestMethod.GET,headers="Accept=application/json")
	public List<ServiceImpactCounterDataView> getKpiEventParameterData(@RequestParam("date_id")String date_id,@RequestParam("eutrancellfdd")String eutrancellfdd,@RequestParam("datetime_id")String datetime_id,@RequestParam("kpi_name")String kpi_name) {
		List<ServiceImpactCounterDataView> serviceImpactCounterDataViews=iEutranCellFddService.getKpiEventParameterData(date_id, eutrancellfdd, datetime_id, kpi_name);
		return serviceImpactCounterDataViews;
	}

}
