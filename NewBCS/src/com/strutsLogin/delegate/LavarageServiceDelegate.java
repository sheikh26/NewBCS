package com.strutsLogin.delegate;

import java.util.Date;
import java.util.List;

import com.strutsLogin.dto.LavarageDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.service.LavarageService;
import com.strutsLogin.service.ServiceLocator;

import sun.print.resources.serviceui;


public class LavarageServiceDelegate {

	private static LavarageService service = ServiceLocator.getInstance()
			.getLavarageService();
	
	public static LavarageDTO add(LavarageDTO dto) {

		System.out.println("in ser.Delegat add");
		
		dto = service.add(dto);

		return dto;
	}

	public static void delete(LavarageDTO dto) {
		System.out.println("in ser.Delegat delete");
		 service.delete(dto);

		
	}

	public static void update(LavarageDTO dto) {
		System.out.println("in ser.Delegat update");
		 service.update(dto);
		 
		 System.out.println("successfully updated record");
		
	}

	public static LavarageDTO get(int id) {
		System.out.println("in ser.Delegat get DTO");
		LavarageDTO dto = new LavarageDTO();
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
