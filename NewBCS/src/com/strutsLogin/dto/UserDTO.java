package com.strutsLogin.dto;

import java.io.Serializable;

public class UserDTO implements Serializable{
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", password="
				+ password + ", getName()=" + getName() + ", getPassword()="
				+ getPassword() + ", getId()=" + getId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	//the actual value type will take in DTO,like int id,name and password is string, it directly communicate with 
	//database with the help of hbm.xml file over the network.
	//generate the setter getter method of fields.
	private int id;
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}