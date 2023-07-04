/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.strutsLogin.form;

import org.apache.struts.validator.ValidatorForm;

import com.strutsLogin.dto.BaseDTO;



/**
 * MyEclipse Struts Creation date: 10-20-2006
 * 
 * XDoclet definition:
 * 
 * @struts.form name="baseForm"
 */
public abstract class BaseForm extends ValidatorForm {

	protected String id;

	private String operation = null;

	protected boolean display = false;

	public String getOperation() {
		System.out.println("In baseForm getoperation methodValueof operation is ="+operation);
		
		return operation;
	}

	public void setOperation(String operation) {
		System.out.println("In baseform setoperation method value going to set is ="+operation);
		this.operation = operation;
	}

	public String getId() {
		System.out.println("In baseform getId method value going to return is ="+id);
		return id;
	}

	public void setId(String id) {
		System.out.println("In baseform setId method value going to set is ="+id);
		this.id = id;
	}

	public boolean isDisplay() {
		return display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	} 

	public abstract void populate(BaseDTO baseDto);

	public abstract BaseDTO getDTO();

}