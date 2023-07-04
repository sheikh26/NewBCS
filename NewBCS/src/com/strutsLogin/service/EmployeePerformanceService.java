package com.strutsLogin.service;

import java.util.List;


import com.strutsLogin.dto.EmployeePerformanceDTO;
import com.strutsLogin.dto.SearchCriteria;

public interface EmployeePerformanceService {
	
	
public EmployeePerformanceDTO add(EmployeePerformanceDTO dto);
	
	public void delete(EmployeePerformanceDTO dto);
	
	public void update(EmployeePerformanceDTO dto);
	
	public List getList();
	
	public List getList(SearchCriteria searchCriteria);
	
	public EmployeePerformanceDTO get(int id);
	
	public List getBunit(int bunit,int buyear);

}
