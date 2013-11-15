package com.jokul.service.system;

import java.util.List;

import com.jokul.domain.Menu;

public interface MenuService {

	/**
	 * 根据菜单ID，获取所有子节点
	 * @param menuId
	 * @return
	 */
	public List<Menu> tree(Integer menuId);
	
	/**
	 * 根据ID，查询菜单
	 * @param menuId
	 * @return
	 */
	public Menu getById(Integer menuId);
}
