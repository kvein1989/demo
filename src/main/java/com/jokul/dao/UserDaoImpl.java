package com.jokul.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jokul.domain.User;
import com.jokul.utils.page.Paginable;
import com.jokul.utils.page.Pagination;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Integer userId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(userId);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public User getById(Integer userId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = (User) session.load(User.class, userId);
		session.delete(userId);
		session.getTransaction().commit();
		session.close();
		return user;
	}

	@Override
	public Pagination<User> list(User user, String page) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");
		Paginable<User> paginable = new Paginable<User>();
		Pagination<User> pagination = paginable.paging(query, page);
		session.getTransaction().commit();
		return pagination;
	}
	
}
