package com.strutsLogin.dto;

import java.util.HashMap;

public class SearchCriteria extends BaseDTO {

	private HashMap<String, String> attributes = new HashMap<String, String>();

	private String orderBy = null;

	private boolean asc;

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

	public void setAttribute(String key, String value) {
		attributes.put(key, value);
	}

	public String getAttribute(String key) {
		return attributes.get(key);
	}

	public String removeAttribute(String key) {
		return attributes.remove(key);
	}

	public void removeAllAttribute() {
		attributes.clear();
	}

}
