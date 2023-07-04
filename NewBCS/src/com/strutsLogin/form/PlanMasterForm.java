package com.strutsLogin.form;
import com.strutsLogin.util.*;
import com.strutsLogin.dto.*;
import java.util.*;
public class PlanMasterForm extends BaseForm {
	private String planId;
	private String edit;
	
	private String planName; 
	
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getEdit() {
		return edit;
	}
	public void setEdit(String edit) {
		this.edit = edit;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	private String businessUnit1Perf;
	
	public String getBusinessUnit1Perf() {
		return businessUnit1Perf;
	}
	public void setBusinessUnit1Perf(String businessUnit1Perf) {
		this.businessUnit1Perf = businessUnit1Perf;
	}
	private String businessUnit1Mertic1Perf;
	
	public String getBusinessUnit1Mertic1Perf() {
		return businessUnit1Mertic1Perf;
	}
	public void setBusinessUnit1Mertic1Perf(String businessUnit1Mertic1Perf) {
		this.businessUnit1Mertic1Perf = businessUnit1Mertic1Perf;
	}
	private String businessUnit1Mertic2Perf;
	
	public String getBusinessUnit1Mertic2Perf() {
		return businessUnit1Mertic2Perf;
	}
	public void setBusinessUnit1Mertic2Perf(String businessUnit1Mertic2Perf) {
		this.businessUnit1Mertic2Perf = businessUnit1Mertic2Perf;
	}
	private String businessUnit1Mertic3Perf;
	
	public String getBusinessUnit1Mertic3Perf() {
		return businessUnit1Mertic3Perf;
	}
	public void setBusinessUnit1Mertic3Perf(String businessUnit1Mertic3Perf) {
		this.businessUnit1Mertic3Perf = businessUnit1Mertic3Perf;
	}
	private String BusinessUnit2Perf;
	
	public String getBusinessUnit2Perf() {
		return BusinessUnit2Perf;
	}
	public void setBusinessUnit2Perf(String BusinessUnit2Perf) {
		this.BusinessUnit2Perf = BusinessUnit2Perf;
	}
	private String businessUnit2Mertic1Perf;
	
	public String getBusinessUnit2Mertic1Perf() {
		return businessUnit2Mertic1Perf;
	}
	public void setBusinessUnit2Mertic1Perf(String businessUnit2Mertic1Perf) {
		this.businessUnit2Mertic1Perf = businessUnit2Mertic1Perf;
	}
	private String businessUnit2Mertic2Perf;
	
	public String getBusinessUnit2Mertic2Perf() {
		return businessUnit2Mertic2Perf;
	}
	public void setBusinessUnit2Mertic2Perf(String businessUnit2Mertic2Perf) {
		this.businessUnit2Mertic2Perf = businessUnit2Mertic2Perf;
	}
	private String businessUnit2Mertic3Perf;
	
	public String getBusinessUnit2Mertic3Perf() {
		return businessUnit2Mertic3Perf;
	}
	public void setBusinessUnit2Mertic3Perf(String businessUnit2Mertic3Perf) {
		this.businessUnit2Mertic3Perf = businessUnit2Mertic3Perf;
	}
public BaseDTO getDTO() {
	PlanMasterDTO dto = new PlanMasterDTO();
dto.setPlanId(DataUtil.getInteger(this.getPlanId()));
dto.setPlanName(this.getPlanName());
dto.setBusinessUnit1Perf(DataUtil.getInteger(this.getBusinessUnit1Perf()));
dto.setBusinessUnit1Mertic1Perf(DataUtil.getInteger(this.getBusinessUnit1Mertic1Perf()));
dto.setBusinessUnit1Mertic2Perf(DataUtil.getInteger(this.getBusinessUnit1Mertic2Perf()));
dto.setBusinessUnit1Mertic3Perf(DataUtil.getInteger(this.getBusinessUnit1Mertic3Perf()));
dto.setBusinessUnit2Perf(DataUtil.getInteger(this.getBusinessUnit2Perf()));
dto.setBusinessUnit2Mertic1Perf(DataUtil.getInteger(this.getBusinessUnit2Mertic1Perf()));
dto.setBusinessUnit2Mertic2Perf(DataUtil.getInteger(this.getBusinessUnit2Mertic2Perf()));
dto.setBusinessUnit2Mertic3Perf(DataUtil.getInteger(this.getBusinessUnit2Mertic3Perf()));

	return dto;
}
public void populate(BaseDTO baseDTO) {
 PlanMasterDTO dto = (PlanMasterDTO)baseDTO;	
this.setPlanId(DataUtil.getString(dto.getPlanId()));
this.setPlanName(dto.getPlanName());
this.setBusinessUnit1Perf(DataUtil.getString(dto.getBusinessUnit1Perf()));
this.setBusinessUnit1Mertic1Perf(DataUtil.getString(dto.getBusinessUnit1Mertic1Perf()));
this.setBusinessUnit1Mertic2Perf(DataUtil.getString(dto.getBusinessUnit1Mertic2Perf()));
this.setBusinessUnit1Mertic3Perf(DataUtil.getString(dto.getBusinessUnit1Mertic3Perf()));
this.setBusinessUnit2Perf(DataUtil.getString(dto.getBusinessUnit2Perf()));
this.setBusinessUnit2Mertic1Perf(DataUtil.getString(dto.getBusinessUnit2Mertic1Perf()));
this.setBusinessUnit2Mertic2Perf(DataUtil.getString(dto.getBusinessUnit2Mertic2Perf()));
this.setBusinessUnit2Mertic3Perf(DataUtil.getString(dto.getBusinessUnit2Mertic3Perf()));

	
}
}