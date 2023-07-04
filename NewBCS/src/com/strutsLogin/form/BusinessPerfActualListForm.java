package com.strutsLogin.form;

import com.strutsLogin.util.*;
import com.strutsLogin.action.OaipYearlyAction;
import com.strutsLogin.dto.*;

import java.util.*;

import org.apache.commons.lang.time.DateUtils;

public class BusinessPerfActualListForm extends BaseListForm {
	
	
private String edit;
	
	private String businessPerfActualId;
	
	
	
	private String businessUnitId;
	
	
	private String buYear;
	
	public String getBuYear() {
		return buYear;
	}
	public void setBuYear(String buYear) {
		this.buYear = buYear;
	}
	private String buMonth;
	
	
	private String metric1Name;
	
	public String getMetric1Name() {
		return metric1Name;
	}
	public void setMetric1Name(String metric1Name) {
		this.metric1Name = metric1Name;
	}
	private String metric1PlanValue;
	
	public String getMetric1PlanValue() {
		return metric1PlanValue;
	}
	public void setMetric1PlanValue(String metric1PlanValue) {
		this.metric1PlanValue = metric1PlanValue;
	}
	private String metric2Name;
	
	public String getMetric2Name() {
		return metric2Name;
	}
	public void setMetric2Name(String metric2Name) {
		this.metric2Name = metric2Name;
	}
	private String metric2PlanValue;
	
	public String getMetric2PlanValue() {
		return metric2PlanValue;
	}
	public void setMetric2PlanValue(String metric2PlanValue) {
		this.metric2PlanValue = metric2PlanValue;
	}
	private String metric3Name;
	
	public String getMetric3Name() {
		return metric3Name;
	}
	public void setMetric3Name(String metric3Name) {
		this.metric3Name = metric3Name;
	}
	private String metric3PlanValue;
	
	public String getMetric3PlanValue() {
		return metric3PlanValue;
	}
	public void setMetric3PlanValue(String metric3PlanValue) {
		this.metric3PlanValue = metric3PlanValue;
	}
public BaseDTO getDTO() {
	BusinessPerfActualDTO dto = new BusinessPerfActualDTO();
dto.setBusinessPerfActualId(DataUtil.getInteger(this.getBusinessPerfActualId()));
dto.setBuYear(DataUtil.getInteger(this.getBuYear()));
dto.setBuMonth(DataUtil.getInteger(this.getBuMonth()));
dto.setMetric1Name(this.getMetric1Name());
dto.setMetric1PlanValue(DataUtil.getInteger(this.getMetric1PlanValue()));
dto.setMetric2Name(this.getMetric2Name());
dto.setMetric2PlanValue(DataUtil.getInteger(this.getMetric2PlanValue()));
dto.setMetric3Name(this.getMetric3Name());
dto.setMetric3PlanValue(DataUtil.getInteger(this.getMetric3PlanValue()));
dto.setBusinessUnitId(DataUtil.getInteger(this.getBusinessUnitId()));


	return dto;
}
public void populate(BaseDTO baseDTO) {
	BusinessPerfActualDTO dto = (BusinessPerfActualDTO)baseDTO;	
this.setBusinessPerfActualId(DataUtil.getString(dto.getBusinessPerfActualId()));
this.setBusinessUnitId(DataUtil.getString(dto.getBusinessUnitId()));
this.setBuYear(DataUtil.getString(dto.getBuYear()));
this.setBuMonth(DataUtil.getString(dto.getBuMonth()));
this.setMetric1Name(dto.getMetric1Name());
this.setMetric1PlanValue(DataUtil.getString(dto.getMetric1PlanValue()));
this.setMetric2Name(dto.getMetric2Name());
this.setMetric2PlanValue(DataUtil.getString(dto.getMetric2PlanValue()));
this.setMetric3Name(dto.getMetric3Name());
this.setMetric3PlanValue(DataUtil.getString(dto.getMetric3PlanValue()));

}
public String getEdit() {
	return edit;
}
public void setEdit(String edit) {
	this.edit = edit;
}
public String getBusinessUnitId() {
	return businessUnitId;
}
public void setBusinessUnitId(String businessUnitId) {
	this.businessUnitId = businessUnitId;
}
public String getBuMonth() {
	return buMonth;
}
public void setBuMonth(String buMonth) {
	this.buMonth = buMonth;
}
public String getBusinessPerfActualId() {
	return businessPerfActualId;
}
public void setBusinessPerfActualId(String businessPerfActualId) {
	this.businessPerfActualId = businessPerfActualId;
}
}
	
	
	

