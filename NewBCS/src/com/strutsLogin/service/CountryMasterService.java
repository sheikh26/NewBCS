package com.strutsLogin.service;

import java.util.*;

import com.strutsLogin.dto.CountryMasterDTO;
import com.strutsLogin.dto.SearchCriteria;

public interface  CountryMasterService {
	
	public CountryMasterDTO add(CountryMasterDTO dto);
	
	public void delete(CountryMasterDTO dto);
	
	public void update(CountryMasterDTO dto);
	
	public List getList();
	
	public List getList(SearchCriteria searchCriteria);
	
	public CountryMasterDTO get(int id);
	
}
