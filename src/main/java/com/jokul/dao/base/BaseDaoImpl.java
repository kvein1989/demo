package com.jokul.dao.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author jokul
 * @param <T>
 * @date 2013年11月21日
 */
@Repository
public class BaseDaoImpl<T> {

	@Autowired
	protected SessionFactory sessionFactory;
	
	
	public void add(T t) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

	public void update(T t) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(T t) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(t);
		session.getTransaction().commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public T getById(Class<T> clazz, Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		T t = (T) session.get(clazz, id);
		session.getTransaction().commit();
		session.close();
		return t;
	}
}
