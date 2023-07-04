package com.strutsLogin.service;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.strutsLogin.dto.*;
import com.strutsLogin.util.HibernateUtil;

public class EmployeeMasterServiceHibImpl implements EmployeeMasterService {

	public EmployeeMasterDTO add(EmployeeMasterDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.save(dto);
		tx.commit();

		HibernateUtil.closeSession();
		return dto;

	}

	public void delete(EmployeeMasterDTO dto) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.delete(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public void update(EmployeeMasterDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public EmployeeMasterDTO get(int id) {

		Session session = HibernateUtil.currentSession();

		EmployeeMasterDTO dto = (EmployeeMasterDTO) session
				.get(EmployeeMasterDTO.class, id);

		HibernateUtil.closeSession();
		return dto;
	}

	public List getList() {
		Session s = HibernateUtil.currentSession();

		//Query q = s.createQuery("from EmployeeMasterDTO");
		
		Query q=s.createQuery("from EmployeeMasterDTO left outer join CountryMasterDTO on EmployeeMasterDTO.Country=CountryMasterDTO.CountryId");

		List l = q.list();

		HibernateUtil.closeSession();
		return l;
	}

	public List getList(SearchCriteria searchCriteria) {

		Session s = HibernateUtil.currentSession();

		Criteria criteria = s.createCriteria(EmployeeMasterDTO.class);

		String orderBY = searchCriteria.getOrderBy();
		if (orderBY != null) {
			if (searchCriteria.isAsc()) {
				criteria.addOrder(Order.asc(orderBY));
			} else {
				criteria.addOrder(Order.desc(orderBY));
			}
		}

		List l = criteria.list();
		HibernateUtil.closeSession();
		return l;

	}


}
