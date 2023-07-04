package com.strutsLogin.dto;

public class EmployeePerformanceDTO extends BaseDTO {

	
	 private int businessUnitId;
	private int year;
	
	private int id;
	
	private int empId;
	
	private String managerId;
	
	private int performance;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	/*public String getDescription() {
		// TODO Auto-generated method stub
		return String.valueOf(this.empId);
	}

	public String getKey() {
		// TODO Auto-generated method stub
		return String.valueOf(this.empId);
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return String.valueOf(this.empId);
	}

	public String getDescription1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getKey1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getValue1() {
		// TODO Auto-generated method stub
		return null;
	}*/

	public int getBusinessUnitId() {
		return businessUnitId;
	}

	public void setBusinessUnitId(int businessUnitId) {
		this.businessUnitId = businessUnitId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	
	
	
	


}
