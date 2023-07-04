package com.strutsLogin.form;

import java.util.*;

import com.strutsLogin.dto.BaseDTO;
import com.strutsLogin.dto.BusinessUnitMasterDTO;
import com.strutsLogin.util.DataUtil;
public class BusinessUnitMasterForm extends BaseForm {
	
	private String edit;
	
	private String businessUnitId;
	
	public String getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(String businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	private String businessUnitName;
	
	public String getBusinessUnitName() {
		return businessUnitName;
	}
	public void setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
	}
public BaseDTO getDTO() {
	BusinessUnitMasterDTO dto = new BusinessUnitMasterDTO();
dto.setBusinessUnitId(DataUtil.getInteger(this.getBusinessUnitId()));
dto.setBusinessUnitName(this.getBusinessUnitName());
	return dto;
}
public void populate(BaseDTO baseDTO) {
 BusinessUnitMasterDTO dto = (BusinessUnitMasterDTO)baseDTO;	
this.setBusinessUnitId(DataUtil.getString(dto.getBusinessUnitId()));
this.setBusinessUnitName(dto.getBusinessUnitName());
	
}
public String getEdit() {
	return edit;
}
public void setEdit(String edit) {
	this.edit = edit;
}
}