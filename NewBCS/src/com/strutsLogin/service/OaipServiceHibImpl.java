package com.strutsLogin.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.strutsLogin.dto.EmployeeMasterDTO;
import com.strutsLogin.dto.MonthlyCalDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.dto.YearlyCalDTO;
import com.strutsLogin.util.HibernateUtil;

public class OaipServiceHibImpl implements OaipService {

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
	
     public List getDateOfJoining(int year,int month,int bunit) {
		
		System.out.println("in getCustomerName method of CustomerListImpl****");
		List<MonthlyCalDTO> result =new ArrayList<MonthlyCalDTO>();
		//List<LavarageDTO> result1 =new ArrayList<LavarageDTO>();
		
		//List<EmployeeMasterDTO> result=null;
		Session session = HibernateUtil.currentSession();
		String connectionUrl = 
	           "jdbc:sqlserver://localhost:1433;" +
	           "databaseName=OAIPTEST;integratedSecurity=true;";

	       
	        Connection con = null;
	        Statement stmt = null;
	        try {
	         
	          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	          con = DriverManager.getConnection(connectionUrl);
		
			CallableStatement cstmt = 
             con.prepareCall("{call dbo.USP_CalculateOAIPMonthly(?, ?,?)}");
			 cstmt.setInt(1, bunit);
			 cstmt.setInt(2, year);
			 cstmt.setInt(3, month);
			
			 
             ResultSet rs = cstmt.executeQuery();
             
      
             while (rs.next()) {
            	 //
            	 //LavarageDTO dto=new LavarageDTO();
            	 //
            	 MonthlyCalDTO empAllDTO=new MonthlyCalDTO();
                System.out.println(rs.getString("EmpId"));
                System.out.println(rs.getString("EmpName"));
                System.out.println(rs.getString("GradeName"));
                System.out.println(rs.getString("LeveragePerc"));
                System.out.println(rs.getString("BaseSalaryAnnual"));
                System.out.println(rs.getString("OAIP"));
             
            empAllDTO.setEmpId(rs.getString(1));
   			empAllDTO.setEmpName(rs.getString(2));
   			empAllDTO.setGradeName(rs.getString(3));
   			empAllDTO.setLeveragePerc(rs.getInt(4));
		    empAllDTO.setBaseSalary(rs.getString(5));
		    empAllDTO.setOaip(rs.getInt(6));
		    
		    result.add(empAllDTO);
		  //  result1.add(dto);
		   // List list = new ArrayList();
		    //list.add(empAllDTO, dto);
		   // l.addAll(result);
             }
              // result.add(empAllDTO);
          }

          catch (Exception e) {
             e.printStackTrace();
          }
			return result;
	        }    

     public List getcal(int year,int bunit) {
 		
 		System.out.println("in getCustomerName method of CustomerListImpl****");
 		List<YearlyCalDTO> result =new ArrayList<YearlyCalDTO>();
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
              con.prepareCall("{call dbo.CalculateOAIPAnnual(?,?)}");
 			cstmt.setInt(1, bunit);
 			cstmt.setInt(2, year);
 			
              rs=cstmt.executeQuery();
              
       
              while (rs.next()) {
             	 //
             	 //LavarageDTO dto=new LavarageDTO();
             	 //
             	YearlyCalDTO yearlyCalDTO=new YearlyCalDTO();
                 System.out.println(rs.getString("EmpId"));
                 System.out.println(rs.getString("EmpName"));
                 System.out.println(rs.getString("BaseSalary"));
                 System.out.println(rs.getString("Leverage"));
                 System.out.println(rs.getString("LeveragePerc"));
                 System.out.println(rs.getString("INDPerf"));
                 
                 System.out.println(rs.getString("DOJ"));
                 System.out.println(rs.getString("OAIPStartMonth"));
                 
                 System.out.println(rs.getString("OAIPEndMonth"));
                 
                 System.out.println(rs.getString("NoofMonths"));
                 System.out.println(rs.getString("Multiplier"));
                 System.out.println(rs.getString("OAIP"));
                 //System.out.println(rs.getString("OAIP"));
              
                 yearlyCalDTO.setEmpId(rs.getString(1));
                 yearlyCalDTO.setEmpName(rs.getString(2));
    			yearlyCalDTO.setBaseSalary(rs.getString(3));
    			yearlyCalDTO.setLeverage(rs.getString(4));
    			yearlyCalDTO.setLeveragePerc(rs.getInt(5));
    			yearlyCalDTO.setIndPerf(rs.getInt(6));
    			
    			 yearlyCalDTO.setDoj(rs.getString(7));
                 yearlyCalDTO.setOaipStartMonth(rs.getString(8));
    			
                 yearlyCalDTO.setOaipEndMonth(rs.getString(9));
                 yearlyCalDTO.setNoofMonths(rs.getInt(10));
                 
                 yearlyCalDTO.setMultiplier(rs.getInt(11));
                 yearlyCalDTO.setOaip(rs.getInt(12));
 		    
 		    result.add(yearlyCalDTO);
 		  
              }
               // result.add(empAllDTO);
           }

           catch (Exception e) {
              e.printStackTrace();
           }
 			return result;
 	        }    
     
     
     public List getcalforemployee(int year) {
  		
  		System.out.println("in getCustomerName method of CustomerListImpl****");
  		List<YearlyCalDTO> result =new ArrayList<YearlyCalDTO>();
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
               con.prepareCall("{call dbo.CalculateOAIPAnnual(?)}");
  			 cstmt.setInt(1, year);
  			
               rs=cstmt.executeQuery();
               
        
               while (rs.next()) {
              	 //
              	 //LavarageDTO dto=new LavarageDTO();
              	 //
              	YearlyCalDTO yearlyCalDTO=new YearlyCalDTO();
                  System.out.println(rs.getString("EmpId"));
                  System.out.println(rs.getString("EmpName"));
                  System.out.println(rs.getString("BaseSalary"));
                  System.out.println(rs.getString("Leverage"));
                  System.out.println(rs.getString("LeveragePerc"));
                  System.out.println(rs.getString("INDPerf"));
                  
                  System.out.println(rs.getString("DOJ"));
                  System.out.println(rs.getString("OAIPStartMonth"));
                  
                  System.out.println(rs.getString("OAIPEndMonth"));
                  
                  System.out.println(rs.getString("NoofMonths"));
                  System.out.println(rs.getString("Multiplier"));
                  System.out.println(rs.getString("OAIP"));
                  //System.out.println(rs.getString("OAIP"));
               
                  yearlyCalDTO.setEmpId(rs.getString(1));
                  yearlyCalDTO.setEmpName(rs.getString(2));
     			yearlyCalDTO.setBaseSalary(rs.getString(3));
     			yearlyCalDTO.setLeverage(rs.getString(4));
     			yearlyCalDTO.setLeveragePerc(rs.getInt(5));
     			yearlyCalDTO.setIndPerf(rs.getInt(6));
     			
     			 yearlyCalDTO.setDoj(rs.getString(7));
                  yearlyCalDTO.setOaipStartMonth(rs.getString(8));
     			
                  yearlyCalDTO.setOaipEndMonth(rs.getString(9));
                  yearlyCalDTO.setNoofMonths(rs.getInt(10));
                  
                  yearlyCalDTO.setMultiplier(rs.getInt(11));
                  yearlyCalDTO.setOaip(rs.getInt(12));
  		    
  		    result.add(yearlyCalDTO);
  		  
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
