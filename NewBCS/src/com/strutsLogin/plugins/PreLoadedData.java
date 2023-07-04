package com.strutsLogin.plugins;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;

import com.strutsLogin.delegate.CommonServiceDelegate;
import com.strutsLogin.dto.DropDown;


public class PreLoadedData implements PlugIn
{
  public static final String COUNTRY_LIST = "countryList";
  public static final String COUNTRY_MAP = "countryMap";
  
  
  public static final String PLAN_LIST = "planlist";
  public static final String PLAN_MAP = "planmap";
 
  public static final String LEVARAGE_LIST = "levaragelist";
  public static final String LEVARAGE_MAP = "levaragemap";
  
  public static final String BUSINESS_UNIT_ID = "businessunitid";
  public static final String BUSINESS_UNIT_MAP = "businessunitmap";
 
// public static final String MANAGER_ID = "managerid";
// public static final String MANAGER_MAP = "managermap";
  
  
 public static final String EMPLOYEE_ID = "employeeid";
 public static final String EMPLOYEE_MAP = "employeemap";
  
 

  public void destroy() 
  {
  }

  public void init(ActionServlet request, ModuleConfig config)
    throws ServletException
  {
    ServletContext application = request.getServletContext();

    if(CommonServiceDelegate.getCountry() != null){
    application.setAttribute("countryList", 
      CommonServiceDelegate.getCountry());
    }
    
    if(CommonServiceDelegate.getCountry() != null){
    createMap("countryMap", 
      CommonServiceDelegate.getCountry(), application);
    }
    
    if(CommonServiceDelegate.getPlan() != null){
    application.setAttribute("planlist", 
    	      CommonServiceDelegate.getPlan());
    }

 if(CommonServiceDelegate.getPlan() !=null){    
     createMap("planmap", 
    	      CommonServiceDelegate.getPlan(), application);
    }
    	    if(CommonServiceDelegate.getLevarage() != null){
    	    application.setAttribute("levaragelist", 
    	    	      CommonServiceDelegate.getLevarage());
    	    	    createMap("levaragemap", 
    	    	      CommonServiceDelegate.getLevarage(), application);	
    	    }	    
    	    	    if(CommonServiceDelegate.getBusinessUnitId() != null){
    	    	    application.setAttribute("businessunitid", 
    	    	    	      CommonServiceDelegate.getBusinessUnitId());
    	    	    	    createMap("businessunitmap", 
    	    	    	      CommonServiceDelegate.getBusinessUnitId(), application);	  
    	    	    }
    	    	    	   /* application.setAttribute("managerid", 
    	    	    	    	      CommonServiceDelegate.getManagerId());
    	    	    	    	    createMap("managermap", 
    	    	    	    	      CommonServiceDelegate.getManagerId(), application);*/
    	    	    	    
    	    	    	  if(CommonServiceDelegate.getEmpId() != null){  
    	    	    	    application.setAttribute("employeeid", 
    	    	    	    	      CommonServiceDelegate.getEmpId());
    	    	    	    	    createMap("employeemap", 
    	    	    	    	      CommonServiceDelegate.getEmpId(), application);	 
    	    	    	  }
//    	    	    
//    	    	    
//    	    	    	    	    application.setAttribute("businessunitactualmonth", 
//    	    	    	    	    	      CommonServiceDelegate.getBusinessUnitActualMonth());
//    	    	    	    	    	    createMap("businessunitactualmonthmap", 
//    	    	    	    	    	      CommonServiceDelegate.getBusinessUnitActualMonth(), application);	
//    	    	    	    	    
    	    	    	    	    
  }
  
  //arif
  
  //arif

  public void createMap(String name, List l, ServletContext application)
  {
    Iterator it = l.iterator();
    DropDown ddList = null;
    
    HashMap map = new HashMap();
    while (it.hasNext()) {
      ddList = (DropDown)it.next();
      map.put(ddList.getKey(), ddList.getValue());
      
      
    }

    application.setAttribute(name, map);
  }

  public static String getValue(String name, String key, ServletContext application)
  {
    HashMap map = (HashMap)application.getAttribute(name);
    return (String)map.get(key);
  }
}