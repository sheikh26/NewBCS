package com.strutsLogin.form;

import com.strutsLogin.util.*;
import com.strutsLogin.action.OaipYearlyAction;
import com.strutsLogin.dto.*;

import java.util.*;

import org.apache.commons.lang.time.DateUtils;

public class OaipListYearlyForm extends BaseForm {
	
	
private String empId;
	private int year;
	private String empName;
	
	private String baseSalary;
	
	private String leverage;
	private int leveragePerc;
	private int indPerf;
	private String doj;
	private String oaipStartMonth;
	private String oaipEndMonth;
	private int noofMonths;
	private float multiplier;
	private float oaip;
	
	private float oaipExtra;
	private int businessUnitId;
	
	
	
	
	
	public BaseDTO getDTO() {
		YearlyCalDTO dto = new YearlyCalDTO();
		dto.setEmpId(this.getEmpId());
	dto.setEmpName(this.getEmpName());
	
	//dto.setEmpId(this.getLevarageGrade());
	dto.setBaseSalary(this.getBaseSalary());
	dto.setLeverage(this.getLeverage());
	dto.setLeveragePerc(this.getLeveragePerc());
	dto.setIndPerf(this.getIndPerf());
	dto.setDoj(this.getDoj());
	dto.setOaipStartMonth(this.getOaipStartMonth());
	//dto.setCountry(this.getCountry());
	dto.setOaipEndMonth(this.getOaipEndMonth());
	//dto.setPeopleSoftJobGrade(this.getPeopleSoftJobGrade());
	dto.setNoofMonths(this.getNoofMonths());
	dto.setMultiplier(this.getMultiplier());
	dto.setOaip(this.getOaip());
	
	dto.setBusinessUnitId((this.getBusinessUnitId()));
	
		return dto;
	}
	public void populate(BaseDTO baseDTO) {
	 YearlyCalDTO dto = (YearlyCalDTO)baseDTO;	
	 this.setEmpId(DataUtil.getString(dto.getEmpId()));
	this.setEmpName(dto.getEmpName());
	this.setBaseSalary(DataUtil.getString(dto.getBaseSalary()));
	this.setLeverage(DataUtil.getString(dto.getLeverage()));
	this.setLeveragePerc(dto.getLeveragePerc());
	//this.setEmpId(DataUtil.getString(dto.getEmpId()));
	this.setIndPerf(dto.getIndPerf());
	this.setDoj(dto.getDoj());
	this.setOaipStartMonth(dto.getOaipStartMonth());
	this.setOaipEndMonth(dto.getOaipEndMonth());
	this.setNoofMonths(dto.getNoofMonths());
	//this.setPeopleSoftJobGrade(dto.getPeopleSoftJobGrade());
	this.setMultiplier(dto.getMultiplier());
	this.setOaip(dto.getOaip());
	this.setBusinessUnitId(dto.getBusinessUnitId());
	//this.setManagerId(DataUtil.getString(dto.getManagerId()));
	//this.setDesignation(dto.getDesignation());
	//this.setDateOfJoin(dto.getDateOfJoin());
	//System.out.println("Format---Stringggggggggggggggg--------"+dto.getDateOfJoin());
	//this.setDateOfEnroll(dto.getDateOfEnroll());
	//this.setDateOfExit(dto.getDateOfExit());
	//this.setOaipBonus(DataUtil.getString(dto.getOaipBonus()));
	//this.setAllBox(dto.getAllBox());
		
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(String baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String getLeverage() {
		return leverage;
	}
	public void setLeverage(String leverage) {
		this.leverage = leverage;
	}
	public int getLeveragePerc() {
		return leveragePerc;
	}
	public void setLeveragePerc(int leveragePerc) {
		this.leveragePerc = leveragePerc;
	}
	public int getIndPerf() {
		return indPerf;
	}
	public void setIndPerf(int indPerf) {
		this.indPerf = indPerf;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getOaipStartMonth() {
		return oaipStartMonth;
	}
	public void setOaipStartMonth(String oaipStartMonth) {
		this.oaipStartMonth = oaipStartMonth;
	}
	public String getOaipEndMonth() {
		return oaipEndMonth;
	}
	public void setOaipEndMonth(String oaipEndMonth) {
		this.oaipEndMonth = oaipEndMonth;
	}
	public int getNoofMonths() {
		return noofMonths;
	}
	public void setNoofMonths(int noofMonths) {
		this.noofMonths = noofMonths;
	}
	public float getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(float multiplier) {
		this.multiplier = multiplier;
	}
	public float getOaip() {
		return oaip;
	}
	public void setOaip(float oaip) {
		this.oaip = oaip;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getOaipExtra() {
		return oaipExtra;
	}
	public void setOaipExtra(float oaipExtra) {
		this.oaipExtra = oaipExtra;
	}
	public int getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(int businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	
	
	
	
	
}
