package com.strutsLogin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.strutsLogin.dto.CountryMasterDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.util.HibernateUtil;



public class CountryMasterServiceHibImpl implements CountryMasterService {

	public CountryMasterDTO add(CountryMasterDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.save(dto);
		tx.commit();

		HibernateUtil.closeSession();
		return dto;

	}

	public void delete(CountryMasterDTO dto) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.delete(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public void update(CountryMasterDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public CountryMasterDTO get(int id) {

		Session session = HibernateUtil.currentSession();

		CountryMasterDTO dto = (CountryMasterDTO) session
				.get(CountryMasterDTO.class, id);

		HibernateUtil.closeSession();
		return dto;
	}

	public List getList() {
		Session s = HibernateUtil.currentSession();

		Query q = s.createQuery("from CountryMasterDTO");

		List l = q.list();

		HibernateUtil.closeSession();
		return l;
	}

	public List getList(SearchCriteria searchCriteria) {

		Session s = HibernateUtil.currentSession();

		Criteria criteria = s.createCriteria(CountryMasterDTO.class);

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
