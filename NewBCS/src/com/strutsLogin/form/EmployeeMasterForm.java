package com.strutsLogin.form;
import com.strutsLogin.util.*;
import com.strutsLogin.dto.*;
import java.util.*;
public class EmployeeMasterForm extends BaseForm {
	private String empId;
	private String edit;
	private String oaipBonus;
	
	public String getEdit() {
		return edit;
	}
	public void setEdit(String edit) {
		this.edit = edit;
	}
	
	private String peopleSoftId;
	private String firstName;
	private String lastName;
	private String country;
	private String planId;
	private String peopleSoftJobGrade;
	private String levarageGrade;
	private String baseSalaryAnnual;
	private String managerId;
	private String designation;
	private String dateOfJoin;
	private String dateOfEnroll;
	private String dateOfExit;
	private String businessUnitId;
	
	public String getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(String businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	public String getDateOfExit() {
		return dateOfExit;
	}
	public void setDateOfExit(String dateOfExit) {
		this.dateOfExit = dateOfExit;
	}

	public BaseDTO getDTO() {
		EmployeeMasterDTO dto = new EmployeeMasterDTO();
		dto.setEmpId(DataUtil.getInteger(this.getEmpId()));
		dto.setPeopleSoftId(this.getPeopleSoftId());
		dto.setFirstName(this.getFirstName());
		dto.setLastName(this.getLastName());
		dto.setCountry(this.getCountry());
		dto.setBusinessUnitId(DataUtil.getInteger(this.getBusinessUnitId()));
		dto.setPlanId(DataUtil.getInteger(this.getPlanId()));
		dto.setPeopleSoftJobGrade(this.getPeopleSoftJobGrade());
		dto.setLevarageGrade(DataUtil.getInteger(this.getLevarageGrade()));
		dto.setBaseSalaryAnnual(DataUtil.getInteger(this.getBaseSalaryAnnual()));
		dto.setManagerId(this.getManagerId());
		dto.setDesignation(this.getDesignation());
		dto.setDateOfJoin(this.getDateOfJoin());
		System.out.println("Format-----------" + this.dateOfJoin);
		dto.setDateOfEnroll(this.getDateOfEnroll());
		dto.setDateOfExit(this.getDateOfExit());
		dto.setOaipBonus(DataUtil.getInteger(this.getOaipBonus()));
		return dto;
	}

	public void populate(BaseDTO baseDTO) {
		EmployeeMasterDTO dto = (EmployeeMasterDTO) baseDTO;
		this.setEmpId(DataUtil.getString(dto.getEmpId()));
		this.setPeopleSoftId(dto.getPeopleSoftId());
		this.setFirstName(dto.getFirstName());
		this.setLastName(dto.getLastName());
		this.setCountry(dto.getCountry());
		this.setBusinessUnitId(DataUtil.getString(dto.getBusinessUnitId()));
		this.setPlanId(DataUtil.getString(dto.getPlanId()));
		this.setPeopleSoftJobGrade(dto.getPeopleSoftJobGrade());
		this.setLevarageGrade(DataUtil.getString(dto.getLevarageGrade()));
		this.setBaseSalaryAnnual(DataUtil.getString(dto.getBaseSalaryAnnual()));
		this.setManagerId(dto.getManagerId());
		this.setDesignation(dto.getDesignation());
		this.setDateOfJoin(dto.getDateOfJoin());
		System.out.println("Format---Stringggggggggggggggg--------"
				+ dto.getDateOfJoin());
		this.setDateOfEnroll(dto.getDateOfEnroll());
		this.setDateOfExit(dto.getDateOfExit());
		this.setOaipBonus(DataUtil.getString(dto.getOaipBonus()));

	}
public String getOaipBonus() {
	return oaipBonus;
}
public void setOaipBonus(String oaipBonus) {
	this.oaipBonus = oaipBonus;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getPeopleSoftId() {
	return peopleSoftId;
}
public void setPeopleSoftId(String peopleSoftId) {
	this.peopleSoftId = peopleSoftId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPlanId() {
	return planId;
}
public void setPlanId(String planId) {
	this.planId = planId;
}
public String getPeopleSoftJobGrade() {
	return peopleSoftJobGrade;
}
public void setPeopleSoftJobGrade(String peopleSoftJobGrade) {
	this.peopleSoftJobGrade = peopleSoftJobGrade;
}
public String getLevarageGrade() {
	return levarageGrade;
}
public void setLevarageGrade(String levarageGrade) {
	this.levarageGrade = levarageGrade;
}
public String getBaseSalaryAnnual() {
	return baseSalaryAnnual;
}
public void setBaseSalaryAnnual(String baseSalaryAnnual) {
	this.baseSalaryAnnual = baseSalaryAnnual;
}
public String getManagerId() {
	return managerId;
}
public void setManagerId(String managerId) {
	this.managerId = managerId;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDateOfJoin() {
	return dateOfJoin;
}
public void setDateOfJoin(String dateOfJoin) {
	this.dateOfJoin = dateOfJoin;
}
public String getDateOfEnroll() {
	return dateOfEnroll;
}
public void setDateOfEnroll(String dateOfEnroll) {
	this.dateOfEnroll = dateOfEnroll;
}
}