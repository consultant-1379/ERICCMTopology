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

import com.ericsson.counter.analytics.dao.IKpiEventParameterDAO;
import com.ericsson.counter.analytics.dao.query.holder.NamedQueryHolder;

@Named
public class KpiEventParameterDAO implements IKpiEventParameterDAO,NamedQueryHolder {
	
	@Inject
	SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.ericsson.counter.analytics.dao.IKpiEventParameterDAO#getKpiEventParameter(java.lang.String)
	 */
	public List<?> getKpiEventParameter(String kpi_name) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> querList=null;
		try {
			Query query=session.getNamedQuery(KPI_EVENT_PARAMETER);
			query.setString(0, kpi_name);
			querList=query.list();
		} catch(Exception e) {
		trans.rollback();
		e.printStackTrace();
		} finally {
			session.close();
		}
	
		return querList;
	}

}
