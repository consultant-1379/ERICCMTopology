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

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.*;

import com.ericsson.counter.analytics.dao.ICorelatedKpiInformationDAO;
import com.ericsson.counter.analytics.dao.query.holder.NamedQueryHolder;

@Named
public class CorelatedKpiInformationDAO implements ICorelatedKpiInformationDAO,NamedQueryHolder {
	
	@Inject
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.ericsson.counter.analytics.dao.ICorelatedKpiInformationDAO#getCorelatedKpi(java.lang.String, java.lang.String)
	 */
	public List<?> getCorelatedKpi(String kpi_group, String kpi_name) {
		// TODO Auto-generated method stub
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();
		List<?> queryList=null;
		try {
			
		
		Query query = session.getNamedQuery(COREALTED_KPI);
		query.setString(0, kpi_group);
		query.setString(1, kpi_name);
		queryList=query.list();
		trans.commit();
		} catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return queryList;
	}

}
