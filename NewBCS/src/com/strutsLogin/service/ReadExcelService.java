package com.strutsLogin.service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.strutsLogin.dto.ExcelFileDTO;
import com.strutsLogin.dto.LavarageDTO;
import com.strutsLogin.exception.BaseException;
import com.strutsLogin.util.HibernateUtil;

public class ReadExcelService {

	public void add(List<ExcelFileDTO> ExcelDTOList) throws BaseException {

		
		try
		{
			System.out.println("\nIn ReadExcelService");
			Session session = HibernateUtil.currentSession();		
			Transaction tx = session.beginTransaction();
			
			Iterator itr=ExcelDTOList.iterator();
			while (itr.hasNext()) {
				ExcelFileDTO excel = (ExcelFileDTO) itr.next();
				session.save(excel);
			}	
			
			tx.commit();
	
			HibernateUtil.closeSession();
			System.out.println("\n successfully entered in db");
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception in ReadExcelService"+e.getMessage());
			throw new BaseException("Exception in ReadExcelService");
		}
	}
}
