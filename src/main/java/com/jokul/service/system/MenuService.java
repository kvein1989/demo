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
	
	/**
	 * 添加菜单
	 * @param menu
	 * @return
	 */
	public Integer insert(Menu menu);
	
	/**
	 * 更新菜单
	 * @param menu
	 */
	public void update(Menu menu);
	
	/**
	 * 删除菜单
	 * @param menuId
	 */
	public void delete(Integer menuId);
}
