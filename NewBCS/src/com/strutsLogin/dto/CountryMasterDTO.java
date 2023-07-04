package com.strutsLogin.dto ;
import java.util.*;
public class CountryMasterDTO extends BaseDTO  implements DropDown{
	private int countryId;
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	private String countryName;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
public String getDescription() {
		
		return this.countryName;
	}

	public String getKey() {
		// TODO Auto-generated method stub
		return String.valueOf(this.countryId);
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return this.countryName;
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