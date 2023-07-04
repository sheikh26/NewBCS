package com.strutsLogin.service;

import java.util.*;

import com.strutsLogin.dto.*;

public interface  BusinessPerfPlanService {
	
	public BusinessPerfPlanDTO add(BusinessPerfPlanDTO dto);
	
	public void delete(BusinessPerfPlanDTO dto);
	
	public void update(BusinessPerfPlanDTO dto);
	
	public List getList();
	
	public List getList(SearchCriteria searchCriteria);
	
	public BusinessPerfPlanDTO get(int id);
	
	public List getBunit(int bunit);
	
}
