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

import javax.persistence.*;

@javax.persistence.Entity(name="Entity")
public class Entity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name1")
	private String attribute;	
	public Entity(){}
	
	public Entity(int id, String attribute) {
		super();
		this.id = id;
		this.attribute = attribute;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
