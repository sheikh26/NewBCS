package com.strutsLogin.delegate;


import java.util.List;
import com.strutsLogin.dto.EmployeeMasterDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.service.OaipService;
import com.strutsLogin.service.ServiceLocator;
public class OaipServiceDelegate {

	private static OaipService service = ServiceLocator.getInstance()
			.getOaipService();
	
	

	

	public static List getList(SearchCriteria searchCriteria) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getList(searchCriteria);

		System.out.println("in delegate &return list");
		return l;
	}
	
	public static List getcal(int year,int bunit) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getcal(year,bunit);

		System.out.println("in delegate &return list");
		return l;
	}
	
	//for employee perf
	
	public static List getcalforemployee(int year) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getcalforemployee(year);

		System.out.println("in delegate &return list");
		return l;
	}
	
	//
	
	
	public static List getDateOfJoining(int year,int month,int bunit) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getDateOfJoining(year,month,bunit);

		System.out.println("in delegate &return list");
		return l;
	}
	
	public static List getList(EmployeeMasterDTO dto) {
		System.out.println("in ser.Delegat GetList");
		List l = service.getList(dto);

		System.out.println("in delegate & return list");
		return l;
	}
	
	
	
public static List getCalculate(int empId) {
		
		 EmployeeMasterDTO dto=new EmployeeMasterDTO();
		 List l =service.getCalculate(empId);
		 System.out.println("successfully updated record");
		 System.out.println("successfully updated recordddddddddddddddddddddd"+dto.getEmpId());
		 return l;
		
	}


	
	

	
	
}
