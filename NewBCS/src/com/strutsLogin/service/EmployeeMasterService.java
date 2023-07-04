package com.strutsLogin.service;

import java.util.*;
import com.strutsLogin.dto.*;

public interface  EmployeeMasterService {
	
	public EmployeeMasterDTO add(EmployeeMasterDTO dto);
	
	public void delete(EmployeeMasterDTO dto);
	
	public void update(EmployeeMasterDTO dto);
	
	public List getList();
	
	public List getList(SearchCriteria searchCriteria);
	
	public EmployeeMasterDTO get(int id);
	
}
