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
package com.ericsson.counter.analytics.ui.managed.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.component.chart.pie.PieChart;
import org.primefaces.model.chart.PieChartModel;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;

import com.ericsson.counter.analytics.model.Entity;
import com.ericsson.counter.analytics.model.view.OutlierView;
import com.ericsson.counter.analytics.service.IEntityService;
import com.ericsson.counter.analytics.service.IKpiInformationService;

@Named("entityBBean")
@Scope("session")
public class EntityBBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private PieChartModel pieModel1;
	
	
	@Inject
	private IEntityService entityService;
	@Inject
	private IKpiInformationService kpiInformationService;
	
	private int id;
	private String attribute;
	private List<Entity> entityList;
	List<String> dates;

	public void addEntity() {
		try {
			FacesContext context=FacesContext.getCurrentInstance();
			Entity entity = new Entity();
			entity.setId(getId());
			entity.setAttribute(getAttribute());
			getEntityService().addEntity(entity);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Added!", "Message: "));
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "D'oh!", "Message: ")); 
		} 	
		
	}
	
	public void viewChart() {
		try {
			FacesContext context=FacesContext.getCurrentInstance();
			List<OutlierView> outlier = getKpiInformationService().getKpiGroupOutliers("","AB801F", "2016-06-06");
			pieModel1 = new PieChartModel();
	         for(OutlierView outlierView:outlier) {
	        	 pieModel1.set("Cell: "+outlierView.getCell(), outlierView.getOutlier());
	  	    
	         }
	         pieModel1.setTitle("Accessbility Outlier");
	  	     pieModel1.setLegendPosition("ne");
	      
	        context.getExternalContext().redirect("pages/kpiDemp.xhtml");
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "D'oh!", "Message: ")); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		
	}
	
	public void viewDate() {
		try {
			FacesContext context=FacesContext.getCurrentInstance();	      
	        context.getExternalContext().redirect("pages/KpiDemo.xhtml");
	        dates.add("02-03-2016");
	        dates.add("02-03-2016");
	        dates.add("02-03-2016");
	        dates.add("02-03-2016");
	        dates.add("02-03-2016");
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "D'oh!", "Message: ")); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		
	}
	

	public void reset() {
		this.setId(0);
		this.setAttribute("");
	}

	public List<Entity> getEntityList() {
		entityList = new ArrayList<Entity>();
		entityList.addAll(getEntityService().getEntitys());
		return entityList;
	}

	public IEntityService getEntityService() {
		return entityService;
	}

	public void setEntityService(IEntityService entityService) {
		this.entityService = entityService;
	}
	
	

	/**
	 * @return the kpiInformationService
	 */
	public IKpiInformationService getKpiInformationService() {
		return kpiInformationService;
	}

	/**
	 * @param kpiInformationService the kpiInformationService to set
	 */
	public void setKpiInformationService(
			IKpiInformationService kpiInformationService) {
		this.kpiInformationService = kpiInformationService;
	}

	public void setEntityList(List<Entity> entityList) {
		this.entityList = entityList;
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

	/**
	 * @return the pieModel1
	 */
	public PieChartModel getPieModel1() {
		return pieModel1;
	}

	/**
	 * @param pieModel1 the pieModel1 to set
	 */
	public void setPieModel1(PieChartModel pieModel1) {
		this.pieModel1 = pieModel1;
	}

	/**
	 * @return the dates
	 */
	public List<String> getDates() {
		return dates;
	}

	/**
	 * @param dates the dates to set
	 */
	public void setDates(List<String> dates) {
		this.dates = dates;
	}
	
	

}
