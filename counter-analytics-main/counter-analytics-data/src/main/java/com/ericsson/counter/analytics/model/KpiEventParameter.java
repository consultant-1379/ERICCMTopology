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
	@NamedQuery(name=NamedQueryHolder.KPI_EVENT_PARAMETER,query=NamedQueryHolder.KPI_EVENT_PARAMETER_QUERY)
})
@Table(name="kpi_event_parameter")
public class KpiEventParameter implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="kpi_name")
	private String kpi_name;
	@Column(name="counter")
	private String counter;
	@Column(name="events")
	private String events;
	@Column(name="local_event_filter_parameter")
	private String local_event_filter_parameter;
	@Column(name="local_event_counter_parameter")
	private String local_event_counter_parameter;
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
	 * @return the counter
	 */
	public String getCounter() {
		return counter;
	}
	/**
	 * @param counter the counter to set
	 */
	public void setCounter(String counter) {
		this.counter = counter;
	}
	/**
	 * @return the events
	 */
	public String getEvents() {
		return events;
	}
	/**
	 * @param events the events to set
	 */
	public void setEvents(String events) {
		this.events = events;
	}
	/**
	 * @return the local_event_filter_parameter
	 */
	public String getLocal_event_filter_parameter() {
		return local_event_filter_parameter;
	}
	/**
	 * @param local_event_filter_parameter the local_event_filter_parameter to set
	 */
	public void setLocal_event_filter_parameter(String local_event_filter_parameter) {
		this.local_event_filter_parameter = local_event_filter_parameter;
	}
	/**
	 * @return the local_event_counter_parameter
	 */
	public String getLocal_event_counter_parameter() {
		return local_event_counter_parameter;
	}
	/**
	 * @param local_event_counter_parameter the local_event_counter_parameter to set
	 */
	public void setLocal_event_counter_parameter(
			String local_event_counter_parameter) {
		this.local_event_counter_parameter = local_event_counter_parameter;
	}
	
	

}
