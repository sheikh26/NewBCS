package com.strutsLogin.form;

import com.strutsLogin.dto.BaseDTO;

import com.strutsLogin.dto.EmployeePerformanceDTO;
import com.strutsLogin.util.DataUtil;


public class EmployeePerfListForm extends BaseListForm{
	
	
	 private String businessUnitId;
	
     private String year;
	
	private String empId;
	
	private String performance;

	private String edit;

	public String getEdit() {
		return edit;
	}

	public void setEdit(String edit) {
		this.edit = edit;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	public BaseDTO getDTO() {
		EmployeePerformanceDTO dto = new EmployeePerformanceDTO();
		dto.setEmpId(DataUtil.getInteger(this.getEmpId()));
		dto.setBusinessUnitId(DataUtil.getInteger(this.getBusinessUnitId()));
     	dto.setPerformance(DataUtil.getInteger(this.getPerformance()));
	    dto.setYear(DataUtil.getInteger(this.getYear()));
	
	return dto;
	}

	@Override
	public void populate(BaseDTO baseDto) {
		EmployeePerformanceDTO dto = (EmployeePerformanceDTO)baseDto;	
		this.setEmpId(DataUtil.getString(dto.getEmpId()));
		this.setBusinessUnitId(DataUtil.getString(dto.getBusinessUnitId()));
		this.setPerformance(DataUtil.getString(dto.getPerformance()));
		this.setYear(DataUtil.getString(dto.getYear()));
		
	}

	public String getBusinessUnitId() {
		return businessUnitId;
	}

	public void setBusinessUnitId(String businessUnitId) {
		this.businessUnitId = businessUnitId;
	}

}
