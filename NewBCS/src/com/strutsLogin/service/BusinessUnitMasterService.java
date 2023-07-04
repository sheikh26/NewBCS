package com.strutsLogin.service;

import java.util.*;

import com.strutsLogin.dto.BusinessUnitMasterDTO;
import com.strutsLogin.dto.SearchCriteria;


public interface  BusinessUnitMasterService {
	
	public BusinessUnitMasterDTO add(BusinessUnitMasterDTO dto);
	
	public void delete(BusinessUnitMasterDTO dto);
	
	public void update(BusinessUnitMasterDTO dto);
	
	public List getList();
	
	public List getList(SearchCriteria searchCriteria);
	
	public BusinessUnitMasterDTO get(int id);
	
}
