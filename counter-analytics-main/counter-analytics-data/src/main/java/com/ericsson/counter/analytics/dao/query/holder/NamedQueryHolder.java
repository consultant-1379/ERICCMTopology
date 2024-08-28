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
package com.ericsson.counter.analytics.dao.query.holder;

public interface NamedQueryHolder {
	/* Node List Query */
	public String NODELIST = "KpiInformation.getNodeList";
	public String NODELIST_QUERY = "select distinct(erbs) from KpiInformation k where k.date_id=?";

	/* Kpi Group Outlier Query */
	public String ACCESSBILITYOUTLIER = "KpiInformation.getAccessbilityOutlier";
	public String ACCESSBILITYOUTLIER_QUERY = "select date_id,erbs,eutrancellfdd,count(eutrancellfdd) from KpiInformation k where  date_id = ? and erbs = ? and ( accessibility_added_e_rab_establishment_success_rate_anom is not null OR accessibility_initial_e_rab_establishment_success_rate_anom is not null ) group by eutrancellfdd,date_id,erbs order by date_id";
	public String INTEGRITYOUTLIER = "KpiInformation.getIntegrityOutlier";
	public String INTEGRITYOUTLIER_QUERY = "select date_id,erbs,eutrancellfdd,count(eutrancellfdd) from KpiInformation k where date_id = ? and erbs = ? and ( integrity_average_dl_ue_latency_anom is not null OR integrity_average_dl_pdcp_ue_throughput_anom is not null OR integrity_ul_packet_loss_rate_anom is not null OR integrity_average_dl_pdcp_cell_throughput_anom is not null OR integrity_average_dl_mac_cell_throughput_anom is not null OR integrity_average_ul_pdcp_ue_throughput_anom is not null OR integrity_average_ul_pdcp_cell_throughput_anom is not null OR integrity_average_ul_mac_cell_throughput_anom is not null OR integrity_voip_integrity_anom is not null ) group by eutrancellfdd,date_id,erbs order by date_id ";
	public String RETAINBILITYOUTLIER = "KpiInformation.getRetainbilityOutlier";
	public String RETAINBILITYOUTLIER_QUERY = "select date_id,erbs,eutrancellfdd,count(eutrancellfdd) from KpiInformation k where date_id = ? and erbs = ? and ( retainability_e_rab_session_time_normalized_loss_rate_anom is not null OR retainability_e_rab_percentage_lost_anom is not null ) group by eutrancellfdd,date_id,erbs order by date_id";
	public String MOBILITYOUTLIER = "KpiInformation.getMobilityOutlier";
	public String MOBILITYOUTLIER_QUERY = "select date_id,erbs,eutrancellfdd,count(eutrancellfdd) from KpiInformation k where date_id = ? and erbs = ? and ( mobility_success_rate_anom is not null ) group by eutrancellfdd,date_id,erbs order by date_id";

	// KPI Information accessibility_initial_e_rab_establishment_success_rate
	public String ACCESSIBILITY_INITIAL_E_RAB_ESTABLISHMENT_SUCCESS_RATE = "KpiInformation.getAccessibilityInitialErabEstablishmentSuccessRateKpi";
	public String ACCESSIBILITY_INITIAL_E_RAB_ESTABLISHMENT_SUCCESS_RATE_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.accessibility_initial_e_rab_establishment_success_rate,0),COALESCE(k.accessibility_initial_e_rab_establishment_success_rate_predict,0),k.accessibility_initial_e_rab_establishment_success_rate_anom from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";
	// KPI Information accessibility_added_e_rab_establishment_success_rate
	public String ACCESSIBILITY_ADDED_E_RAB_ESTABLISHMENT_SUCCESS_RATE = "KpiInformation.getAccessibilityAddedErabEstablishmentSuccessRateKpi";
	public String ACCESSIBILITY_ADDED_E_RAB_ESTABLISHMENT_SUCCESS_RATE_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.accessibility_added_e_rab_establishment_success_rate,0),COALESCE(k.accessibility_added_e_rab_establishment_success_rate_predict,0),k.accessibility_added_e_rab_establishment_success_rate_anom from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";
	// KPI Information retainability_e_rab_session_time_normalized_loss_rate
	public String RETAINABILITY_E_RAB_SESSION_TIME_NORMALIZED_LOSS_RATE = "KpiInformation.getRetainabilityErabSessionTimeNormalizedLossRateKpi";
	public String RETAINABILITY_E_RAB_SESSION_TIME_NORMALIZED_LOSS_RATE_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.retainability_e_rab_session_time_normalized_loss_rate,0),COALESCE(k.retainability_e_rab_session_time_normalized_loss_rate_predict,0),k.retainability_e_rab_session_time_normalized_loss_rate_anom from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information retainability_e_rab_percentage_lost
	public String RETAINABILITY_E_RAB_PERCENTAGE_LOST = "KpiInformation.getRetainabilityErabPercentageLostKpi";
	public String RETAINABILITY_E_RAB_PERCENTAGE_LOST_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.retainability_e_rab_percentage_lost,0),COALESCE(k.retainability_e_rab_percentage_lost_predict,0),k.retainability_e_rab_percentage_lost_anom from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_average_dl_ue_latency
	public String INTEGRITY_AVERAGE_DL_UE_LATENCY = "KpiInformation.getIntegrityAverageDlUeLatencyKpi";
	public String INTEGRITY_AVERAGE_DL_UE_LATENCY_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_average_dl_ue_latency,0),COALESCE(k.integrity_average_dl_ue_latency_predict,0),k.integrity_average_dl_ue_latency_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_average_dl_pdcp_ue_throughput
	public String INTEGRITY_AVERAGE_DL_PDCP_UE_THROUGHPUT = "KpiInformation.getIntegrityAverageDlPdcpUeThroughputKpi";
	public String INTEGRITY_AVERAGE_DL_PDCP_UE_THROUGHPUT_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_average_dl_pdcp_ue_throughput,0),COALESCE(k.integrity_average_dl_pdcp_ue_throughput_predict,0),k.integrity_average_dl_pdcp_ue_throughput_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_ul_packet_loss_rate
	public String INTEGRITY_UL_PACKET_LOSS_RATE = "KpiInformation.getIntegrityUlPacketLossRateKpi";
	public String INTEGRITY_UL_PACKET_LOSS_RATE_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_ul_packet_loss_rate,0),COALESCE(k.integrity_ul_packet_loss_rate_predict,0),k.integrity_ul_packet_loss_rate_anom  from KpiInformation k  where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_average_dl_pdcp_cell_throughput
	public String INTEGRITY_AVERAGE_DL_PDCP_CELL_THROUGHPUT = "KpiInformation.getIntegrityAverageDlPdcpCellThroughputKpi";
	public String INTEGRITY_AVERAGE_DL_PDCP_CELL_THROUGHPUT_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_average_dl_pdcp_cell_throughput,0),COALESCE(k.integrity_average_dl_pdcp_cell_throughput_predict,0),k.integrity_average_dl_pdcp_cell_throughput_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_average_dl_mac_cell_throughput
	public String INTEGRITY_AVERAGE_DL_MAC_CELL_THROUGHPUT = "KpiInformation.getIntegrityAverageDlMacCellThroughputKpi";
	public String INTEGRITY_AVERAGE_DL_MAC_CELL_THROUGHPUT_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_average_dl_mac_cell_throughput,0),COALESCE(k.integrity_average_dl_mac_cell_throughput_predict,0),k.integrity_average_dl_mac_cell_throughput_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_average_ul_pdcp_ue_throughput
	public String INTEGRITY_AVERAGE_UL_PDCP_UE_THROUGHPUT = "KpiInformation.getIntegrityAverageUlPdcpUeThroughputKpi";
	public String INTEGRITY_AVERAGE_UL_PDCP_UE_THROUGHPUT_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_average_ul_pdcp_ue_throughput,0),COALESCE(k.integrity_average_ul_pdcp_ue_throughput_predict,0),k.integrity_average_ul_pdcp_ue_throughput_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_average_ul_pdcp_cell_throughput
	public String INTEGRITY_AVERAGE_UL_PDCP_CELL_THROUGHPUT = "KpiInformation.getIntegrityAverageUlPdcpCellThroughputKpi";
	public String INTEGRITY_AVERAGE_UL_PDCP_CELL_THROUGHPUT_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_average_ul_pdcp_cell_throughput,0),COALESCE(k.integrity_average_ul_pdcp_cell_throughput_predict,0),k.integrity_average_ul_pdcp_cell_throughput_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_average_ul_mac_cell_throughput
	public String INTEGRITY_AVERAGE_UL_MAC_CELL_THROUGHPUT = "KpiInformation.getIntegrityAverageUlMacCellThroughputKpi";
	public String INTEGRITY_AVERAGE_UL_MAC_CELL_THROUGHPUT_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_average_ul_mac_cell_throughput,0),COALESCE(k.integrity_average_ul_mac_cell_throughput_predict,0),k.integrity_average_ul_mac_cell_throughput_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information integrity_voip_integrity
	public String INTEGRITY_VOIP_INTEGRITY = "KpiInformation.getIntegrityVoipIntegrityKpi";
	public String INTEGRITY_VOIP_INTEGRITY_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.integrity_voip_integrity,0),COALESCE(k.integrity_voip_integrity_predict,0),k.integrity_voip_integrity_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information mobility_success_rate
	public String MOBILITY_SUCCESS_RATE = "KpiInformation.getMobilitySuccessRateKpi";
	public String MOBILITY_SUCCESS_RATE_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.mobility_success_rate,0),COALESCE(k.mobility_success_rate_predict,0),k.mobility_success_rate_anom  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";

	// KPI Information availability_partial_cell_availability
	public String AVAILABILITY_PARTIAL_CELL_AVAILABILITY = "KpiInformation.getAvailabilityPartialCellAvailabilityKpi";
	public String AVAILABILITY_PARTIAL_CELL_AVAILABILITY_QUERY = "select k.erbs,k.eutrancellfdd,k.datetime_id,COALESCE(k.availability_partial_cell_availability,0),COALESCE(k.availability_partial_cell_availability_predict,0)  from KpiInformation k where k.date_id =? and k.eutrancellfdd=?  order by k.datetime_id";
	
	//COrealted Kpi Information 
	public String COREALTED_KPI="CorelatedKpiInformation.getCorelatedKpi";
	public String COREALTED_KPI_QUERY="select k.kpi_name,k.corelated_kpi from CorelatedKpiInformation k where k.kpi_group=? and k.kpi_name=?";
	/* Cell Availibility*/
	public String CELL_AVAILIBILITY_PER_NODE="KpiInformation.getCellAvailibilityByNode";
	public String CELL_AVAILIBILITY_PER_NODE_QUERY="select k.erbs,k.datetime_id,avg(availability_partial_cell_availability) from KpiInformation k where k.date_id =? and k.erbs = ?  group by datetime_id ,erbs order by datetime_id";
	public String CELL_AVAILIBILITY_PER_CELL="KpiInformation.getCellAvailibilityByCell";
	public String CELL_AVAILIBILITY_PER_CELL_QUERY="select k.erbs,k.eutrancellfdd,k.datetime_id,avg(availability_partial_cell_availability) from KpiInformation k where k.date_id =? and k.eutrancellfdd = ? group by datetime_id ,erbs,eutrancellfdd order by datetime_id";
	
	/* Service Impact Cell wise*/
	public String SERVICE_IMPACT="EutranCellFdd.getServiceImpactCounterData";
	public String SERVICE_IMPACT_QUERY="select e.pmActiveUeDlSum,e.pmActiveUeUlSum,e.pmPdcpVolDlDrb,e.pmUeThpVolUl,e.pmSessionTimeUe, e.datetime_id,e.eutrancellfdd from EutranCellFdd e where e.date_id=? and e.eutrancellfdd=? and e.datetime_id=?";
	public String KPI_EVENT_PARAMETER="KpiEventParameter.getKpiEventParameter";
	public String KPI_EVENT_PARAMETER_QUERY="select k.counter,k.events,k.local_event_counter_parameter from KpiEventParameter k where k.kpi_name=?";
	public String SERVICE_IMPACT_COUNTER_EVENT_PARAMETER_MAPPING="ServiceImpactCounter.getServiceImpactCounterEventParameterMapping";
	public String SERVICE_IMPACT_COUNTER_EVENT_PARAMETER_MAPPING_QUERY="select s.counters,s.event,s.event_parameter from ServiceImpactCounter s";
	
	/* GRID VIEW */
	public String GRID_VIEW="KpiInformation.getCellAvailibilityGridView";
	public String GRID_VIEW_QUERY="Select eutrancellfdd,availability_partial_cell_availability from KpiInformation k where k.date_id =? and k.erbs=? group by k.eutrancellfdd,k.availability_partial_cell_availability order by k.eutrancellfdd";
	
	
	
	

}
