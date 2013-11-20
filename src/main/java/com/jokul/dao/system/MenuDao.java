package com.jokul.dao.system;

import java.util.List;

import com.jokul.domain.Menu;

public interface MenuDao {

	public Integer insert(Menu menu);
	
	public void delete(Integer menuId);
	
	public void update(Menu menu);
	
	public Menu getById(Integer menuId);
	
	public List<Menu> tree(Integer menuId);
	
}
