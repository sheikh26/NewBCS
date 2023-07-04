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

public class BusinessPerfPlanServiceHibImpl implements BusinessPerfPlanService {

	public BusinessPerfPlanDTO add(BusinessPerfPlanDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.save(dto);
		tx.commit();

		HibernateUtil.closeSession();
		return dto;

	}

	public void delete(BusinessPerfPlanDTO dto) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.delete(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public void update(BusinessPerfPlanDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public BusinessPerfPlanDTO get(int id) {

		Session session = HibernateUtil.currentSession();

		BusinessPerfPlanDTO dto = (BusinessPerfPlanDTO) session
				.get(BusinessPerfPlanDTO.class, id);

		HibernateUtil.closeSession();
		return dto;
	}

	public List getList() {
		Session s = HibernateUtil.currentSession();

		Query q = s.createQuery("from BusinessPerfPlanDTO");

		List l = q.list();

		HibernateUtil.closeSession();
		return l;
	}

	public List getList(SearchCriteria searchCriteria) {

		Session s = HibernateUtil.currentSession();

		Criteria criteria = s.createCriteria(BusinessPerfPlanDTO.class);

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

	public List getBunit(int bunit) {
		
		 		System.out.println("in getCustomerName method of CustomerListImpl****");
		 		List<BusinessPerfPlanDTO> result =new ArrayList<BusinessPerfPlanDTO>();
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
		              con.prepareCall("{call dbo.USP_SelectPlan(?)}");
		 			 cstmt.setInt(1, bunit);
		 			
		              rs=cstmt.executeQuery();
		              
		       
		              while (rs.next()) {
		             	 //
		             	 //LavarageDTO dto=new LavarageDTO();
		             	 //
		             	BusinessPerfPlanDTO businessPerfPlanDTO=new BusinessPerfPlanDTO();
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
		              
		                 businessPerfPlanDTO.setBuPerfPlanId(rs.getInt(1));
		                 businessPerfPlanDTO.setBusinessUnitId(rs.getInt(2));
		                 businessPerfPlanDTO.setBuYear(rs.getInt(3));
		                 businessPerfPlanDTO.setMetric1Name(rs.getString(4));
		                 businessPerfPlanDTO.setMetric1PlanValue(rs.getInt(5));
		                 businessPerfPlanDTO.setMetric2Name(rs.getString(6));
		    			
		                 businessPerfPlanDTO.setMetric2PlanValue(rs.getInt(7));
		                 businessPerfPlanDTO.setMetric3Name(rs.getString(8));
		    			
		                 businessPerfPlanDTO.setMetric3PlanValue(rs.getInt(9));
		                // yearlyCalDTO.setNoofMonths(rs.getInt(10));
		                 
		                // yearlyCalDTO.setMultiplier(rs.getInt(11));
		                // yearlyCalDTO.setOaip(rs.getInt(12));
		 		    
		 		    result.add(businessPerfPlanDTO);
		 		  
		              }
		               // result.add(empAllDTO);
		           }

		           catch (Exception e) {
		              e.printStackTrace();
		           }
		 			return result;
		 	        }

	
/*public List getbUnit(int bunit) {
		
		//public List getList() {
			Session s = HibernateUtil.currentSession();

			Query q = s.createQuery("from BusinessPerfPlanDTO where businessUnitId=?");
           
			List l = q.list();
			System.out.println("hib imple oaipNNNNNNNNNNNNNNN"+l.size());

			HibernateUtil.closeSession();
			return l;
		
	}*/



}
