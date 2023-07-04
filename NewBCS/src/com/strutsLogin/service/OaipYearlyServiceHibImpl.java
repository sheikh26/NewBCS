/*package com.strutsLogin.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.jgroups.protocols.SIZE;

import com.strutsLogin.dto.*;
import com.strutsLogin.util.HibernateUtil;

public class OaipYearlyServiceHibImpl implements OaipYearlyService {

	public List getList() {
		Session s = HibernateUtil.currentSession();

		Query q = s.createQuery("from EmployeeMasterDTO");

		List l = q.list();
		System.out.println("hib imple oaipNNNNNNNNNNNNNNN"+l.size());

		HibernateUtil.closeSession();
		return l;
	}

	public List getList(EmployeeMasterDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	public List getList(SearchCriteria searchCriteria) {
		Session s = HibernateUtil.currentSession();

		Query q = s.createQuery("from EmployeeMasterDTO");

		List l = q.list();
		System.out.println("hib imple oaipNNNNNNNNNNNNNNN"+l.size());

		HibernateUtil.closeSession();
		return l;
	}
	
public List getDateOfJoining(int year) {
		
		System.out.println("in getCustomerName method of CustomerListImpl****");
		List<EmployeeMasterDTO> result =new ArrayList<EmployeeMasterDTO>();
		
		
		Session session = HibernateUtil.currentSession();
		
		String connectionUrl = 
	           "jdbc:sqlserver://localhost:1433;" +
	           "databaseName=OAIPTEST;integratedSecurity=true;";

	       
	        Connection con = null;
	        
	        //Statement stmt = null;
	        try {
	         
	          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	          con = DriverManager.getConnection(connectionUrl);
		
			CallableStatement cstmt = 
				             con.prepareCall("{call dbo.CalculateOAIPAnnual(?)}");
			 cstmt.setInt(1, year);
			// cstmt.setInt(2, month);
             ResultSet rs = cstmt.executeQuery();
             
      
             while (rs.next()) {
            	EmployeeMasterDTO empAllDTO=new EmployeeMasterDTO();
                System.out.println(rs.getString("EmpId"));
                System.out.println(rs.getString("EmpName"));
                System.out.println(rs.getString("BaseSalary"));
                System.out.println(rs.getString("Leverage"));
                System.out.println(rs.getString("INDPerf"));
                System.out.println(rs.getString("NoofMonths"));
                System.out.println(rs.getString("Multiplier"));
                System.out.println(rs.getString("OAIP"));
             
            empAllDTO.setEmpId(rs.getInt(1));
   			empAllDTO.setFirstName(rs.getString(2));
		    empAllDTO.setBaseSalaryAnnual(rs.getInt(3));
		    empAllDTO.setOaipBonus(rs.getInt(8));
		    
		    result.add(empAllDTO);
		    
             }
              // result.add(empAllDTO);
          }

          catch (Exception e) {
             e.printStackTrace();
          }
			return result;
	        }    

	
	public List getCalculate(int empId) {
		
		List list = null;
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

			return list;
		}

	
}
*/