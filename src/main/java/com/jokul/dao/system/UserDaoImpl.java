package com.jokul.dao.system;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jokul.domain.User;
import com.jokul.utils.page.DataGridParam;
import com.jokul.utils.page.DataGridResult;

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
		User user = (User) 	session.get(User.class, userId);
		session.getTransaction().commit();
		session.close();
		return user;
	}

	@Override
	public DataGridResult<User> list(User user, DataGridParam param) {
		DataGridResult<User> dataGridResult = new DataGridResult<User>();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");
		session.getTransaction().commit();
		return dataGridResult;
	}
	
}
