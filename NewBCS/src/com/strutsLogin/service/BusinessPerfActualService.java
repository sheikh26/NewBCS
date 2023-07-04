package com.strutsLogin.service;

import java.util.*;

import com.strutsLogin.dto.*;

public interface  BusinessPerfActualService {
	
	public BusinessPerfActualDTO add(BusinessPerfActualDTO dto);
	
	public void delete(BusinessPerfActualDTO dto);
	
	public void update(BusinessPerfActualDTO dto);
	
	public List getList();
	
	public List getList(SearchCriteria searchCriteria);
	
	public BusinessPerfActualDTO get(int id);
	
	public List getBunit(int bunit,int buyear);
	
}
