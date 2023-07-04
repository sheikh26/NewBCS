package com.strutsLogin.form;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {

	//form bean basically communicate with front layer jsp
	//in form bean all fields declare as a String. generate getter and setter method.
	
	
	private String operation;
	
	private String name;
	private String password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
