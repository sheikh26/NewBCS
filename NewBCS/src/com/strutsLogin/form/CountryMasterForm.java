package com.strutsLogin.form;

import java.util.*;

import com.strutsLogin.dto.BaseDTO;
import com.strutsLogin.dto.CountryMasterDTO;
import com.strutsLogin.util.DataUtil;
public class CountryMasterForm extends BaseForm {

	private String edit;
	
	private String countryId;
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	private String countryName;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
public BaseDTO getDTO() {
	CountryMasterDTO dto = new CountryMasterDTO();
dto.setCountryId(DataUtil.getInteger(this.getCountryId()));
dto.setCountryName(this.getCountryName());
	return dto;
}
public void populate(BaseDTO baseDTO) {
 CountryMasterDTO dto = (CountryMasterDTO)baseDTO;	
this.setCountryId(DataUtil.getString(dto.getCountryId()));
this.setCountryName(dto.getCountryName());
	
}
public String getEdit() {
	return edit;
}
public void setEdit(String edit) {
	this.edit = edit;
}
}