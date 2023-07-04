package com.strutsLogin.service;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.strutsLogin.dto.*;
import com.strutsLogin.util.HibernateUtil;

public class EmployeePerformanceHibImpl implements EmployeePerformanceService {

	public EmployeePerformanceDTO add(EmployeePerformanceDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.save(dto);
		tx.commit();

		HibernateUtil.closeSession();
		return dto;

	}

	public void delete(EmployeePerformanceDTO dto) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.delete(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public void update(EmployeePerformanceDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public EmployeePerformanceDTO get(int id) {

		Session session = HibernateUtil.currentSession();

		EmployeePerformanceDTO dto = (EmployeePerformanceDTO) session
				.get(EmployeePerformanceDTO.class, id);

		HibernateUtil.closeSession();
		return dto;
	}

	public List getList() {
		Session s = HibernateUtil.currentSession();

		//Query q = s.createQuery("from EmployeeMasterDTO");
		
		Query q=s.createQuery("from EmployeeMasterDTO left outer join CountryMasterDTO on EmployeeMasterDTO.Country=CountryMasterDTO.CountryId");

		List l = q.list();

		HibernateUtil.closeSession();
		return l;
	}
	
public List getBunit(int bunit,int buyear) {
		
 		System.out.println("in getCustomerName method of CustomerListImpl****");
 		List<EmployeePerformanceDTO> result =new ArrayList<EmployeePerformanceDTO>();
 		//List<LavarageDTO> result1 =new ArrayList<LavarageDTO>();
 		
 		//List<EmployeeMasterDTO> result=null;
 		Session session = HibernateUtil.currentSession();
 		String connectionUrl = 
 	           "jdbc:sqlserver://localhost:1433;" +
 	           "databaseName=OAIPTEST;integratedSecurity=true;";

 		ResultSet rs=null;
 	        Connection con = null;
 	        Statement stmt = null;
 	        try {
 	         
 	          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 	          con = DriverManager.getConnection(connectionUrl);
 		
 			CallableStatement cstmt = 
              con.prepareCall("{call dbo.USP_SelectPlanActual(?)}");
 			 cstmt.setInt(1, bunit);
 			cstmt.setInt(2, buyear);
 			
              rs=cstmt.executeQuery();
              
       
              while (rs.next()) {
             	 //
             	 //LavarageDTO dto=new LavarageDTO();
             	 //
            	  EmployeePerformanceDTO employeePerformanceDTO=new EmployeePerformanceDTO();
                
            	  employeePerformanceDTO.setEmpId(rs.getInt(1));
            	  //employeePerformanceDTO.setBusinessUnitId(rs.getInt(2));
            	  employeePerformanceDTO.setYear(rs.getInt(2));
            	  employeePerformanceDTO.setPerformance(rs.getInt(3));
            	
 		    result.add(employeePerformanceDTO);
 		  
              }
               // result.add(empAllDTO);
           }

           catch (Exception e) {
              e.printStackTrace();
           }
 			return result;
 	        }

	public List getList(SearchCriteria searchCriteria) {

		Session s = HibernateUtil.currentSession();

		Criteria criteria = s.createCriteria(EmployeePerformanceDTO.class);

		String orderBY = searchCriteria.getOrderBy();
		if (orderBY != null) {
			if (searchCriteria.isAsc()) {
				criteria.addOrder(Order.asc(orderBY));
			} else {
				criteria.addOrder(Order.desc(orderBY));
			}
		}

		List l = criteria.list();
		HibernateUtil.closeSession();
		return l;

	}


}
