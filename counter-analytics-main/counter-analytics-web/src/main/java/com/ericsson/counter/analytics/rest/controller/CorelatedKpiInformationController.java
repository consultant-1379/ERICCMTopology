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

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.*;

import com.ericsson.counter.analytics.model.view.CorelatedKpiInformationView;
import com.ericsson.counter.analytics.service.ICorelatedKpiInformationService;

@CrossOrigin
@RestController
public class CorelatedKpiInformationController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ICorelatedKpiInformationService iCorelatedKpiInformationService;
	
	@RequestMapping(value="/getCorelatedKpi",method=RequestMethod.GET,headers="Accept=application/json")
	public List<CorelatedKpiInformationView> getCorelatedKpi(@RequestParam("kpi_group")String kpi_group,@RequestParam("kpi_name")String kpi_name) {
		List<CorelatedKpiInformationView> corelatedKpiInformationData=iCorelatedKpiInformationService.getCorelatedKpi(kpi_group, kpi_name);
		return corelatedKpiInformationData;
		
	}

}
