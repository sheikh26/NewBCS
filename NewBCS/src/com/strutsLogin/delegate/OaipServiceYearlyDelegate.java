/*package com.strutsLogin.delegate;

import java.util.Date;
import java.util.List;
import com.strutsLogin.dto.BusinessPerfActualDTO;
import com.strutsLogin.dto.CountryMasterDTO;
import com.strutsLogin.dto.EmployeeMasterDTO;

import com.strutsLogin.dto.SearchCriteria;


import com.strutsLogin.service.BusinessPerfActualService;
import com.strutsLogin.service.OaipService;
import com.strutsLogin.service.OaipYearlyService;
import com.strutsLogin.service.ServiceLocator;

public class OaipServiceYearlyDelegate {

	private static OaipYearlyService Service = (OaipYearlyService) ServiceLocator.getInstance()
			.getOaipYearlyService();
	
	

	

	public static List getList(SearchCriteria searchCriteria) {
		System.out.println("in ser.Delegat GetList");
		List l = Service.getList(searchCriteria);

		System.out.println("in delegate &return list");
		return l;
	}
	
	public static List getDateOfJoining(int year) {
		System.out.println("in ser.Delegat GetList");
		List l = Service.getDateOfJoining(year);

		System.out.println("in delegate &return list");
		return l;
	}
	
	public static List getList(EmployeeMasterDTO dto) {
		System.out.println("in ser.Delegat GetList");
		List l = Service.getList(dto);

		System.out.println("in delegate & return list");
		return l;
	}
	
	
	
public static List getCalculate(int empId) {
		
		 EmployeeMasterDTO dto=new EmployeeMasterDTO();
		 List l =Service.getCalculate(empId);
		 System.out.println("successfully updated record");
		 System.out.println("successfully updated recordddddddddddddddddddddd"+dto.getEmpId());
		 return l;
		
	}


	
	

	
	
}
*/