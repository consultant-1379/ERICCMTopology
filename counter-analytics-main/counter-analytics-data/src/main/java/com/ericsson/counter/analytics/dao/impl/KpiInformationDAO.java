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

import com.ericsson.counter.analytics.dao.IKpiInformationDAO;
import com.ericsson.counter.analytics.dao.query.holder.NamedQueryHolder;

@Named
public class KpiInformationDAO implements IKpiInformationDAO,NamedQueryHolder {

	/* (non-Javadoc)
	 * @see com.ericsson.counter.analytics.dao.IKpiInformationDAO#getAccessbilityOutlier()
	 */
	public KpiInformationDAO(){
		
	}
	@Inject
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<?> getKpiGroupOutliers(String namedQuery,String date_id,String erbs) {
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> queryList=null;
		try {
			
		
		Query query = session.getNamedQuery(namedQuery);
		query.setDate(0, java.sql.Date.valueOf(date_id));
		query.setString(1, erbs);
		queryList = query.list();
		trans.commit();
		} catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return queryList;
	}
	public List<?> getNodeList(String date_id) {
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> nodeList=null;
		try {
			
		
		Query query = session.getNamedQuery(NODELIST);
		query.setDate(0, java.sql.Date.valueOf(date_id));
		nodeList = query.list();
		trans.commit();
		} catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return nodeList;
		
	}
	
	public List<?> getKpiGraphData(String namedQuery, String date_id,String eutrancellfdd) {
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> queryListData=null;
		try {
			
		
		Query query = session.getNamedQuery(namedQuery);
		query.setDate(0, java.sql.Date.valueOf(date_id));
		query.setString(1, eutrancellfdd);
		queryListData=query.list();
		trans.commit();
		} catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return queryListData;
	}

	/* (non-Javadoc)
	 * @see com.ericsson.counter.analytics.dao.IKpiInformationDAO#getCellAvailibilityByNode(java.lang.String, java.lang.String)
	 */
	public List<?> getCellAvailibilityByNode(String date_id,String erbs) {
		// TODO Auto-generated method stub
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> queryList=null;
		try {
			
		
		Query query = session.getNamedQuery(CELL_AVAILIBILITY_PER_NODE);
		query.setDate(0, java.sql.Date.valueOf(date_id));
		query.setString(1, erbs);
		queryList = query.list();
		trans.commit();
		} catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return queryList;
	}

	/* (non-Javadoc)
	 * @see com.ericsson.counter.analytics.dao.IKpiInformationDAO#getCellAvailibilityByCell(java.lang.String, java.lang.String)
	 */
	public List<?> getCellAvailibilityByCell(String date_id,
			String eutrancellfdd) {
		// TODO Auto-generated method stub
		//Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> queryList=null;
		try {
			
		
		Query query = session.getNamedQuery(CELL_AVAILIBILITY_PER_CELL);
		query.setDate(0, java.sql.Date.valueOf(date_id));
		query.setString(1, eutrancellfdd);
		queryList = query.list();
		trans.commit();
		} catch(Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return queryList;
	}

	/* (non-Javadoc)
	 * @see com.ericsson.counter.analytics.dao.IKpiInformationDAO#getCellAvailibilityGridView(java.lang.String, java.lang.String)
	 */
	public List<?> getCellAvailibilityGridView(String date_id, String erbs) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<?> queryList=null;
		try {
			
		
		Query query = session.getNamedQuery(GRID_VIEW);
		query.setDate(0, java.sql.Date.valueOf(date_id));
		query.setString(1, erbs);
		queryList = query.list();
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
