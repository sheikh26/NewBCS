package com.strutsLogin.service;

import java.util.*;
import com.strutsLogin.dto.*;




public interface  PlanMasterService {
	
	public PlanMasterDTO add(PlanMasterDTO dto);
	
	public void delete(PlanMasterDTO dto);
	
	public void update(PlanMasterDTO dto);
	
	public List getList();
	
	public List getList(SearchCriteria searchCriteria);
	
	public PlanMasterDTO get(int id);
	
}
