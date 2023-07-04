package com.strutsLogin.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.strutsLogin.util.HibernateUtil;


public class CommonService
{
	
  public List getCountry()
    throws Exception
  {
    Session session = HibernateUtil.currentSession();
    Query query = session.createQuery("from CountryMasterDTO order by countryName");
    List list = query.list();
    HibernateUtil.closeSession();
    System.out.println("Size of List-country--------"+list.size());
    return list;
  }

  public List getPlan()
  throws Exception
{
  Session session = HibernateUtil.currentSession();
  Query query = session.createQuery("from PlanMasterDTO order by planName");
  List list = query.list();
  HibernateUtil.closeSession();
  System.out.println("Size of List--plan---"+list.size());
  return list;
}

public List getlevarage() 

throws Exception
{
  Session session = HibernateUtil.currentSession();
  Query query = session.createQuery("from LavarageDTO order by leverageId");
  List list = query.list();
  HibernateUtil.closeSession();
  System.out.println("Size of levarage Grade =============--"+list.size());
  return list;
}

public List getBusinessUnit() 

throws Exception
{
  Session session = HibernateUtil.currentSession();
  Query query = session.createQuery("from BusinessUnitMasterDTO order by businessUnitId");
  List list = query.list();
  HibernateUtil.closeSession();
  System.out.println("Size of BusinessUnitDTO =============--"+list.size());
  return list;
}

public List getBusinessUnitYear() 
	throws Exception
	{
	  Session session = HibernateUtil.currentSession();
	  Query query = session.createQuery("from BusinessPerfPlanDTO order by buYear");
	  List list = query.list();
	  HibernateUtil.closeSession();
	  System.out.println("Size of BusinessUnitperDTO ===buYear=====--"+list.size());
	  return list;
	}

public List getBusinessUnitActualMonth() 
	throws Exception
	{
	  Session session = HibernateUtil.currentSession();
	  Query query = session.createQuery("from BusinessPerfActualDTO order by buMonth");
	  List list = query.list();
	  HibernateUtil.closeSession();
	  System.out.println("Size of BusinessPerfActualDTO ===buMonth=====--"+list.size());
	  return list;
	}

/*public List getManagerId()
throws Exception
{
	Session session = HibernateUtil.currentSession();
	  Query query = session.createQuery("from EmployeeMasterDTO order by managerId");
	  List list = query.list();
	  HibernateUtil.closeSession();
	  System.out.println("Size of  EmployeeMasterDTO  ===buMonth=====--"+list.size());
	  return list;
	}*/

public List getEmpId() 
throws Exception
{
	Session session = HibernateUtil.currentSession();
	  Query query = session.createQuery("from EmployeeMasterDTO order by empId");
	  List list = query.list();
	  HibernateUtil.closeSession();
	  System.out.println("Size of  EmployeeMasterDTO  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>==--"+list.size());
	  return list;
}
  
  
}