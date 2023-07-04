package com.strutsLogin.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.strutsLogin.dto.*;
import com.strutsLogin.util.HibernateUtil;

public class BusinessPerfActualServiceHibImpl implements BusinessPerfActualService {

	public BusinessPerfActualDTO add(BusinessPerfActualDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.save(dto);
		tx.commit();

		HibernateUtil.closeSession();
		return dto;

	}

	public void delete(BusinessPerfActualDTO dto) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.delete(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public void update(BusinessPerfActualDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public BusinessPerfActualDTO get(int id) {

		Session session = HibernateUtil.currentSession();

		BusinessPerfActualDTO dto = (BusinessPerfActualDTO) session
				.get(BusinessPerfActualDTO.class, id);

		HibernateUtil.closeSession();
		return dto;
	}
	public List getBunit(int bunit,int buyear) {
		
 		System.out.println("in getCustomerName method of CustomerListImpl****");
 		List<BusinessPerfActualDTO> result =new ArrayList<BusinessPerfActualDTO>();
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
            	  BusinessPerfActualDTO businessPerfActualDTO=new BusinessPerfActualDTO();
                // System.out.println(rs.getString("EmpId"));
                // System.out.println(rs.getString("EmpName"));
                // System.out.println(rs.getString("BaseSalary"));
                // System.out.println(rs.getString("Leverage"));
                // System.out.println(rs.getString("LeveragePerc"));
                 //System.out.println(rs.getString("INDPerf"));
                 
                // System.out.println(rs.getString("DOJ"));
                // System.out.println(rs.getString("OAIPStartMonth"));
                 
                // System.out.println(rs.getString("OAIPEndMonth"));
                 
                // System.out.println(rs.getString("NoofMonths"));
                // System.out.println(rs.getString("Multiplier"));
                 //System.out.println(rs.getString("OAIP"));
                 //System.out.println(rs.getString("OAIP"));
              
            	  businessPerfActualDTO.setBusinessPerfActualId(rs.getInt(1));
            	  businessPerfActualDTO.setBusinessUnitId(rs.getInt(2));
            	  businessPerfActualDTO.setBuYear(rs.getInt(3));
            	  businessPerfActualDTO.setBuMonth(rs.getInt(4));
            	  businessPerfActualDTO.setMetric1Name(rs.getString(5));
            	  businessPerfActualDTO.setMetric1PlanValue(rs.getInt(6));
            	  businessPerfActualDTO.setMetric2Name(rs.getString(7));
    			
            	  businessPerfActualDTO.setMetric2PlanValue(rs.getInt(8));
            	  businessPerfActualDTO.setMetric3Name(rs.getString(9));
    			
            	  businessPerfActualDTO.setMetric3PlanValue(rs.getInt(10));
                // yearlyCalDTO.setNoofMonths(rs.getInt(10));
                 
                // yearlyCalDTO.setMultiplier(rs.getInt(11));
                // yearlyCalDTO.setOaip(rs.getInt(12));
 		    
 		    result.add(businessPerfActualDTO);
 		  
              }
               // result.add(empAllDTO);
           }

           catch (Exception e) {
              e.printStackTrace();
           }
 			return result;
 	        }
	
	
	
	public List getList() {
		Session s = HibernateUtil.currentSession();

		Query q = s.createQuery("from BusinessPerfActualDTO");

		List l = q.list();

		HibernateUtil.closeSession();
		return l;
	}

	public List getList(SearchCriteria searchCriteria) {

		Session s = HibernateUtil.currentSession();

		Criteria criteria = s.createCriteria(BusinessPerfActualDTO.class);

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
