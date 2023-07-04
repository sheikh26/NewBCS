package com.strutsLogin.delegate;

import java.util.Date;
import java.util.List;

import com.strutsLogin.dto.BusinessUnitMasterDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.service.BusinessUnitMasterService;
import com.strutsLogin.service.ServiceLocator;





public class BusinessUnitMasterServiceDelegate {

	private static BusinessUnitMasterService service = ServiceLocator.getInstance()
			.getBusinessUnitMasterService();
	
	public static BusinessUnitMasterDTO add(BusinessUnitMasterDTO dto) {

		System.out.println("in ser.Delegat add");
		
		dto = service.add(dto);

		return dto;
	}

	public static void delete(BusinessUnitMasterDTO dto) {
		System.out.println("in ser.Delegat delete");
		 service.delete(dto);

		
	}

	public static void update(BusinessUnitMasterDTO dto) {
		System.out.println("in ser.Delegat update");
		 service.update(dto);
		 
		 System.out.println("successfully updated record");
		
	}

	public static BusinessUnitMasterDTO get(int id) {
		System.out.println("in ser.Delegat get DTO");
		BusinessUnitMasterDTO dto = new BusinessUnitMasterDTO();
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
