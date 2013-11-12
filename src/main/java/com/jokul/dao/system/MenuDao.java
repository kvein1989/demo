package com.jokul.dao.system;

import java.util.List;

import com.jokul.domain.Menu;
import com.jokul.utils.page.Pagination;

public interface MenuDao {

	public void insert(Menu menu);
	
	public void delete(Integer menuId);
	
	public void update(Menu menu);
	
	public Menu getById(Integer menuId);
	
	public Pagination<Menu> list(Menu menu, String page);
	
	public List<Menu> tree(Integer menuId);
	
}
