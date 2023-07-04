package com.strutsLogin.form;


import java.util.*;

import com.strutsLogin.dto.BaseDTO;
import com.strutsLogin.dto.LavarageDTO;
import com.strutsLogin.util.DataUtil;
public class LavarageForm extends BaseForm {
	private String leverageId;
	private String edit;
	private String businessUnitId;
	private String leveragePerc;
	private String countryId;
	private String GradeName;
	
	
	public String getEdit() {
		return edit;
	}
	public void setEdit(String edit) {
		this.edit = edit;
	}
	public String getLeverageId() {
		return leverageId;
	}
	public void setLeverageId(String leverageId) {
		this.leverageId = leverageId;
	}
	
	
	public String getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(String businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	
	
	public String getGradeName() {
		return GradeName;
	}
	public void setGradeName(String GradeName) {
		this.GradeName = GradeName;
	}
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	public String getLeveragePerc() {
		return leveragePerc;
	}
	public void setLeveragePerc(String leveragePerc) {
		this.leveragePerc = leveragePerc;
	}

	public BaseDTO getDTO() {
		LavarageDTO dto = new LavarageDTO();

		dto.setLeverageId(DataUtil.getInteger(this.getLeverageId()));
		dto.setBusinessUnitId(DataUtil.getInteger(this.getBusinessUnitId()));
		dto.setGradeName(this.getGradeName());
		dto.setCountryId(DataUtil.getInteger(this.getCountryId()));
		dto.setLeveragePerc(DataUtil.getInteger(this.getLeveragePerc()));
		return dto;
	}

	public void populate(BaseDTO baseDTO) {
		LavarageDTO dto = (LavarageDTO) baseDTO;
		this.setLeverageId(DataUtil.getString(dto.getLeverageId()));
		this.setBusinessUnitId(DataUtil.getString(dto.getBusinessUnitId()));
		this.setGradeName(dto.getGradeName());
		this.setCountryId(DataUtil.getString(dto.getCountryId()));
		this.setLeveragePerc(DataUtil.getString(dto.getLeveragePerc()));

	}
}