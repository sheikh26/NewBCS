package com.strutsLogin.service;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.strutsLogin.dto.PlanMasterDTO;
import com.strutsLogin.dto.SearchCriteria;
import com.strutsLogin.util.HibernateUtil;



public class PlanMasterServiceHibImpl implements PlanMasterService {

	public PlanMasterDTO add(PlanMasterDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		session.save(dto);
		tx.commit();
		HibernateUtil.closeSession();
		return dto;

	}

	public void delete(PlanMasterDTO dto) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		session.delete(dto);
		tx.commit();
		HibernateUtil.closeSession();

	}

	public void update(PlanMasterDTO dto) {

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();
		HibernateUtil.closeSession();

	}

	public PlanMasterDTO get(int id) {

		Session session = HibernateUtil.currentSession();

		PlanMasterDTO dto = (PlanMasterDTO) session
				.get(PlanMasterDTO.class, id);

		HibernateUtil.closeSession();
		return dto;
	}

	public List getList() {
		Session s = HibernateUtil.currentSession();

		Query q = s.createQuery("from PlanMasterDTO");
		List l = q.list();

		HibernateUtil.closeSession();
		return l;
	}

	public List getList(SearchCriteria searchCriteria) {

		Session s = HibernateUtil.currentSession();

		Criteria criteria = s.createCriteria(PlanMasterDTO.class);

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
