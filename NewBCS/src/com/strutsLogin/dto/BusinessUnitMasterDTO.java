package com.strutsLogin.dto ;
import java.util.*;
public class BusinessUnitMasterDTO extends BaseDTO implements DropDown{
	private int businessUnitId;
	
	public int getBusinessUnitId() {
		return businessUnitId;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.businessUnitName;
	}
	public String getKey() {
		// TODO Auto-generated method stub
		return String.valueOf(this.businessUnitId);
		
		
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return this.businessUnitName;
	}
	public void setBusinessUnitId(int businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	private String businessUnitName;
	
	public String getBusinessUnitName() {
		return businessUnitName;
	}
	public void setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
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