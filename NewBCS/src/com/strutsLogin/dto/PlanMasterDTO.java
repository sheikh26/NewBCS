package com.strutsLogin.dto ;
import java.util.*;
public class PlanMasterDTO extends BaseDTO implements DropDown{
	
	
	
	
	private int planId;
	
	private String planName;
	
	
	
	private int businessUnit1Perf;
	
	public int getBusinessUnit1Perf() {
		return businessUnit1Perf;
	}
	public void setBusinessUnit1Perf(int businessUnit1Perf) {
		this.businessUnit1Perf = businessUnit1Perf;
	}
	private int businessUnit1Mertic1Perf;
	
	public int getBusinessUnit1Mertic1Perf() {
		return businessUnit1Mertic1Perf;
	}
	public void setBusinessUnit1Mertic1Perf(int businessUnit1Mertic1Perf) {
		this.businessUnit1Mertic1Perf = businessUnit1Mertic1Perf;
	}
	private int businessUnit1Mertic2Perf;
	
	public int getBusinessUnit1Mertic2Perf() {
		return businessUnit1Mertic2Perf;
	}
	public void setBusinessUnit1Mertic2Perf(int businessUnit1Mertic2Perf) {
		this.businessUnit1Mertic2Perf = businessUnit1Mertic2Perf;
	}
	private int businessUnit1Mertic3Perf;
	
	public int getBusinessUnit1Mertic3Perf() {
		return businessUnit1Mertic3Perf;
	}
	public void setBusinessUnit1Mertic3Perf(int businessUnit1Mertic3Perf) {
		this.businessUnit1Mertic3Perf = businessUnit1Mertic3Perf;
	}
	private int businessUnit2Perf;
	
	
	private int businessUnit2Mertic1Perf;
	
	public int getBusinessUnit2Mertic1Perf() {
		return businessUnit2Mertic1Perf;
	}
	public void setBusinessUnit2Mertic1Perf(int businessUnit2Mertic1Perf) {
		this.businessUnit2Mertic1Perf = businessUnit2Mertic1Perf;
	}
	private int businessUnit2Mertic2Perf;
	
	public int getBusinessUnit2Mertic2Perf() {
		return businessUnit2Mertic2Perf;
	}
	public void setBusinessUnit2Mertic2Perf(int businessUnit2Mertic2Perf) {
		this.businessUnit2Mertic2Perf = businessUnit2Mertic2Perf;
	}
	private int businessUnit2Mertic3Perf;
	
	public int getBusinessUnit2Mertic3Perf() {
		return businessUnit2Mertic3Perf;
	}
	public void setBusinessUnit2Mertic3Perf(int businessUnit2Mertic3Perf) {
		this.businessUnit2Mertic3Perf = businessUnit2Mertic3Perf;
	}
	public int getBusinessUnit2Perf() {
		return businessUnit2Perf;
	}
	public void setBusinessUnit2Perf(int businessUnit2Perf) {
		this.businessUnit2Perf = businessUnit2Perf;
	}
	
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.planName;
	}
	public String getKey() {
		return String.valueOf(this.planId);
		
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return this.planName;
	}
	
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getDescription1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getKey1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getValue1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}