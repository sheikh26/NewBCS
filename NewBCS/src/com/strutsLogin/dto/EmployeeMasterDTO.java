package com.strutsLogin.dto ;
import java.util.*;
public class EmployeeMasterDTO extends BaseDTO implements DropDown{
	
	private String[] allBox;
	private int empId;
	private int oaipBonus;
	private String peopleSoftId;
	private String firstName;
	private String lastName;
	private String country;
	private int planId;
	private String peopleSoftJobGrade;
	private int levarageGrade;
	private int baseSalaryAnnual;
	private String managerId;
	private String designation;
	private String dateOfJoin;
	private String dateOfEnroll;
	private String dateOfExit;
	private String fullName;
	private int businessUnitId;
	
	
	
	public int getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(int businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String[] getAllBox() {
		return allBox;
	}
	public void setAllBox(String[] allBox) {
		this.allBox = allBox;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getOaipBonus() {
		return oaipBonus;
	}
	public void setOaipBonus(int oaipBonus) {
		this.oaipBonus = oaipBonus;
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
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPeopleSoftJobGrade() {
		return peopleSoftJobGrade;
	}
	public void setPeopleSoftJobGrade(String peopleSoftJobGrade) {
		this.peopleSoftJobGrade = peopleSoftJobGrade;
	}
	public int getLevarageGrade() {
		return levarageGrade;
	}
	public void setLevarageGrade(int levarageGrade) {
		this.levarageGrade = levarageGrade;
	}
	public int getBaseSalaryAnnual() {
		return baseSalaryAnnual;
	}
	public void setBaseSalaryAnnual(int baseSalaryAnnual) {
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
	public String getDateOfExit() {
		return dateOfExit;
	}
	public void setDateOfExit(String dateOfExit) {
		this.dateOfExit = dateOfExit;
	}
	
	
	
//	public String getDescription() {
//		// TODO Auto-generated method stub
//		return this.managerId;
//		
//	}
//	public String getKey() {
//		// TODO Auto-generated method stub
//		return String.valueOf(this.managerId);
//	}
//	public String getValue() {
//		// TODO Auto-generated method stub
//		return this.managerId;
//	}
//	
	
	
	  public  String getKey(){
		  return String.valueOf(this.empId);
	  }

	  public  String getValue(){
		  return this.firstName;
	  }

	  public  String getDescription(){
		  return this.firstName;
	  }
	  
	  
	
	
	
}