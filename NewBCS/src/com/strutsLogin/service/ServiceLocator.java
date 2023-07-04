package com.strutsLogin.service;

import java.util.HashMap;
import com.strutsLogin.service.*;

public class ServiceLocator {

	// Singlton Pattern - Core Pattern
	// Factory Pattern - Core Pattern
	// ServiceLocator pattern - J2EE Pattern

	private final String DATABASE = "hibernate";

	private HashMap serviceCache = new HashMap();

	//Other class can not create ServiceLocator instance
	private ServiceLocator() {
		
	}

	//Static variables to keep Singlton object	
	private static ServiceLocator locator;

	public static ServiceLocator getInstance() {
		System.out.println("In Service Locator get Instance");
		if (locator == null) {
			locator = new ServiceLocator();
		}
		return locator;
	}
	

	public CommonService getCommonService() {
	    CommonService service = null;

	    if ("hibernate".equals("hibernate")) {
	      service = new CommonService();
	    }
	    return service;
	  }
	
	public EmployeeMasterService getEmployeeMasterService() {
		EmployeeMasterService service = (EmployeeMasterService) serviceCache.get("EmployeeMasterService");
		System.out.println("In Service Locator getEmployeeMaster ");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new EmployeeMasterServiceHibImpl();
			} 
			serviceCache.put("EmployeeMasterService", service);
		}
		return service;
	}
	
	
	
	
	
	
	public ReadExcelService getReadExcelService() {
		ReadExcelService service = (ReadExcelService) serviceCache.get("ReadExcelService");
		System.out.println("In Service Locator getReadExcel");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new ReadExcelService();
			} 
			serviceCache.put("ReadExcelService", service);
		}
		return service;
	}
	
	
	
	
	public PlanMasterService getPlanMasterService() {
		PlanMasterService service = (PlanMasterService) serviceCache.get("PlanMasterService");
		System.out.println("In Service Locator getPlanMaster");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new PlanMasterServiceHibImpl();
			} 
			serviceCache.put("PlanMasterService", service);
		}
		return service;
	}
	
	public LavarageService getLavarageService() {
		LavarageService service = (LavarageService) serviceCache.get("LavarageService");
		System.out.println("In Service Locator getLavarage ");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new LavarageServiceHibImpl();
			} 
			serviceCache.put("LavarageService", service);
		}
	
		return service;
	
	}
	
	public CountryMasterService getCountryMasterService() {
		CountryMasterService service = (CountryMasterService) serviceCache.get("CountryMasterService");
		System.out.println("In Service Locator getCountryMaster ");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new CountryMasterServiceHibImpl();
			} 
			serviceCache.put("CountryMasterService", service);
		}
		return service;
	}
	
	public BusinessUnitMasterService getBusinessUnitMasterService() {
		BusinessUnitMasterService service = (BusinessUnitMasterService) serviceCache.get("BusinessUnitMasterService");
		System.out.println("In Service Locator getBusinessUnitMaster ");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new BusinessUnitMasterServiceHibImpl();
			} 
			serviceCache.put("BusinessUnitMasterService", service);
		}
		return service;
	}
	
	public BusinessPerfPlanService getBusinessPerfPlanService() {
		BusinessPerfPlanService service = (BusinessPerfPlanService) serviceCache.get("BusinessPerfPlanService");
		System.out.println("In Service Locator getBusinessPerfPlan ");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new BusinessPerfPlanServiceHibImpl();
			} 
			serviceCache.put("BusinessPerfPlanService", service);
		}
		return service;
	}
	public BusinessPerfActualService getBusinessPerfActualService() {
		BusinessPerfActualService service = (BusinessPerfActualService) serviceCache.get("BusinessPerfActualService");
		System.out.println("In Service Locator getBusinessPerfActual ");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new BusinessPerfActualServiceHibImpl();
			} 
			serviceCache.put("BusinessPerfActualService", service);
		}
		return service;
	}
	
	
	
	public OaipService getOaipService() {
		OaipService service = (OaipService) serviceCache.get("OaipService");
		System.out.println("In Service Locator getOaipService ");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new OaipServiceHibImpl();
			} 
			serviceCache.put("OaipService", service);
		}
		return service;
	}
	
	public EmployeePerformanceService getEmployeePerformanceService() {
		EmployeePerformanceService service = (EmployeePerformanceService) serviceCache.get("EmployeePerformanceService");
		System.out.println("In Service Locator getOaipService ");
		if (service == null) {

			if (DATABASE == "hibernate") {
				service = new EmployeePerformanceHibImpl();
			} 
			serviceCache.put("EmployeePerformanceService", service);
		}
		return service;
	}
	
	
	
	
}
