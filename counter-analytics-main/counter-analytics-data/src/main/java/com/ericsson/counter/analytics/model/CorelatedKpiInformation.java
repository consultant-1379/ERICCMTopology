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
@NamedQueries({ @NamedQuery(name = NamedQueryHolder.COREALTED_KPI, query = NamedQueryHolder.COREALTED_KPI_QUERY) })
@Table(name = "corelated_kpi_information")
public class CorelatedKpiInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="kpi_group")
	private String kpi_group;
	@Column(name="kpi_name")
	private String kpi_name;
	@Column(name="corelated_kpi")
	private String corelated_kpi;
	@Column(name="coefficient")
	private Float coefficient;
	@Column(name="priority")
	private Integer priority;

	/**
	 * @return the kpi_group
	 */
	public String getKpi_group() {
		return kpi_group;
	}

	/**
	 * @param kpi_group
	 *            the kpi_group to set
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
	 * @param kpi_name
	 *            the kpi_name to set
	 */
	public void setKpi_name(String kpi_name) {
		this.kpi_name = kpi_name;
	}

	/**
	 * @return the corelated_kpi
	 */
	public String getCorelated_kpi() {
		return corelated_kpi;
	}

	/**
	 * @param corelated_kpi
	 *            the corelated_kpi to set
	 */
	public void setCorelated_kpi(String corelated_kpi) {
		this.corelated_kpi = corelated_kpi;
	}

	/**
	 * @return the coefficient
	 */
	public Float getCoefficient() {
		return coefficient;
	}

	/**
	 * @param coefficient
	 *            the coefficient to set
	 */
	public void setCoefficient(Float coefficient) {
		this.coefficient = coefficient;
	}

	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}
