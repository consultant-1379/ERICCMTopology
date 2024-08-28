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

import org.springframework.web.bind.annotation.*;

import com.ericsson.counter.analytics.model.view.*;
import com.ericsson.counter.analytics.service.IKpiInformationService;

@CrossOrigin
@RestController
public class KpiInformationGraphController {
	@Inject
	private IKpiInformationService kpiInformationService;
	
	@RequestMapping(value="/getKpiGraphData",method=RequestMethod.GET,headers="Accept=application/json")
	public List<KpiGraphView> getKpiGraphData(@RequestParam("kpi_name")String kpi_name,@RequestParam("date_id")String date_id,@RequestParam("eutrancellfdd")String eutrancellfdd) {
		List<KpiGraphView> kpiGraphViews = kpiInformationService.getKpiGraphData(kpi_name, date_id, eutrancellfdd);
		return kpiGraphViews;
	}
	
	@RequestMapping(value = "/getKpiGroupOutliers", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<OutlierView> getKpiGroupOutliers(@RequestParam("kpi_group")String kpi_group,@RequestParam("date_id")String date_id,@RequestParam("erbs")String erbs) {
		List<OutlierView> outlierViews = kpiInformationService.getKpiGroupOutliers(kpi_group,date_id, erbs);	
		return outlierViews;
		
	}
	
	@RequestMapping(value="/getNodeList",method=RequestMethod.GET,headers="Accept=application/json")
	public List<String> getNodeList(@RequestParam("date_id")String date_id) {
		return kpiInformationService.getNodeList(date_id);
	}
	
	@RequestMapping(value="/getCellAvailibilityByNode",method=RequestMethod.GET,headers="Accept=application/json")
	public List<CellAvailabilityView> getCellAvailibilityByNode(@RequestParam("date_id")String date_id,@RequestParam("erbs")String erbs) {
		return kpiInformationService.getCellAvailibilityByNode(date_id, erbs);
	}
	
	@RequestMapping(value="/getCellAvailibilityByCell",method=RequestMethod.GET,headers="Accept=application/json")
	public List<CellAvailabilityView> getCellAvailibilityByCell(@RequestParam("date_id")String date_id,@RequestParam("eutrancellfdd")String eutrancellfdd) {
		return kpiInformationService.getCellAvailibilityByCell(date_id, eutrancellfdd);
	}
	
	@RequestMapping(value="/getCellAvailibilityGridView",method=RequestMethod.GET,headers="Accept=application/json")
	public List<CellAvailibilityGridView> getCellAvailibilityGridView(@RequestParam("date_id")String date_id,@RequestParam("erbs")String erbs) {
		return kpiInformationService.getCellAvailibilityGridView(date_id, erbs);
	}

}
