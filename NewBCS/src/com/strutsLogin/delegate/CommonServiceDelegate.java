package com.strutsLogin.delegate;


import java.util.List;

import com.strutsLogin.service.CommonService;
import com.strutsLogin.service.ServiceLocator;

public class CommonServiceDelegate
{
  private static CommonService service = ServiceLocator.getInstance()
    .getCommonService();

  public static List getCountry()
  {
    try
    {
      return service.getCountry();
    } catch (Exception e) {
      e.printStackTrace();
    }return null;
  }

  
  public static List getPlan()
  {
    try
    {
      return service.getPlan();
    } catch (Exception e) {
      e.printStackTrace();
    }return null;
  }
  
  
  /*public static List getManagerId()
  {
    try
    {
      return service.getManagerId();
    } catch (Exception e) {
      e.printStackTrace();
    }return null;
  }*/
  
  public static List getEmpId()
  {
    try
    {
      return service.getEmpId();
    } catch (Exception e) {
      e.printStackTrace();
    }return null;
  }
  
  
  public static List getLevarage()
  {
    try
    {
      return service.getlevarage();
    } catch (Exception e) {
      e.printStackTrace();
    }return null;
  }
  
  
  public static List getBusinessUnitId()
  {
    try
    {
      return service.getBusinessUnit();
    } catch (Exception e) {
      e.printStackTrace();
    }return null;
  }
  
  public static List getBusinessUnitYear()
  {
    try
    {
      return service.getBusinessUnitYear();
    } catch (Exception e) {
      e.printStackTrace();
    }return null;
  }
  
  public static List getBusinessUnitActualMonth()
  {
    try
    {
      return service.getBusinessUnitActualMonth();
    } catch (Exception e) {
      e.printStackTrace();
    }return null;
  }
  
  
  
 

  public static void main(String[] args)
    throws Exception
  {
  }
}