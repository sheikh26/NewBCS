package com.strutsLogin.delegate;


import java.util.List;


import com.strutsLogin.dto.EmployeePerformanceDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.service.CommonService;
import com.strutsLogin.service.EmployeePerformanceService;
import com.strutsLogin.service.ServiceLocator;

public class EmployeePerformanceServiceDelegate
{
  private static EmployeePerformanceService service = ServiceLocator.getInstance()
    .getEmployeePerformanceService();

  
  public static EmployeePerformanceDTO add(EmployeePerformanceDTO dto) {

		System.out.println("in ser.Delegat add");
		dto = service.add(dto);

		return dto;
	}

	public static void delete(EmployeePerformanceDTO dto) {
		System.out.println("in ser.Delegat delete");
		 service.delete(dto);

		
	}

	public static void update(EmployeePerformanceDTO dto) {
		System.out.println("in ser.Delegat update");
		 service.update(dto);
		 
		 System.out.println("successfully updated record");
		
	}

	public static EmployeePerformanceDTO get(int id) {
		System.out.println("in ser.Delegat get DTO");
		EmployeePerformanceDTO dto = new EmployeePerformanceDTO();
		dto = service.get(id);

		return dto;
	}

	public static List getBunit(int bunit,int buyear) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getBunit(bunit,buyear);

		System.out.println("in delegate &return list");
		return l;
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