package com.strutsLogin.delegate;

import java.util.Date;
import java.util.List;
import com.strutsLogin.dto.EmployeeMasterDTO;
import com.strutsLogin.dto.SearchCriteria;


import com.strutsLogin.service.EmployeeMasterService;
import com.strutsLogin.service.ServiceLocator;

public class EmployeeMasterServiceDelegate {

	private static EmployeeMasterService service = ServiceLocator.getInstance()
			.getEmployeeMasterService();
	
	public static EmployeeMasterDTO add(EmployeeMasterDTO dto) {

		System.out.println("in ser.Delegat add");
		dto = service.add(dto);

		return dto;
	}

	public static void delete(EmployeeMasterDTO dto) {
		System.out.println("in ser.Delegat delete");
		 service.delete(dto);

		
	}

	public static void update(EmployeeMasterDTO dto) {
		System.out.println("in ser.Delegat update");
		 service.update(dto);
		 
		 System.out.println("successfully updated record");
		
	}

	public static EmployeeMasterDTO get(int id) {
		System.out.println("in ser.Delegat get DTO");
		EmployeeMasterDTO dto = new EmployeeMasterDTO();
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
