package com.strutsLogin.form;

import com.strutsLogin.util.*;
import com.strutsLogin.dto.*;

import java.util.*;

import org.apache.commons.lang.time.DateUtils;

public class OaipListForm extends BaseListForm {
	
	
	private String empId;
	private String peopleSoftId;
	private String lastName;
	private String country;
	private String planId;
	private String managerId;
	private String designation;
	private String dateOfJoin;
	private String dateOfEnroll;
	private String dateOfExit;
	private String firstName;
	private String levarageGrade;
	private String baseSalaryAnnual;
	private int year;
	private int month;
	private String oaipBonus;
	
	private String[] allBox;
	private int businessUnitId;
	
	
	public String[] getAllBox() {
		return allBox;
	}
	public void setAllBox(String[] allBox) {
		this.allBox = allBox;
	}
	public String getOaipBonus() {
		return oaipBonus;
	}
	public void setOaipBonus(String oaipBonus) {
		this.oaipBonus = oaipBonus;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	
	public BaseDTO getDTO() {
		EmployeeMasterDTO dto = new EmployeeMasterDTO();
	
	dto.setFirstName(this.getFirstName());
	
	dto.setLevarageGrade(DataUtil.getInteger(this.getLevarageGrade()));
	dto.setBaseSalaryAnnual(DataUtil.getInteger(this.getBaseSalaryAnnual()));
	dto.setOaipBonus(DataUtil.getInteger(this.getOaipBonus()));
	dto.setEmpId(DataUtil.getInteger(this.getEmpId()));
	dto.setPeopleSoftId(this.getPeopleSoftId());
	dto.setFirstName(this.getFirstName());
	dto.setLastName(this.getLastName());
	dto.setCountry(this.getCountry());
	dto.setPlanId(DataUtil.getInteger(this.getPlanId()));
	dto.setBusinessUnitId((this.getBusinessUnitId()));
	//dto.setPeopleSoftJobGrade(this.getPeopleSoftJobGrade());
	dto.setLevarageGrade(DataUtil.getInteger(this.getLevarageGrade()));
	dto.setBaseSalaryAnnual(DataUtil.getInteger(this.getBaseSalaryAnnual()));
	dto.setManagerId(this.getManagerId());
	dto.setDesignation(this.getDesignation());
	dto.setDateOfJoin(this.getDateOfJoin());
	System.out.println("Format-----------"+this.dateOfJoin);
	dto.setDateOfEnroll(this.getDateOfEnroll());
	dto.setDateOfExit(this.getDateOfExit());
	dto.setOaipBonus(DataUtil.getInteger(this.getOaipBonus()));
	dto.setAllBox(this.getAllBox());
	
	
		return dto;
	}
	public void populate(BaseDTO baseDTO) {
	 EmployeeMasterDTO dto = (EmployeeMasterDTO)baseDTO;	
	this.setFirstName(dto.getFirstName());
	this.setLevarageGrade(DataUtil.getString(dto.getLevarageGrade()));
	this.setBaseSalaryAnnual(DataUtil.getString(dto.getBaseSalaryAnnual()));
	this.setOaipBonus(DataUtil.getString(dto.getOaipBonus()));
	this.setEmpId(DataUtil.getString(dto.getEmpId()));
	this.setPeopleSoftId(dto.getPeopleSoftId());
	this.setFirstName(dto.getFirstName());
	this.setLastName(dto.getLastName());
	this.setCountry(dto.getCountry());
	this.setPlanId(DataUtil.getString(dto.getPlanId()));
	this.setBusinessUnitId(dto.getBusinessUnitId());
	this.setLevarageGrade(DataUtil.getString(dto.getLevarageGrade()));
	this.setBaseSalaryAnnual(DataUtil.getString(dto.getBaseSalaryAnnual()));
	this.setManagerId(DataUtil.getString(dto.getManagerId()));
	this.setDesignation(dto.getDesignation());
	this.setDateOfJoin(dto.getDateOfJoin());
	System.out.println("Format---Stringggggggggggggggg--------"+dto.getDateOfJoin());
	this.setDateOfEnroll(dto.getDateOfEnroll());
	this.setDateOfExit(dto.getDateOfExit());
	this.setOaipBonus(DataUtil.getString(dto.getOaipBonus()));
	this.setAllBox(dto.getAllBox());
		
	}
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;}
	public String getPeopleSoftId() {
		return peopleSoftId;
	}
	public void setPeopleSoftId(String peopleSoftId) {
		this.peopleSoftId = peopleSoftId;
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
	public String getDateOfExit() {
		return dateOfExit;
	}
	public void setDateOfExit(String dateOfExit) {
		this.dateOfExit = dateOfExit;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(int businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	
	
	
	
}
