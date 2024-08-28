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
	@NamedQuery(name=NamedQueryHolder.SERVICE_IMPACT_COUNTER_EVENT_PARAMETER_MAPPING,query=NamedQueryHolder.SERVICE_IMPACT_COUNTER_EVENT_PARAMETER_MAPPING_QUERY)
})
@Table(name="service_impact_counter")
public class ServiceImpactCounter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="kpi_group")
	private String kpi_group;
	@Column(name="kpi_name")
	private String kpi_name;
	@Column(name="counters")
	private String counters;
	@Column(name="event")
	private String event;
	@Column(name="event_parameter")
	private String event_parameter;
	/**
	 * @return the kpi_group
	 */
	public String getKpi_group() {
		return kpi_group;
	}
	/**
	 * @param kpi_group the kpi_group to set
	 */
	public void setKpi_group(String kpi_group) {
		this.kpi_group = kpi_group;
	}
	/**
	 * @return the kpi_name
	 */
	public String getKpi_name() {
		return kpi_name;
	}
	/**
	 * @param kpi_name the kpi_name to set
	 */
	public void setKpi_name(String kpi_name) {
		this.kpi_name = kpi_name;
	}
	/**
	 * @return the counters
	 */
	public String getCounters() {
		return counters;
	}
	/**
	 * @param counters the counters to set
	 */
	public void setCounters(String counters) {
		this.counters = counters;
	}
	/**
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}
	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}
	/**
	 * @return the event_parameter
	 */
	public String getEvent_parameter() {
		return event_parameter;
	}
	/**
	 * @param event_parameter the event_parameter to set
	 */
	public void setEvent_parameter(String event_parameter) {
		this.event_parameter = event_parameter;
	}
	
	

}
