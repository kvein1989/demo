package com.jokul.service.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jokul.dao.system.MenuDao;
import com.jokul.domain.Menu;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	
	@Override
	public List<Menu> tree(Integer menuId) {
		return menuDao.tree(menuId);
	}

	@Override
	public Menu getById(Integer menuId) {
		return menuDao.getById(menuId);
	}

	@Override
	public Integer insert(Menu menu) {
		return menuDao.insert(menu);
	}

	@Override
	public void update(Menu menu) {
		menuDao.update(menu);
	}

	@Override
	public void delete(Integer menuId) {
		menuDao.delete(menuId);
	}

}
