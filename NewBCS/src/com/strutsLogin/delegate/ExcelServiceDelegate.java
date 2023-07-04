package com.strutsLogin.delegate;

import java.util.Collection;
import java.util.List;

import com.strutsLogin.dto.ExcelFileDTO;
import com.strutsLogin.dto.LavarageDTO;
import com.strutsLogin.exception.BaseException;
import com.strutsLogin.service.LavarageService;
import com.strutsLogin.service.ReadExcelService;
import com.strutsLogin.service.ServiceLocator;

public class ExcelServiceDelegate {

	private static ReadExcelService service = ServiceLocator.getInstance().getReadExcelService();
	
	public static void add(List<ExcelFileDTO> ExcelDTOList) throws BaseException {

		System.out.println("in ExcelServiceDelegat add method");
		
		 service.add(ExcelDTOList);
		
	}
}
