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

public class CellAvailabilityView {
	private String erbs;
	private String cell;
	private String datetime_id;
	private Double cell_availability;
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
	 * @return the datetime_id
	 */
	
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
	 * @return the cell_availability
	 */
	public Double getCell_availability() {
		return cell_availability;
	}
	/**
	 * @param cell_availability the cell_availability to set
	 */
	public void setCell_availability(Double cell_availability) {
		this.cell_availability = cell_availability;
	}
	
	

}
