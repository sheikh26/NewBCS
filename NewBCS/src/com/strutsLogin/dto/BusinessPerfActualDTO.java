package com.strutsLogin.dto ;
import java.util.*;
public class BusinessPerfActualDTO extends BaseDTO implements DropDown{
	
	
	
	
	
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return String.valueOf(this.buMonth);
	}
	public String getKey() {
		// TODO Auto-generated method stub
		return String.valueOf(this.businessPerfActualId);
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return String.valueOf(this.buMonth);
	}
	private int businessPerfActualId;
	
	public int getBusinessPerfActualId() {
		return businessPerfActualId;
	}
	public void setBusinessPerfActualId(int businessPerfActualId) {
		this.businessPerfActualId = businessPerfActualId;
	}
	private int  businessUnitId;
	
	
	private int buYear;
	
	public int getBuYear() {
		return buYear;
	}
	public void setBuYear(int buYear) {
		this.buYear = buYear;
	}
	private int buMonth;
	
	public int getBuMonth() {
		return buMonth;
	}
	public void setBuMonth(int buMonth) {
		this.buMonth = buMonth;
	}
	private String metric1Name;
	
	public String getMetric1Name() {
		return metric1Name;
	}
	public void setMetric1Name(String metric1Name) {
		this.metric1Name = metric1Name;
	}
	private int metric1PlanValue;
	
	public int getMetric1PlanValue() {
		return metric1PlanValue;
	}
	public void setMetric1PlanValue(int metric1PlanValue) {
		this.metric1PlanValue = metric1PlanValue;
	}
	private String metric2Name;
	
	public String getMetric2Name() {
		return metric2Name;
	}
	public void setMetric2Name(String metric2Name) {
		this.metric2Name = metric2Name;
	}
	private int metric2PlanValue;
	
	public int getMetric2PlanValue() {
		return metric2PlanValue;
	}
	public void setMetric2PlanValue(int metric2PlanValue) {
		this.metric2PlanValue = metric2PlanValue;
	}
	private String metric3Name;
	
	public String getMetric3Name() {
		return metric3Name;
	}
	public void setMetric3Name(String metric3Name) {
		this.metric3Name = metric3Name;
	}
	private int metric3PlanValue;
	
	public int getMetric3PlanValue() {
		return metric3PlanValue;
	}
	public void setMetric3PlanValue(int metric3PlanValue) {
		this.metric3PlanValue = metric3PlanValue;
	}
	public int getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(int businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	public String getDescription1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getKey1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getValue1() {
		// TODO Auto-generated method stub
		return null;
	}
}