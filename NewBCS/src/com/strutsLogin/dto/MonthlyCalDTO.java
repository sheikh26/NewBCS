package com.strutsLogin.dto;

public class MonthlyCalDTO extends BaseDTO{
	
	private String empId;
	
	private String empName;
	
	private String baseSalary;
	
	private String gradeName;
	private int leveragePerc;
	
	private float oaip;

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

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public int getLeveragePerc() {
		return leveragePerc;
	}

	public void setLeveragePerc(int leveragePerc) {
		this.leveragePerc = leveragePerc;
	}

	public float getOaip() {
		return oaip;
	}

	public void setOaip(float oaip) {
		this.oaip = oaip;
	}
	
}
