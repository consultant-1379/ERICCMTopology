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

import java.util.*;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ericsson.counter.analytics.dao.*;
import com.ericsson.counter.analytics.model.view.ServiceImpactCounterDataView;
import com.ericsson.counter.analytics.service.IEutranCellFddService;

@Service
@Named
@Transactional(readOnly = true)
public class EutranCellFddService implements IEutranCellFddService {

	@Inject
	IEutranCellFddDAO eutranCellFddDAO;
	@Inject
	IKpiEventParameterDAO kpiEventParameterDAO;
	@Inject
	IServiceImpactCounterDAO iServiceImpactCounterDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ericsson.counter.analytics.service.IEutranCellFddService#
	 * getServiceImpactCounterData(java.lang.String, java.lang.String)
	 */
	public List<ServiceImpactCounterDataView> getServiceImpactCounterData(
			String date_id, String eutrancellfdd, String datetime_id) {
		
		List<ServiceImpactCounterDataView> counterDataViews = new ArrayList<ServiceImpactCounterDataView>();
		ServiceImpactCounterDataView serviceImpactCounterDataView = null;
		List<String> countersList=new ArrayList<String>();
		List<String> eventList=new ArrayList<String>();
		List<String> parametersList=new ArrayList<String>();
		List<?> list=iServiceImpactCounterDAO.getServiceImpactCounterEventParameterMapping();
		if(null !=list) {
			for (Object obj : list) {
				Object[] objects = (Object[]) obj;
				countersList.add((String)objects[0]);
				eventList.add((String)objects[1]);
				parametersList.add((String)objects[2]);
				
			}
			List<?> couterDataList = eutranCellFddDAO.getServiceImpactCounterData(date_id,eutrancellfdd, datetime_id,queryBuilder(countersList));
			if(null !=couterDataList) {
				for (Object obj : couterDataList) {
					Object[] objects = (Object[]) obj;
					int size=countersList.size();
					for(int i=0;i<size;i++) {
						serviceImpactCounterDataView=new ServiceImpactCounterDataView();
						serviceImpactCounterDataView.setCounterName(countersList.get(i));
						serviceImpactCounterDataView.setEventName(eventList.get(i));
						serviceImpactCounterDataView.setParameter(parametersList.get(i));
						serviceImpactCounterDataView.setCounterValue((String)objects[i]);
						serviceImpactCounterDataView.setCellName((String)objects[size]);
						serviceImpactCounterDataView.setDatetime_id((String)objects[size+1]);
						counterDataViews.add(serviceImpactCounterDataView);
						
					}
				}
			}
		}
		



		return counterDataViews;
	}
	
	public List<ServiceImpactCounterDataView> getKpiEventParameterData(String date_id,String eutrancellfdd,String datetime_id,String kpi_name) {
		List<?> list=kpiEventParameterDAO.getKpiEventParameter(kpi_name);
		List<ServiceImpactCounterDataView> counterDataViews=new ArrayList<ServiceImpactCounterDataView>();
		ServiceImpactCounterDataView serviceImpactCounterDataView=null;
		List<String> countersList=new ArrayList<String>();
		List<String> eventList=new ArrayList<String>();
		List<String> parametersList=new ArrayList<String>();
		if(null !=list) {
			for (Object obj : list) {
				Object[] objects = (Object[]) obj;
				countersList.add((String)objects[0]);
				eventList.add((String)objects[1]);
				parametersList.add((String)objects[2]);
				
			}
			List<?> couterDataList=eutranCellFddDAO.getKpiCountereventParameterData(date_id, eutrancellfdd, datetime_id, queryBuilder(countersList));
			if(null !=couterDataList) {
				for (Object obj : couterDataList) {
					Object[] objects = (Object[]) obj;
					int size=countersList.size();
					for(int i=0;i<size;i++) {
						serviceImpactCounterDataView=new ServiceImpactCounterDataView();
						serviceImpactCounterDataView.setCounterName(countersList.get(i));
						serviceImpactCounterDataView.setEventName(eventList.get(i));
						serviceImpactCounterDataView.setParameter(parametersList.get(i));
						serviceImpactCounterDataView.setCounterValue((String)objects[i]);
						serviceImpactCounterDataView.setCellName((String)objects[size]);
						serviceImpactCounterDataView.setDatetime_id((String)objects[size+1]);
						counterDataViews.add(serviceImpactCounterDataView);
						
					}
				}
			}
		}
		
		
		return counterDataViews;
	}
	public static String queryBuilder(List<String> counterList) {
		StringBuilder sb=new StringBuilder();
		sb.append("select ");
		for(String counters:counterList) {
			sb.append("e."+counters+",");
		}
		sb.append("e.eutrancellfdd,e.datetime_id");
		String query=sb.toString();
		query=query+" from EutranCellFdd e where e.date_id=? and e.eutrancellfdd=? and e.datetime_id=? order by datetime_id";
		return query;
		
	}


}
