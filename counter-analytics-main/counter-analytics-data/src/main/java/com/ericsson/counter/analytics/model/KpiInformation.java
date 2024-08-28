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
package com.ericsson.counter.analytics.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Entity;

import com.ericsson.counter.analytics.dao.query.holder.NamedQueryHolder;

@Entity
@NamedQueries({
	@NamedQuery(name=NamedQueryHolder.ACCESSBILITYOUTLIER,query=NamedQueryHolder.ACCESSBILITYOUTLIER_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITYOUTLIER,query=NamedQueryHolder.INTEGRITYOUTLIER_QUERY),
	@NamedQuery(name=NamedQueryHolder.MOBILITYOUTLIER,query=NamedQueryHolder.MOBILITYOUTLIER_QUERY),
	@NamedQuery(name=NamedQueryHolder.RETAINBILITYOUTLIER,query=NamedQueryHolder.RETAINBILITYOUTLIER_QUERY),
	@NamedQuery(name=NamedQueryHolder.NODELIST,query=NamedQueryHolder.NODELIST_QUERY),
	@NamedQuery(name=NamedQueryHolder.ACCESSIBILITY_INITIAL_E_RAB_ESTABLISHMENT_SUCCESS_RATE,query=NamedQueryHolder.ACCESSIBILITY_INITIAL_E_RAB_ESTABLISHMENT_SUCCESS_RATE_QUERY),
	@NamedQuery(name=NamedQueryHolder.ACCESSIBILITY_ADDED_E_RAB_ESTABLISHMENT_SUCCESS_RATE,query=NamedQueryHolder.ACCESSIBILITY_ADDED_E_RAB_ESTABLISHMENT_SUCCESS_RATE_QUERY),
	@NamedQuery(name=NamedQueryHolder.RETAINABILITY_E_RAB_SESSION_TIME_NORMALIZED_LOSS_RATE,query=NamedQueryHolder.RETAINABILITY_E_RAB_SESSION_TIME_NORMALIZED_LOSS_RATE_QUERY),
	@NamedQuery(name=NamedQueryHolder.RETAINABILITY_E_RAB_PERCENTAGE_LOST,query=NamedQueryHolder.RETAINABILITY_E_RAB_PERCENTAGE_LOST_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_AVERAGE_DL_UE_LATENCY,query=NamedQueryHolder.INTEGRITY_AVERAGE_DL_UE_LATENCY_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_AVERAGE_DL_PDCP_UE_THROUGHPUT,query=NamedQueryHolder.INTEGRITY_AVERAGE_DL_PDCP_UE_THROUGHPUT_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_UL_PACKET_LOSS_RATE,query=NamedQueryHolder.INTEGRITY_UL_PACKET_LOSS_RATE_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_AVERAGE_DL_PDCP_CELL_THROUGHPUT,query=NamedQueryHolder.INTEGRITY_AVERAGE_DL_PDCP_CELL_THROUGHPUT_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_AVERAGE_DL_MAC_CELL_THROUGHPUT,query=NamedQueryHolder.INTEGRITY_AVERAGE_DL_MAC_CELL_THROUGHPUT_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_AVERAGE_UL_PDCP_UE_THROUGHPUT,query=NamedQueryHolder.INTEGRITY_AVERAGE_UL_PDCP_UE_THROUGHPUT_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_AVERAGE_UL_PDCP_CELL_THROUGHPUT,query=NamedQueryHolder.INTEGRITY_AVERAGE_UL_PDCP_CELL_THROUGHPUT_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_AVERAGE_UL_MAC_CELL_THROUGHPUT,query=NamedQueryHolder.INTEGRITY_AVERAGE_UL_MAC_CELL_THROUGHPUT_QUERY),
	@NamedQuery(name=NamedQueryHolder.INTEGRITY_VOIP_INTEGRITY,query=NamedQueryHolder.INTEGRITY_VOIP_INTEGRITY_QUERY),
	@NamedQuery(name=NamedQueryHolder.MOBILITY_SUCCESS_RATE,query=NamedQueryHolder.MOBILITY_SUCCESS_RATE_QUERY),
	@NamedQuery(name=NamedQueryHolder.CELL_AVAILIBILITY_PER_NODE,query=NamedQueryHolder.CELL_AVAILIBILITY_PER_NODE_QUERY),
	@NamedQuery(name=NamedQueryHolder.CELL_AVAILIBILITY_PER_CELL,query=NamedQueryHolder.CELL_AVAILIBILITY_PER_CELL_QUERY),
	@NamedQuery(name=NamedQueryHolder.GRID_VIEW,query=NamedQueryHolder.GRID_VIEW_QUERY)

})
@Table(name="kpi_information_latest")
public class KpiInformation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="erbs")
	private String erbs;
	@Column(name="eutrancellfdd")
	private String eutrancellfdd;
	@Column(name="nesw")
	private String nesw;
	@Column(name="datetime_id")
	private String datetime_id;
	@Column(name="date_id")
	private String date_id;
	@Column(name="month_id")
	private String month_id;
	@Column(name="day_id")
	private String day_id;
	@Column(name="hour_id")
	private String hour_id;
	@Column(name="min_id")
	private String min_id;
	@Column(name="moid")
	private String moid;
	@Column(name="accessibility_initial_e_rab_establishment_success_rate")
	private Float accessibility_initial_e_rab_establishment_success_rate;
	@Column(name="accessibility_initial_e_rab_establishment_success_rate_predict")
	private Float accessibility_initial_e_rab_establishment_success_rate_predict;
	@Column(name="accessibility_added_e_rab_establishment_success_rate")
	private Float accessibility_added_e_rab_establishment_success_rate;
	@Column(name="accessibility_added_e_rab_establishment_success_rate_predict")
	private Float accessibility_added_e_rab_establishment_success_rate_predict;
	@Column(name="retainability_e_rab_session_time_normalized_loss_rate")
	private Float retainability_e_rab_session_time_normalized_loss_rate;
	@Column(name="retainability_e_rab_session_time_normalized_loss_rate_predict")
	private Float retainability_e_rab_session_time_normalized_loss_rate_predict;
	@Column(name="retainability_e_rab_percentage_lost")
	private Float retainability_e_rab_percentage_lost;
	@Column(name="retainability_e_rab_percentage_lost_predict")
	private Float retainability_e_rab_percentage_lost_predict;
	@Column(name="integrity_average_dl_ue_latency")
	private Float integrity_average_dl_ue_latency;
	@Column(name="integrity_average_dl_ue_latency_predict")
	private Float integrity_average_dl_ue_latency_predict;
	@Column(name="integrity_average_dl_pdcp_ue_throughput")
	private Float integrity_average_dl_pdcp_ue_throughput;
	@Column(name="integrity_average_dl_pdcp_ue_throughput_predict")
	private Float integrity_average_dl_pdcp_ue_throughput_predict;
	@Column(name="integrity_ul_packet_loss_rate")
	private Float integrity_ul_packet_loss_rate;
	@Column(name="integrity_ul_packet_loss_rate_predict")
	private Float integrity_ul_packet_loss_rate_predict;
	@Column(name="integrity_average_dl_pdcp_cell_throughput")
	private Float integrity_average_dl_pdcp_cell_throughput;
	@Column(name="integrity_average_dl_pdcp_cell_throughput_predict")
	private Float integrity_average_dl_pdcp_cell_throughput_predict;
	@Column(name="integrity_average_dl_mac_cell_throughput")
	private Float integrity_average_dl_mac_cell_throughput;
	@Column(name="integrity_average_dl_mac_cell_throughput_predict")
	private Float integrity_average_dl_mac_cell_throughput_predict;
	@Column(name="integrity_average_ul_pdcp_ue_throughput")
	private Float integrity_average_ul_pdcp_ue_throughput;
	@Column(name="integrity_average_ul_pdcp_ue_throughput_predict")
	private Float integrity_average_ul_pdcp_ue_throughput_predict;
	@Column(name="integrity_average_ul_pdcp_cell_throughput")
	private Float integrity_average_ul_pdcp_cell_throughput;
	@Column(name="integrity_average_ul_pdcp_cell_throughput_predict")
	private Float integrity_average_ul_pdcp_cell_throughput_predict;
	@Column(name="integrity_average_ul_mac_cell_throughput")
	private Float integrity_average_ul_mac_cell_throughput;
	@Column(name="integrity_average_ul_mac_cell_throughput_predict")
	private Float integrity_average_ul_mac_cell_throughput_predict;
	@Column(name="integrity_voip_integrity")
	private Float integrity_voip_integrity;
	@Column(name="integrity_voip_integrity_predict")
	private Float integrity_voip_integrity_predict;
	@Column(name="mobility_success_rate")
	private Float mobility_success_rate;
	@Column(name="mobility_success_rate_predict")
	private Float mobility_success_rate_predict;
	@Column(name="availability_partial_cell_availability")
	private Float availability_partial_cell_availability;
	@Column(name="availability_partial_cell_availability_predict")
	private Float availability_partial_cell_availability_predict;
	@Column(name="accessibility_added_e_rab_establishment_success_rate_anom")
	private Float accessibility_added_e_rab_establishment_success_rate_anom;
	@Column(name="accessibility_initial_e_rab_establishment_success_rate_anom")
	private Float accessibility_initial_e_rab_establishment_success_rate_anom;
	@Column(name="retainability_e_rab_session_time_normalized_loss_rate_anom")
	private Float retainability_e_rab_session_time_normalized_loss_rate_anom;
	@Column(name="retainability_e_rab_percentage_lost_anom")
	private Float retainability_e_rab_percentage_lost_anom;
	@Column(name="integrity_average_dl_ue_latency_anom")
	private Float integrity_average_dl_ue_latency_anom;
	@Column(name="integrity_average_dl_pdcp_ue_throughput_anom")
	private Float integrity_average_dl_pdcp_ue_throughput_anom;
	@Column(name="integrity_ul_packet_loss_rate_anom")
	private Float integrity_ul_packet_loss_rate_anom;
	@Column(name="integrity_average_dl_pdcp_cell_throughput_anom")
	private Float integrity_average_dl_pdcp_cell_throughput_anom;
	@Column(name="integrity_average_dl_mac_cell_throughput_anom")
	private Float integrity_average_dl_mac_cell_throughput_anom;
	@Column(name="integrity_average_ul_pdcp_ue_throughput_anom")
	private Float integrity_average_ul_pdcp_ue_throughput_anom;
	@Column(name="integrity_average_ul_pdcp_cell_throughput_anom")
	private Float integrity_average_ul_pdcp_cell_throughput_anom;
	@Column(name="integrity_average_ul_mac_cell_throughput_anom")
	private Float integrity_average_ul_mac_cell_throughput_anom;
	@Column(name="integrity_voip_integrity_anom")
	private Float integrity_voip_integrity_anom;
	@Column(name="mobility_success_rate_anom")
	private Float mobility_success_rate_anom;
	@Column(name="availability_partial_cell_availability_anom")
	private Float availability_partial_cell_availability_anom;
	/**
	 * @return the erbs
	 */
	public String getErbs() {
		return erbs;
	}
	/**
	 * @param erbs the erbs to set
	 */
	public void setErbs(String erbs) {
		this.erbs = erbs;
	}
	/**
	 * @return the eutrancellfdd
	 */
	public String getEutrancellfdd() {
		return eutrancellfdd;
	}
	/**
	 * @param eutrancellfdd the eutrancellfdd to set
	 */
	public void setEutrancellfdd(String eutrancellfdd) {
		this.eutrancellfdd = eutrancellfdd;
	}
	/**
	 * @return the nesw
	 */
	public String getNesw() {
		return nesw;
	}
	/**
	 * @param nesw the nesw to set
	 */
	public void setNesw(String nesw) {
		this.nesw = nesw;
	}
	/**
	 * @return the datetime_id
	 */
	public String getDatetime_id() {
		return datetime_id;
	}
	/**
	 * @param datetime_id the datetime_id to set
	 */
	public void setDatetime_id(String datetime_id) {
		this.datetime_id = datetime_id;
	}
	/**
	 * @return the date_id
	 */
	public String getDate_id() {
		return date_id;
	}
	/**
	 * @param date_id the date_id to set
	 */
	public void setDate_id(String date_id) {
		this.date_id = date_id;
	}
	/**
	 * @return the month_id
	 */
	public String getMonth_id() {
		return month_id;
	}
	/**
	 * @param month_id the month_id to set
	 */
	public void setMonth_id(String month_id) {
		this.month_id = month_id;
	}
	/**
	 * @return the day_id
	 */
	public String getDay_id() {
		return day_id;
	}
	/**
	 * @param day_id the day_id to set
	 */
	public void setDay_id(String day_id) {
		this.day_id = day_id;
	}
	/**
	 * @return the hour_id
	 */
	public String getHour_id() {
		return hour_id;
	}
	/**
	 * @param hour_id the hour_id to set
	 */
	public void setHour_id(String hour_id) {
		this.hour_id = hour_id;
	}
	/**
	 * @return the min_id
	 */
	public String getMin_id() {
		return min_id;
	}
	/**
	 * @param min_id the min_id to set
	 */
	public void setMin_id(String min_id) {
		this.min_id = min_id;
	}
	/**
	 * @return the moid
	 */
	public String getMoid() {
		return moid;
	}
	/**
	 * @param moid the moid to set
	 */
	public void setMoid(String moid) {
		this.moid = moid;
	}
	/**
	 * @return the accessibility_initial_e_rab_establishment_success_rate
	 */
	public Float getAccessibility_initial_e_rab_establishment_success_rate() {
		return accessibility_initial_e_rab_establishment_success_rate;
	}
	/**
	 * @param accessibility_initial_e_rab_establishment_success_rate the accessibility_initial_e_rab_establishment_success_rate to set
	 */
	public void setAccessibility_initial_e_rab_establishment_success_rate(
			Float accessibility_initial_e_rab_establishment_success_rate) {
		this.accessibility_initial_e_rab_establishment_success_rate = accessibility_initial_e_rab_establishment_success_rate;
	}
	/**
	 * @return the accessibility_initial_e_rab_establishment_success_rate_predict
	 */
	public Float getAccessibility_initial_e_rab_establishment_success_rate_predict() {
		return accessibility_initial_e_rab_establishment_success_rate_predict;
	}
	/**
	 * @param accessibility_initial_e_rab_establishment_success_rate_predict the accessibility_initial_e_rab_establishment_success_rate_predict to set
	 */
	public void setAccessibility_initial_e_rab_establishment_success_rate_predict(
			Float accessibility_initial_e_rab_establishment_success_rate_predict) {
		this.accessibility_initial_e_rab_establishment_success_rate_predict = accessibility_initial_e_rab_establishment_success_rate_predict;
	}
	/**
	 * @return the accessibility_added_e_rab_establishment_success_rate
	 */
	public Float getAccessibility_added_e_rab_establishment_success_rate() {
		return accessibility_added_e_rab_establishment_success_rate;
	}
	/**
	 * @param accessibility_added_e_rab_establishment_success_rate the accessibility_added_e_rab_establishment_success_rate to set
	 */
	public void setAccessibility_added_e_rab_establishment_success_rate(
			Float accessibility_added_e_rab_establishment_success_rate) {
		this.accessibility_added_e_rab_establishment_success_rate = accessibility_added_e_rab_establishment_success_rate;
	}
	/**
	 * @return the accessibility_added_e_rab_establishment_success_rate_predict
	 */
	public Float getAccessibility_added_e_rab_establishment_success_rate_predict() {
		return accessibility_added_e_rab_establishment_success_rate_predict;
	}
	/**
	 * @param accessibility_added_e_rab_establishment_success_rate_predict the accessibility_added_e_rab_establishment_success_rate_predict to set
	 */
	public void setAccessibility_added_e_rab_establishment_success_rate_predict(
			Float accessibility_added_e_rab_establishment_success_rate_predict) {
		this.accessibility_added_e_rab_establishment_success_rate_predict = accessibility_added_e_rab_establishment_success_rate_predict;
	}
	/**
	 * @return the retainability_e_rab_session_time_normalized_loss_rate
	 */
	public Float getRetainability_e_rab_session_time_normalized_loss_rate() {
		return retainability_e_rab_session_time_normalized_loss_rate;
	}
	/**
	 * @param retainability_e_rab_session_time_normalized_loss_rate the retainability_e_rab_session_time_normalized_loss_rate to set
	 */
	public void setRetainability_e_rab_session_time_normalized_loss_rate(
			Float retainability_e_rab_session_time_normalized_loss_rate) {
		this.retainability_e_rab_session_time_normalized_loss_rate = retainability_e_rab_session_time_normalized_loss_rate;
	}
	/**
	 * @return the retainability_e_rab_session_time_normalized_loss_rate_predict
	 */
	public Float getRetainability_e_rab_session_time_normalized_loss_rate_predict() {
		return retainability_e_rab_session_time_normalized_loss_rate_predict;
	}
	/**
	 * @param retainability_e_rab_session_time_normalized_loss_rate_predict the retainability_e_rab_session_time_normalized_loss_rate_predict to set
	 */
	public void setRetainability_e_rab_session_time_normalized_loss_rate_predict(
			Float retainability_e_rab_session_time_normalized_loss_rate_predict) {
		this.retainability_e_rab_session_time_normalized_loss_rate_predict = retainability_e_rab_session_time_normalized_loss_rate_predict;
	}
	/**
	 * @return the retainability_e_rab_percentage_lost
	 */
	public Float getRetainability_e_rab_percentage_lost() {
		return retainability_e_rab_percentage_lost;
	}
	/**
	 * @param retainability_e_rab_percentage_lost the retainability_e_rab_percentage_lost to set
	 */
	public void setRetainability_e_rab_percentage_lost(
			Float retainability_e_rab_percentage_lost) {
		this.retainability_e_rab_percentage_lost = retainability_e_rab_percentage_lost;
	}
	/**
	 * @return the retainability_e_rab_percentage_lost_predict
	 */
	public Float getRetainability_e_rab_percentage_lost_predict() {
		return retainability_e_rab_percentage_lost_predict;
	}
	/**
	 * @param retainability_e_rab_percentage_lost_predict the retainability_e_rab_percentage_lost_predict to set
	 */
	public void setRetainability_e_rab_percentage_lost_predict(
			Float retainability_e_rab_percentage_lost_predict) {
		this.retainability_e_rab_percentage_lost_predict = retainability_e_rab_percentage_lost_predict;
	}
	/**
	 * @return the integrity_average_dl_ue_latency
	 */
	public Float getIntegrity_average_dl_ue_latency() {
		return integrity_average_dl_ue_latency;
	}
	/**
	 * @param integrity_average_dl_ue_latency the integrity_average_dl_ue_latency to set
	 */
	public void setIntegrity_average_dl_ue_latency(
			Float integrity_average_dl_ue_latency) {
		this.integrity_average_dl_ue_latency = integrity_average_dl_ue_latency;
	}
	/**
	 * @return the integrity_average_dl_ue_latency_predict
	 */
	public Float getIntegrity_average_dl_ue_latency_predict() {
		return integrity_average_dl_ue_latency_predict;
	}
	/**
	 * @param integrity_average_dl_ue_latency_predict the integrity_average_dl_ue_latency_predict to set
	 */
	public void setIntegrity_average_dl_ue_latency_predict(
			Float integrity_average_dl_ue_latency_predict) {
		this.integrity_average_dl_ue_latency_predict = integrity_average_dl_ue_latency_predict;
	}
	/**
	 * @return the integrity_average_dl_pdcp_ue_throughput
	 */
	public Float getIntegrity_average_dl_pdcp_ue_throughput() {
		return integrity_average_dl_pdcp_ue_throughput;
	}
	/**
	 * @param integrity_average_dl_pdcp_ue_throughput the integrity_average_dl_pdcp_ue_throughput to set
	 */
	public void setIntegrity_average_dl_pdcp_ue_throughput(
			Float integrity_average_dl_pdcp_ue_throughput) {
		this.integrity_average_dl_pdcp_ue_throughput = integrity_average_dl_pdcp_ue_throughput;
	}
	/**
	 * @return the integrity_average_dl_pdcp_ue_throughput_predict
	 */
	public Float getIntegrity_average_dl_pdcp_ue_throughput_predict() {
		return integrity_average_dl_pdcp_ue_throughput_predict;
	}
	/**
	 * @param integrity_average_dl_pdcp_ue_throughput_predict the integrity_average_dl_pdcp_ue_throughput_predict to set
	 */
	public void setIntegrity_average_dl_pdcp_ue_throughput_predict(
			Float integrity_average_dl_pdcp_ue_throughput_predict) {
		this.integrity_average_dl_pdcp_ue_throughput_predict = integrity_average_dl_pdcp_ue_throughput_predict;
	}
	/**
	 * @return the integrity_ul_packet_loss_rate
	 */
	public Float getIntegrity_ul_packet_loss_rate() {
		return integrity_ul_packet_loss_rate;
	}
	/**
	 * @param integrity_ul_packet_loss_rate the integrity_ul_packet_loss_rate to set
	 */
	public void setIntegrity_ul_packet_loss_rate(Float integrity_ul_packet_loss_rate) {
		this.integrity_ul_packet_loss_rate = integrity_ul_packet_loss_rate;
	}
	/**
	 * @return the integrity_ul_packet_loss_rate_predict
	 */
	public Float getIntegrity_ul_packet_loss_rate_predict() {
		return integrity_ul_packet_loss_rate_predict;
	}
	/**
	 * @param integrity_ul_packet_loss_rate_predict the integrity_ul_packet_loss_rate_predict to set
	 */
	public void setIntegrity_ul_packet_loss_rate_predict(
			Float integrity_ul_packet_loss_rate_predict) {
		this.integrity_ul_packet_loss_rate_predict = integrity_ul_packet_loss_rate_predict;
	}
	/**
	 * @return the integrity_average_dl_pdcp_cell_throughput
	 */
	public Float getIntegrity_average_dl_pdcp_cell_throughput() {
		return integrity_average_dl_pdcp_cell_throughput;
	}
	/**
	 * @param integrity_average_dl_pdcp_cell_throughput the integrity_average_dl_pdcp_cell_throughput to set
	 */
	public void setIntegrity_average_dl_pdcp_cell_throughput(
			Float integrity_average_dl_pdcp_cell_throughput) {
		this.integrity_average_dl_pdcp_cell_throughput = integrity_average_dl_pdcp_cell_throughput;
	}
	/**
	 * @return the integrity_average_dl_pdcp_cell_throughput_predict
	 */
	public Float getIntegrity_average_dl_pdcp_cell_throughput_predict() {
		return integrity_average_dl_pdcp_cell_throughput_predict;
	}
	/**
	 * @param integrity_average_dl_pdcp_cell_throughput_predict the integrity_average_dl_pdcp_cell_throughput_predict to set
	 */
	public void setIntegrity_average_dl_pdcp_cell_throughput_predict(
			Float integrity_average_dl_pdcp_cell_throughput_predict) {
		this.integrity_average_dl_pdcp_cell_throughput_predict = integrity_average_dl_pdcp_cell_throughput_predict;
	}
	/**
	 * @return the integrity_average_dl_mac_cell_throughput
	 */
	public Float getIntegrity_average_dl_mac_cell_throughput() {
		return integrity_average_dl_mac_cell_throughput;
	}
	/**
	 * @param integrity_average_dl_mac_cell_throughput the integrity_average_dl_mac_cell_throughput to set
	 */
	public void setIntegrity_average_dl_mac_cell_throughput(
			Float integrity_average_dl_mac_cell_throughput) {
		this.integrity_average_dl_mac_cell_throughput = integrity_average_dl_mac_cell_throughput;
	}
	/**
	 * @return the integrity_average_dl_mac_cell_throughput_predict
	 */
	public Float getIntegrity_average_dl_mac_cell_throughput_predict() {
		return integrity_average_dl_mac_cell_throughput_predict;
	}
	/**
	 * @param integrity_average_dl_mac_cell_throughput_predict the integrity_average_dl_mac_cell_throughput_predict to set
	 */
	public void setIntegrity_average_dl_mac_cell_throughput_predict(
			Float integrity_average_dl_mac_cell_throughput_predict) {
		this.integrity_average_dl_mac_cell_throughput_predict = integrity_average_dl_mac_cell_throughput_predict;
	}
	/**
	 * @return the integrity_average_ul_pdcp_ue_throughput
	 */
	public Float getIntegrity_average_ul_pdcp_ue_throughput() {
		return integrity_average_ul_pdcp_ue_throughput;
	}
	/**
	 * @param integrity_average_ul_pdcp_ue_throughput the integrity_average_ul_pdcp_ue_throughput to set
	 */
	public void setIntegrity_average_ul_pdcp_ue_throughput(
			Float integrity_average_ul_pdcp_ue_throughput) {
		this.integrity_average_ul_pdcp_ue_throughput = integrity_average_ul_pdcp_ue_throughput;
	}
	/**
	 * @return the integrity_average_ul_pdcp_ue_throughput_predict
	 */
	public Float getIntegrity_average_ul_pdcp_ue_throughput_predict() {
		return integrity_average_ul_pdcp_ue_throughput_predict;
	}
	/**
	 * @param integrity_average_ul_pdcp_ue_throughput_predict the integrity_average_ul_pdcp_ue_throughput_predict to set
	 */
	public void setIntegrity_average_ul_pdcp_ue_throughput_predict(
			Float integrity_average_ul_pdcp_ue_throughput_predict) {
		this.integrity_average_ul_pdcp_ue_throughput_predict = integrity_average_ul_pdcp_ue_throughput_predict;
	}
	/**
	 * @return the integrity_average_ul_pdcp_cell_throughput
	 */
	public Float getIntegrity_average_ul_pdcp_cell_throughput() {
		return integrity_average_ul_pdcp_cell_throughput;
	}
	/**
	 * @param integrity_average_ul_pdcp_cell_throughput the integrity_average_ul_pdcp_cell_throughput to set
	 */
	public void setIntegrity_average_ul_pdcp_cell_throughput(
			Float integrity_average_ul_pdcp_cell_throughput) {
		this.integrity_average_ul_pdcp_cell_throughput = integrity_average_ul_pdcp_cell_throughput;
	}
	/**
	 * @return the integrity_average_ul_pdcp_cell_throughput_predict
	 */
	public Float getIntegrity_average_ul_pdcp_cell_throughput_predict() {
		return integrity_average_ul_pdcp_cell_throughput_predict;
	}
	/**
	 * @param integrity_average_ul_pdcp_cell_throughput_predict the integrity_average_ul_pdcp_cell_throughput_predict to set
	 */
	public void setIntegrity_average_ul_pdcp_cell_throughput_predict(
			Float integrity_average_ul_pdcp_cell_throughput_predict) {
		this.integrity_average_ul_pdcp_cell_throughput_predict = integrity_average_ul_pdcp_cell_throughput_predict;
	}
	/**
	 * @return the integrity_average_ul_mac_cell_throughput
	 */
	public Float getIntegrity_average_ul_mac_cell_throughput() {
		return integrity_average_ul_mac_cell_throughput;
	}
	/**
	 * @param integrity_average_ul_mac_cell_throughput the integrity_average_ul_mac_cell_throughput to set
	 */
	public void setIntegrity_average_ul_mac_cell_throughput(
			Float integrity_average_ul_mac_cell_throughput) {
		this.integrity_average_ul_mac_cell_throughput = integrity_average_ul_mac_cell_throughput;
	}
	/**
	 * @return the integrity_average_ul_mac_cell_throughput_predict
	 */
	public Float getIntegrity_average_ul_mac_cell_throughput_predict() {
		return integrity_average_ul_mac_cell_throughput_predict;
	}
	/**
	 * @param integrity_average_ul_mac_cell_throughput_predict the integrity_average_ul_mac_cell_throughput_predict to set
	 */
	public void setIntegrity_average_ul_mac_cell_throughput_predict(
			Float integrity_average_ul_mac_cell_throughput_predict) {
		this.integrity_average_ul_mac_cell_throughput_predict = integrity_average_ul_mac_cell_throughput_predict;
	}
	/**
	 * @return the integrity_voip_integrity
	 */
	public Float getIntegrity_voip_integrity() {
		return integrity_voip_integrity;
	}
	/**
	 * @param integrity_voip_integrity the integrity_voip_integrity to set
	 */
	public void setIntegrity_voip_integrity(Float integrity_voip_integrity) {
		this.integrity_voip_integrity = integrity_voip_integrity;
	}
	/**
	 * @return the integrity_voip_integrity_predict
	 */
	public Float getIntegrity_voip_integrity_predict() {
		return integrity_voip_integrity_predict;
	}
	/**
	 * @param integrity_voip_integrity_predict the integrity_voip_integrity_predict to set
	 */
	public void setIntegrity_voip_integrity_predict(
			Float integrity_voip_integrity_predict) {
		this.integrity_voip_integrity_predict = integrity_voip_integrity_predict;
	}
	/**
	 * @return the mobility_success_rate
	 */
	public Float getMobility_success_rate() {
		return mobility_success_rate;
	}
	/**
	 * @param mobility_success_rate the mobility_success_rate to set
	 */
	public void setMobility_success_rate(Float mobility_success_rate) {
		this.mobility_success_rate = mobility_success_rate;
	}
	/**
	 * @return the mobility_success_rate_predict
	 */
	public Float getMobility_success_rate_predict() {
		return mobility_success_rate_predict;
	}
	/**
	 * @param mobility_success_rate_predict the mobility_success_rate_predict to set
	 */
	public void setMobility_success_rate_predict(Float mobility_success_rate_predict) {
		this.mobility_success_rate_predict = mobility_success_rate_predict;
	}
	/**
	 * @return the availability_partial_cell_availability
	 */
	public Float getAvailability_partial_cell_availability() {
		return availability_partial_cell_availability;
	}
	/**
	 * @param availability_partial_cell_availability the availability_partial_cell_availability to set
	 */
	public void setAvailability_partial_cell_availability(
			Float availability_partial_cell_availability) {
		this.availability_partial_cell_availability = availability_partial_cell_availability;
	}
	/**
	 * @return the availability_partial_cell_availability_predict
	 */
	public Float getAvailability_partial_cell_availability_predict() {
		return availability_partial_cell_availability_predict;
	}
	/**
	 * @param availability_partial_cell_availability_predict the availability_partial_cell_availability_predict to set
	 */
	public void setAvailability_partial_cell_availability_predict(
			Float availability_partial_cell_availability_predict) {
		this.availability_partial_cell_availability_predict = availability_partial_cell_availability_predict;
	}
	/**
	 * @return the accessibility_added_e_rab_establishment_success_rate_anom
	 */
	public Float getAccessibility_added_e_rab_establishment_success_rate_anom() {
		return accessibility_added_e_rab_establishment_success_rate_anom;
	}
	/**
	 * @param accessibility_added_e_rab_establishment_success_rate_anom the accessibility_added_e_rab_establishment_success_rate_anom to set
	 */
	public void setAccessibility_added_e_rab_establishment_success_rate_anom(
			Float accessibility_added_e_rab_establishment_success_rate_anom) {
		this.accessibility_added_e_rab_establishment_success_rate_anom = accessibility_added_e_rab_establishment_success_rate_anom;
	}
	/**
	 * @return the accessibility_initial_e_rab_establishment_success_rate_anom
	 */
	public Float getAccessibility_initial_e_rab_establishment_success_rate_anom() {
		return accessibility_initial_e_rab_establishment_success_rate_anom;
	}
	/**
	 * @param accessibility_initial_e_rab_establishment_success_rate_anom the accessibility_initial_e_rab_establishment_success_rate_anom to set
	 */
	public void setAccessibility_initial_e_rab_establishment_success_rate_anom(
			Float accessibility_initial_e_rab_establishment_success_rate_anom) {
		this.accessibility_initial_e_rab_establishment_success_rate_anom = accessibility_initial_e_rab_establishment_success_rate_anom;
	}
	/**
	 * @return the retainability_e_rab_session_time_normalized_loss_rate_anom
	 */
	public Float getRetainability_e_rab_session_time_normalized_loss_rate_anom() {
		return retainability_e_rab_session_time_normalized_loss_rate_anom;
	}
	/**
	 * @param retainability_e_rab_session_time_normalized_loss_rate_anom the retainability_e_rab_session_time_normalized_loss_rate_anom to set
	 */
	public void setRetainability_e_rab_session_time_normalized_loss_rate_anom(
			Float retainability_e_rab_session_time_normalized_loss_rate_anom) {
		this.retainability_e_rab_session_time_normalized_loss_rate_anom = retainability_e_rab_session_time_normalized_loss_rate_anom;
	}
	/**
	 * @return the retainability_e_rab_percentage_lost_anom
	 */
	public Float getRetainability_e_rab_percentage_lost_anom() {
		return retainability_e_rab_percentage_lost_anom;
	}
	/**
	 * @param retainability_e_rab_percentage_lost_anom the retainability_e_rab_percentage_lost_anom to set
	 */
	public void setRetainability_e_rab_percentage_lost_anom(
			Float retainability_e_rab_percentage_lost_anom) {
		this.retainability_e_rab_percentage_lost_anom = retainability_e_rab_percentage_lost_anom;
	}
	/**
	 * @return the integrity_average_dl_ue_latency_anom
	 */
	public Float getIntegrity_average_dl_ue_latency_anom() {
		return integrity_average_dl_ue_latency_anom;
	}
	/**
	 * @param integrity_average_dl_ue_latency_anom the integrity_average_dl_ue_latency_anom to set
	 */
	public void setIntegrity_average_dl_ue_latency_anom(
			Float integrity_average_dl_ue_latency_anom) {
		this.integrity_average_dl_ue_latency_anom = integrity_average_dl_ue_latency_anom;
	}
	/**
	 * @return the integrity_average_dl_pdcp_ue_throughput_anom
	 */
	public Float getIntegrity_average_dl_pdcp_ue_throughput_anom() {
		return integrity_average_dl_pdcp_ue_throughput_anom;
	}
	/**
	 * @param integrity_average_dl_pdcp_ue_throughput_anom the integrity_average_dl_pdcp_ue_throughput_anom to set
	 */
	public void setIntegrity_average_dl_pdcp_ue_throughput_anom(
			Float integrity_average_dl_pdcp_ue_throughput_anom) {
		this.integrity_average_dl_pdcp_ue_throughput_anom = integrity_average_dl_pdcp_ue_throughput_anom;
	}
	/**
	 * @return the integrity_ul_packet_loss_rate_anom
	 */
	public Float getIntegrity_ul_packet_loss_rate_anom() {
		return integrity_ul_packet_loss_rate_anom;
	}
	/**
	 * @param integrity_ul_packet_loss_rate_anom the integrity_ul_packet_loss_rate_anom to set
	 */
	public void setIntegrity_ul_packet_loss_rate_anom(
			Float integrity_ul_packet_loss_rate_anom) {
		this.integrity_ul_packet_loss_rate_anom = integrity_ul_packet_loss_rate_anom;
	}
	/**
	 * @return the integrity_average_dl_pdcp_cell_throughput_anom
	 */
	public Float getIntegrity_average_dl_pdcp_cell_throughput_anom() {
		return integrity_average_dl_pdcp_cell_throughput_anom;
	}
	/**
	 * @param integrity_average_dl_pdcp_cell_throughput_anom the integrity_average_dl_pdcp_cell_throughput_anom to set
	 */
	public void setIntegrity_average_dl_pdcp_cell_throughput_anom(
			Float integrity_average_dl_pdcp_cell_throughput_anom) {
		this.integrity_average_dl_pdcp_cell_throughput_anom = integrity_average_dl_pdcp_cell_throughput_anom;
	}
	/**
	 * @return the integrity_average_dl_mac_cell_throughput_anom
	 */
	public Float getIntegrity_average_dl_mac_cell_throughput_anom() {
		return integrity_average_dl_mac_cell_throughput_anom;
	}
	/**
	 * @param integrity_average_dl_mac_cell_throughput_anom the integrity_average_dl_mac_cell_throughput_anom to set
	 */
	public void setIntegrity_average_dl_mac_cell_throughput_anom(
			Float integrity_average_dl_mac_cell_throughput_anom) {
		this.integrity_average_dl_mac_cell_throughput_anom = integrity_average_dl_mac_cell_throughput_anom;
	}
	/**
	 * @return the integrity_average_ul_pdcp_ue_throughput_anom
	 */
	public Float getIntegrity_average_ul_pdcp_ue_throughput_anom() {
		return integrity_average_ul_pdcp_ue_throughput_anom;
	}
	/**
	 * @param integrity_average_ul_pdcp_ue_throughput_anom the integrity_average_ul_pdcp_ue_throughput_anom to set
	 */
	public void setIntegrity_average_ul_pdcp_ue_throughput_anom(
			Float integrity_average_ul_pdcp_ue_throughput_anom) {
		this.integrity_average_ul_pdcp_ue_throughput_anom = integrity_average_ul_pdcp_ue_throughput_anom;
	}
	/**
	 * @return the integrity_average_ul_pdcp_cell_throughput_anom
	 */
	public Float getIntegrity_average_ul_pdcp_cell_throughput_anom() {
		return integrity_average_ul_pdcp_cell_throughput_anom;
	}
	/**
	 * @param integrity_average_ul_pdcp_cell_throughput_anom the integrity_average_ul_pdcp_cell_throughput_anom to set
	 */
	public void setIntegrity_average_ul_pdcp_cell_throughput_anom(
			Float integrity_average_ul_pdcp_cell_throughput_anom) {
		this.integrity_average_ul_pdcp_cell_throughput_anom = integrity_average_ul_pdcp_cell_throughput_anom;
	}
	/**
	 * @return the integrity_average_ul_mac_cell_throughput_anom
	 */
	public Float getIntegrity_average_ul_mac_cell_throughput_anom() {
		return integrity_average_ul_mac_cell_throughput_anom;
	}
	/**
	 * @param integrity_average_ul_mac_cell_throughput_anom the integrity_average_ul_mac_cell_throughput_anom to set
	 */
	public void setIntegrity_average_ul_mac_cell_throughput_anom(
			Float integrity_average_ul_mac_cell_throughput_anom) {
		this.integrity_average_ul_mac_cell_throughput_anom = integrity_average_ul_mac_cell_throughput_anom;
	}
	/**
	 * @return the integrity_voip_integrity_anom
	 */
	public Float getIntegrity_voip_integrity_anom() {
		return integrity_voip_integrity_anom;
	}
	/**
	 * @param integrity_voip_integrity_anom the integrity_voip_integrity_anom to set
	 */
	public void setIntegrity_voip_integrity_anom(Float integrity_voip_integrity_anom) {
		this.integrity_voip_integrity_anom = integrity_voip_integrity_anom;
	}
	/**
	 * @return the mobility_success_rate_anom
	 */
	public Float getMobility_success_rate_anom() {
		return mobility_success_rate_anom;
	}
	/**
	 * @param mobility_success_rate_anom the mobility_success_rate_anom to set
	 */
	public void setMobility_success_rate_anom(Float mobility_success_rate_anom) {
		this.mobility_success_rate_anom = mobility_success_rate_anom;
	}
	/**
	 * @return the availability_partial_cell_availability_anom
	 */
	public Float getAvailability_partial_cell_availability_anom() {
		return availability_partial_cell_availability_anom;
	}
	/**
	 * @param availability_partial_cell_availability_anom the availability_partial_cell_availability_anom to set
	 */
	public void setAvailability_partial_cell_availability_anom(
			Float availability_partial_cell_availability_anom) {
		this.availability_partial_cell_availability_anom = availability_partial_cell_availability_anom;
	}
	
	

}
