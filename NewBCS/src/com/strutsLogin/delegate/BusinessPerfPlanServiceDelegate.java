package com.strutsLogin.delegate;

import java.util.Date;
import java.util.List;
import com.strutsLogin.dto.BusinessPerfPlanDTO;
import com.strutsLogin.dto.SearchCriteria;


import com.strutsLogin.service.BusinessPerfPlanService;
import com.strutsLogin.service.ServiceLocator;

public class BusinessPerfPlanServiceDelegate {

	private static BusinessPerfPlanService service = ServiceLocator.getInstance()
			.getBusinessPerfPlanService();
	
	public static BusinessPerfPlanDTO add(BusinessPerfPlanDTO dto) {

		System.out.println("in ser.Delegat add");
		
		dto = service.add(dto);

		return dto;
	}

	public static void delete(BusinessPerfPlanDTO dto) {
		System.out.println("in ser.Delegat delete");
		 service.delete(dto);

		
	}

	public static void update(BusinessPerfPlanDTO dto) {
		System.out.println("in ser.Delegat update");
		 service.update(dto);
		 
		 System.out.println("successfully updated record");
		
	}

	public static BusinessPerfPlanDTO get(int id) {
		System.out.println("in ser.Delegat get DTO");
		BusinessPerfPlanDTO dto = new BusinessPerfPlanDTO();
		dto = service.get(id);

		return dto;
	}
//
	
	public static List getBunit(int bunit) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getBunit(bunit);

		System.out.println("in delegate &return list");
		return l;
	}
	
	//
	
	
	
	public static List getList() {
		System.out.println("in ser.Delegat GetList");
		List l = service.getList();

		System.out.println("in delegate &return list");
		return l;
	}
	
	public static List getList(SearchCriteria searchCriteria) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getList(searchCriteria);

		System.out.println("in delegate & return list");
		return l;
	}
	
	
}
