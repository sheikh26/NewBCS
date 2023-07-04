package com.strutsLogin.service;

import java.util.*;
import com.strutsLogin.dto.*;

public interface  LavarageService {
	
	public LavarageDTO add(LavarageDTO dto);
	
	public void delete(LavarageDTO dto);
	
	public void update(LavarageDTO dto);
	
	public List getList();
	
	public List getList(SearchCriteria searchCriteria);
	
	public LavarageDTO get(int id);
	
}
