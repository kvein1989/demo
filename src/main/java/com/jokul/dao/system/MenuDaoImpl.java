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
	public Integer insert(Menu menu) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(menu);
		session.getTransaction().commit();
		session.close();
		return menu.getMenuId();
	}

	@Override
	public void delete(Integer menuId) {
		Menu menu = new Menu();
		menu.setMenuId(menuId);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(menu);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(Menu menu) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(menu);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Menu getById(Integer menuId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Menu menu = (Menu) session.get(Menu.class, menuId);
		session.getTransaction().commit();
		session.close();
		return menu;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Menu> tree(Integer menuId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Menu> list = session.createQuery("from Menu")
				.list();
		session.getTransaction().commit();
		session.close();
		return list;
	}


}
