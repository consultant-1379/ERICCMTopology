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

public class CellAvailibilityGridView {
	private String cell;
	private Float availibilityPercentage;
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
	 * @return the availibilityPercentage
	 */
	public Float getAvailibilityPercentage() {
		return availibilityPercentage;
	}
	/**
	 * @param availibilityPercentage the availibilityPercentage to set
	 */
	public void setAvailibilityPercentage(Float availibilityPercentage) {
		this.availibilityPercentage = availibilityPercentage;
	}
	
	

}
