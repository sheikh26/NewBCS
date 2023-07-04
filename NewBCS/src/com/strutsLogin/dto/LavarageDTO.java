package com.strutsLogin.dto ;
import java.util.*;
public class LavarageDTO extends BaseDTO implements DropDown {
	
	
	
	//Override implementation of Dropdown
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.gradeName;
	}
	public String getKey() {
		// TODO Auto-generated method stub
		return String.valueOf(this.leverageId);
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return this.gradeName;
	}
	
	
	// Local Variables
	
	
	private int leverageId;
	private int businessUnitId;
	private String gradeName;
	private int countryId;
	private int leveragePerc;
	
	public int getLeverageId() {
		return leverageId;
	}
	public void setLeverageId(int leverageId) {
		this.leverageId = leverageId;
	}
	
	
	public int getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(int businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	
	public int getLeveragePerc() {
		return leveragePerc;
	}
	public void setLeveragePerc(int leveragePerc) {
		this.leveragePerc = leveragePerc;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
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
	}
}