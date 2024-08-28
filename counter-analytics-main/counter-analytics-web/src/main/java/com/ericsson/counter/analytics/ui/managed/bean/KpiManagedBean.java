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

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.chart.PieChartModel;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;

import com.ericsson.counter.analytics.model.view.OutlierView;
import com.ericsson.counter.analytics.service.IKpiInformationService;

@Named("kpiManagedBean")
@Scope("session")
public class KpiManagedBean implements Serializable {
	@Inject
	IKpiInformationService iKpiInformationService;
	private PieChartModel accessbilityPieChartModel;
	
	
	/**
	 * 
	 */
	private String name="Select";
	private static final long serialVersionUID = 1L;
	private String date_id;
	private String eNodeB;
	private List<String> nodeList;
	private List<String> dateList;
	public void onDateChange() {
		System.out.println("date_id**********************************"+date_id+" ***************************");
		nodeList=iKpiInformationService.getNodeList("2016-06-06");
		
	}
	
	public void outlierPieChart() {
		try {
			System.out.println("Outlier Pie Chart Method Called");
			System.out.println("date_id="+date_id);
			String strDate=new SimpleDateFormat("yyyy-MM-dd").format(date_id);
			List<OutlierView> outlier = iKpiInformationService.getKpiGroupOutliers("Accessibility","2016-06-06", "AB801F");
			System.out.println("strDate="+strDate+" ,erbs="+eNodeB);
			accessbilityPieChartModel = new PieChartModel();
			accessbilityPieChartModel.set("Cell: "+12, 15);
	         for(OutlierView outlierView:outlier) {
	        	 
	        	 accessbilityPieChartModel.set("Cell: "+outlierView.getCell(), outlierView.getOutlier());
	         }
	         accessbilityPieChartModel.setTitle("Accessbility Outlier");
	         accessbilityPieChartModel.setLegendPosition("ne");
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "D'oh!", "Message: ")); 
		}
	}
		

	/**
	 * @return the accessbilityPieChartModel
	 */
	public PieChartModel getAccessbilityPieChartModel() {
		return accessbilityPieChartModel;
	}

	/**
	 * @param accessbilityPieChartModel the accessbilityPieChartModel to set
	 */
	public void setAccessbilityPieChartModel(PieChartModel accessbilityPieChartModel) {
		this.accessbilityPieChartModel = accessbilityPieChartModel;
	}

	/**
	 * @return the nodeList
	 */
	public List<String> getNodeList() {
		return nodeList;
	}
	/**
	 * @param nodeList the nodeList to set
	 */
	public void setNodeList(List<String> nodeList) {
		this.nodeList = nodeList;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the date_id
	 */
	public String getDate_id() {
		return date_id;
	}

	/**
	 * @param date_id the date_id to set
	 */
	public void setDate_id(String date_id) {
		this.date_id = date_id;
	}

	/**
	 * @return the eNodeB
	 */
	public String geteNodeB() {
		return eNodeB;
	}

	/**
	 * @param eNodeB the eNodeB to set
	 */
	public void seteNodeB(String eNodeB) {
		this.eNodeB = eNodeB;
	}

	/**
	 * @return the dateList
	 */
	public List<String> getDateList() {
		return dateList;
	}

	/**
	 * @param dateList the dateList to set
	 */
	public void setDateList(List<String> dateList) {
		this.dateList = dateList;
	}
	
	
	

}
