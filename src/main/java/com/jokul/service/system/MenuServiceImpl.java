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

}
