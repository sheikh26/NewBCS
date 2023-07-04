package com.strutsLogin.delegate;

import java.util.Date;
import java.util.List;

import com.strutsLogin.dto.CountryMasterDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.service.CountryMasterService;
import com.strutsLogin.service.ServiceLocator;


public class CountryMasterServiceDelegate {

	private static CountryMasterService service = ServiceLocator.getInstance()
			.getCountryMasterService();
	
	public static CountryMasterDTO add(CountryMasterDTO dto) {

		System.out.println("in ser.Delegat add");
		
		dto = service.add(dto);

		return dto;
	}

	public static void delete(CountryMasterDTO dto) {
		System.out.println("in ser.Delegat delete");
		 service.delete(dto);

		
	}

	public static void update(CountryMasterDTO dto) {
		System.out.println("in ser.Delegat update");
		 service.update(dto);
		 
		 System.out.println("successfully updated record");
		
	}

	public static CountryMasterDTO get(int id) {
		System.out.println("in ser.Delegat get DTO");
		CountryMasterDTO dto = new CountryMasterDTO();
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
