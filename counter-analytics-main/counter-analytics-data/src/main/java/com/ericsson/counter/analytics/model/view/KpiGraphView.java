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
package com.ericsson.counter.analytics.model.view;

public class KpiGraphView {
	private String erbs;
	private String eutrancellfdd;
	private String date_id;
	private Float actual;
	private Float predicted;
	private Float anom;
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
	 * @return the actual
	 */
	public Float getActual() {
		return actual;
	}
	/**
	 * @param actual the actual to set
	 */
	public void setActual(Float actual) {
		this.actual = actual;
	}
	/**
	 * @return the predicted
	 */
	public Float getPredicted() {
		return predicted;
	}
	/**
	 * @param predicted the predicted to set
	 */
	public void setPredicted(Float predicted) {
		this.predicted = predicted;
	}
	/**
	 * @return the anom
	 */
	public Float getAnom() {
		return anom;
	}
	/**
	 * @param anom the anom to set
	 */
	public void setAnom(Float anom) {
		this.anom = anom;
	}
	
	

}
