package com.strutsLogin.delegate;


import java.util.List;

import com.strutsLogin.dto.PlanMasterDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.service.PlanMasterService;
import com.strutsLogin.service.ServiceLocator;


public class PlanMasterServiceDelegate {

	private static PlanMasterService service = ServiceLocator.getInstance()
			.getPlanMasterService();
	
	public static PlanMasterDTO add(PlanMasterDTO dto) {

		System.out.println("in ser.Delegat add");
		
		dto = service.add(dto);

		return dto;
	}

	public static void delete(PlanMasterDTO dto) {
		System.out.println("in ser.Delegat delete");
		 service.delete(dto);
	}

	public static void update(PlanMasterDTO dto) {
		System.out.println("in ser.Delegat update");
		 service.update(dto);
		 
		 System.out.println("successfully updated record");
		
	}

	public static PlanMasterDTO get(int id) {
		System.out.println("in ser.Delegat get DTO");
		PlanMasterDTO dto = new PlanMasterDTO();
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
		
		//System.out.println("Listsize"+l.size);

		System.out.println("in delegate & return list"+l.size());
		return l;
	}
	
	
}
