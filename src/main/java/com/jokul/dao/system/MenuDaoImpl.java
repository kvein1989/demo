package com.jokul.dao.system;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jokul.domain.Menu;
import com.jokul.utils.page.Pagination;

@Repository
public class MenuDaoImpl implements MenuDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insert(Menu menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer menuId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Menu menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Menu getById(Integer menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination<Menu> list(Menu menu, String page) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Menu> tree(Integer menuId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Menu> list = session.createQuery("from Menu")
				.list();
		return list;
	}


}
