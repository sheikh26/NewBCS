package com.strutsLogin.delegate;

import java.util.Date;
import java.util.List;
import com.strutsLogin.dto.BusinessPerfActualDTO;
import com.strutsLogin.dto.SearchCriteria;


import com.strutsLogin.service.BusinessPerfActualService;
import com.strutsLogin.service.ServiceLocator;

public class BusinessPerfActualServiceDelegate {

	private static BusinessPerfActualService service = ServiceLocator.getInstance()
			.getBusinessPerfActualService();
	
	public static BusinessPerfActualDTO add(BusinessPerfActualDTO dto) {

		System.out.println("in ser.Delegat add");
		
		dto = service.add(dto);

		return dto;
	}

	public static void delete(BusinessPerfActualDTO dto) {
		System.out.println("in ser.Delegat delete");
		 service.delete(dto);

		
	}

	public static void update(BusinessPerfActualDTO dto) {
		System.out.println("in ser.Delegat update");
		 service.update(dto);
		 
		 System.out.println("successfully updated record");
		
	}
	
	//
	public static List getBunit(int bunit,int buyear) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getBunit(bunit,buyear);

		System.out.println("in delegate &return list");
		return l;
	}
	//

	public static BusinessPerfActualDTO get(int id) {
		System.out.println("in ser.Delegat get DTO");
		BusinessPerfActualDTO dto = new BusinessPerfActualDTO();
		dto = service.get(id);

		return dto;
	}

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
