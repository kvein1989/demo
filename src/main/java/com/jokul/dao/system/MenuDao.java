package com.jokul.dao.system;

import com.jokul.domain.Menu;
import com.jokul.utils.page.Pagination;

public interface MenuDao {

	public Integer insert(Menu menu);
	
	public Integer delete(Integer menuId);
	
	public Integer update(Menu menu);
	
	public Pagination<Menu> list(Menu menu, String page);
	
}
