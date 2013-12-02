package com.jokul.dao.system;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.jokul.dao.base.BaseDaoImpl;
import com.jokul.domain.User;
import com.jokul.utils.page.DataGridParam;
import com.jokul.utils.page.DataGridResult;
import com.jokul.utils.page.Paging;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public DataGridResult<User> list(User user, DataGridParam param) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");
		DataGridResult<User> dataGridResult = new Paging<User>().mysqlPage(query, param);
		session.getTransaction().commit();
		return dataGridResult;
	}

	
}
