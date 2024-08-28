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
package com.ericsson.counter.analytics.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.ericsson.counter.analytics.dao.IEntityDAO;
import com.ericsson.counter.analytics.model.Entity;
import com.ericsson.counter.analytics.service.IEntityService;

@Named
@Transactional(readOnly = true)
public class EntityService implements IEntityService {
	@Inject
	IEntityDAO entityDAO;

	@Transactional(readOnly = false)
	public void addEntity(Entity entity) {
		getEntityDAO().addEntity(entity);
	}

	@Transactional(readOnly = false)
	public void deleteEntity(Entity entity) {
		getEntityDAO().deleteEntity(entity);
	}

	@Transactional(readOnly = false)
	public void updateEntity(Entity entity) {
		getEntityDAO().updateEntity(entity);
	}

	public Entity getEntityById(int id) {
		return getEntityDAO().getEntity(id);
	}

	public List<Entity> getEntitys() {	
		return getEntityDAO().getEntities();
	}

	public IEntityDAO getEntityDAO() {
		return entityDAO;
	}

	public void setEntityDAO(IEntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

}
