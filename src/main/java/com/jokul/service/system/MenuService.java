package com.jokul.service.system;

import java.util.List;

import com.jokul.domain.Menu;

public interface MenuService {

	public List<Menu> tree(Integer menuId);
}
