/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.strutsLogin.form;

import java.util.List;

import com.strutsLogin.dto.BaseDTO;

/**
 * This class should be extended by all List page form beans
 * This is a auto generated class from Nenosystems code generator
 */

public abstract class BaseListForm extends BaseForm {

	private List list = null;

	private String orderBy = null;

	private boolean asc;

	/**
	 * @return the asc
	 */
	public boolean isAsc() {
		return asc;
	}

	/**
	 * @param asc
	 *            the asc to set
	 */
	public void setAsc(boolean asc) {
		this.asc = asc;
	}

	/**
	 * @return the list
	 */
	public List getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(List list) {
		this.list = list;
	}

	/**
	 * @return the orderBy
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * @param orderBy
	 *            the orderBy to set
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	/* (non-Javadoc)
	 * @see com.sms.form.BaseForm#getDTO()
	 */
	@Override
	public BaseDTO getDTO() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void populate(BaseDTO baseDto) {
	}

	/* (non-Javadoc)
	 * @see com.sms.form.BaseForm#setDisplay(boolean)
	 */
	@Override
	public void setDisplay(boolean display) {
		super.setDisplay(display);
	}
	
	

}