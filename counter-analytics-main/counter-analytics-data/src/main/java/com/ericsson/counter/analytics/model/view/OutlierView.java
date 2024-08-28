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

public class OutlierView {
	private String cell;
	private Long outlier;
	private String date_id ;
	private String erbs;
	/**
	 * @return the cell
	 */
	public String getCell() {
		return cell;
	}
	/**
	 * @param cell the cell to set
	 */
	public void setCell(String cell) {
		this.cell = cell;
	}
	/**
	 * @return the outlier
	 */
	public Long getOutlier() {
		return outlier;
	}
	/**
	 * @param outlier the outlier to set
	 */
	public void setOutlier(Long outlier) {
		this.outlier = outlier;
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
	
	

}
