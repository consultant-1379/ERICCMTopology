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

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.*;

import com.ericsson.counter.analytics.common.CommonUtility;
import com.ericsson.counter.analytics.dao.IEutranCellFddDAO;
import com.ericsson.counter.analytics.dao.query.holder.NamedQueryHolder;

@Named
public class EutranCellFddDAO implements IEutranCellFddDAO, NamedQueryHolder {

	@Inject
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ericsson.counter.analytics.dao.IEutranCellRelationRawDAO#
	 * getServiceImpactData(java.lang.String, java.lang.String)
	 */
	public List<?> getServiceImpactCounterData(String date_id,String eutrancellfdd, String datetime_id,String queryString) {
		// TODO Auto-generated method stub
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> queryList = null;
		try {

			Query query = session.createQuery(queryString);
			query.setDate(0, java.sql.Date.valueOf(date_id));
			query.setString(1, eutrancellfdd);
			query.setTimestamp(2,
					Timestamp.valueOf(CommonUtility.strToSqlDate(datetime_id)));
			queryList = query.list();
			trans.commit();
		} catch (Exception e) {
			trans.rollback();

		} finally {
			session.close();
		}
		return queryList;
	}
	
	public List<?> getKpiCountereventParameterData(String date_id,
			String eutrancellfdd, String datetime_id,String queryString) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> queryList=null;
		try {
			Query query=session.createQuery(queryString);
			query.setDate(0, java.sql.Date.valueOf(date_id));
			query.setString(1, eutrancellfdd);
			query.setTimestamp(2,
					Timestamp.valueOf(CommonUtility.strToSqlDate(datetime_id)));
			queryList=query.list();
		} catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return queryList;
	}

}
