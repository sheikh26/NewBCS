package com.strutsLogin.service;

import java.util.*;

import com.strutsLogin.dto.*;

public interface  OaipService {
	
	
	
	public List getList(EmployeeMasterDTO dto);
	public List getList(SearchCriteria searchCriteria);
	
	public List getDateOfJoining(int year,int month,int bunit);
	public List getcal(int year,int bunit);
	//
	public List getcalforemployee(int year);
	//
	public List getCalculate(int empId);

	
}
