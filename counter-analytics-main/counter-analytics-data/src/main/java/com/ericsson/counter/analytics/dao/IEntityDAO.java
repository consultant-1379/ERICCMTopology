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
package com.ericsson.counter.analytics.dao;

import java.util.List;

import com.ericsson.counter.analytics.model.Entity;

public interface IEntityDAO {
	public void addEntity(Entity entity);

	public void updateEntity(Entity entity);
	
	public void deleteEntity(Entity entity);
	
	public Entity getEntity(int id);

	public List<Entity> getEntities();

}
