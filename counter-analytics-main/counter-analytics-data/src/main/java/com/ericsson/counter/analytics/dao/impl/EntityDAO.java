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
package com.ericsson.counter.analytics.dao.impl;

import com.ericsson.counter.analytics.dao.IEntityDAO;
import com.ericsson.counter.analytics.model.Entity;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Named
public class EntityDAO implements IEntityDAO  {
	/**
	 * 
	 */
	public EntityDAO() {
		// TODO Auto-generated constructor stub
	}
	@Inject
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addEntity(Entity entity) {
		Session session = getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		session.save(entity);
		trans.commit();
	}

	public void deleteEntity(Entity entity) {
		Session session = getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		session.delete(entity);
		trans.commit();
	}

	public void updateEntity(Entity entity) {
		Session session = getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		session.update(entity);
		trans.commit();
	}

	public Entity getEntity(int id) {
		Session session = getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		
		List<?> list = session
				.createQuery("from Entity where id=?").setParameter(0, id)
				.list();
		
		trans.commit();
		return (Entity) list.get(0);
	}

	public List<Entity> getEntities() {
		Session session = getSessionFactory().getCurrentSession();
		Transaction trans = session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Entity> list = (List<Entity>) session.createQuery("from Entity").list();
		
		trans.commit();
		return list;
	}


}
