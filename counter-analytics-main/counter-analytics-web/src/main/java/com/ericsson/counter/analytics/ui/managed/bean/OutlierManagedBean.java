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
import java.text.SimpleDateFormat;
import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.chart.PieChartModel;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;

import com.ericsson.counter.analytics.model.view.OutlierView;
import com.ericsson.counter.analytics.service.IKpiInformationService;


@Named("outlierManagedBean")
@Scope("session")
public class OutlierManagedBean implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date_id;
	private String erbs;
	private PieChartModel pieChartModel;	  
	@Inject
	private IKpiInformationService kpiInformationService;
	
	public void outlierPieChart() {
		try {
			System.out.println("Outlier Pie Chart Method Called");
			FacesContext context=FacesContext.getCurrentInstance();
			System.out.println("date_id="+date_id);
			String strDate=new SimpleDateFormat("yyyy-MM-dd").format(date_id);
			List<OutlierView> outlier = kpiInformationService.getKpiGroupOutliers("",strDate, erbs);
			System.out.println("strDate="+strDate+" ,erbs="+erbs);
			pieChartModel = new PieChartModel();
	         for(OutlierView outlierView:outlier) {
	        	 System.out.println("Cell: "+outlierView.getCell()+" Outlier="+outlierView.getOutlier());
	        	 pieChartModel.set("Cell: "+outlierView.getCell(), outlierView.getOutlier());
	         }
	         pieChartModel.setTitle("Accessbility Outlier");
	         pieChartModel.setLegendPosition("ne");
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "D'oh!", "Message: ")); 
		}
	}
	
	
	
	public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                        "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
         
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	public void onDateSelect(SelectEvent event) {  
		FacesContext facesContext = FacesContext.getCurrentInstance();  
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));  
		}  
		public void click() {  
		RequestContext requestContext = RequestContext.getCurrentInstance();  
		requestContext.update("form:display");  
		requestContext.execute("PF('dlg').show()");  
		}  

	/**
	 * @return the pieModel1
	 */
	public PieChartModel getPieChartModel() {
		return pieChartModel;
	}

	/**
	 * @param pieModel1 the pieModel1 to set
	 */
	public void setPieChartModel(PieChartModel pieChartModel) {
		this.pieChartModel = pieChartModel;
	}
	/**
	 * @return the date_id
	 */
	public Date getDate_id() {
		return date_id;
	}

	/**
	 * @param date_id the date_id to set
	 */
	public void setDate_id(Date date_id) {
		this.date_id = date_id;
	}

	/**
	 * @return the erbs
	 */
	public String getErbs() {
		return erbs;
	}

	/**
	 * @param erbs the erbs to set
	 */
	public void setErbs(String erbs) {
		this.erbs = erbs;
	}

}
