package com.jokul.dao.system;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jokul.domain.Menu;
import com.jokul.utils.page.Paginable;
import com.jokul.utils.page.Pagination;

public class MenuDaoImpl implements MenuDao {

	@Override
	public Integer insert(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Integer menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagination<Menu> list(Menu menu, String page) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer insert(Menu menu) {
		String sql = "insert into menu (menu_name,menu_url,is_leaf,parent_id,sort) value (?,?,?,?,?)";
		Object[] params = new Object[] { menu.getMenuName(), menu.getMenuUrl(),
				menu.getIsLeaf(), menu.getParentId(), menu.getSort() };
		return jdbcTemplate.update(sql, params);
	}

	@Override
	public Integer delete(Integer menuId) {
		String sql = "delete from menu where menu_id = ?";
		return jdbcTemplate.update(sql,new Object[menuId]);
	}

	@Override
	public Integer update(Menu menu) {
		String sql = "update menu set menu_name = ?, menu_url = ?, is_leaf = ?, sort = ? where menu_id = ?";
		Object[] params = new Object[]{menu.getMenuName(),menu.getMenuUrl(),menu.getIsLeaf(),
				menu.getSort(),menu.getMenuId()};
		return jdbcTemplate.update(sql, params);
	}

	@Override
	public Pagination<Menu> list(Menu menu, String page) {
		StringBuilder sqlCount = new StringBuilder("select count(*) from menu ");
		StringBuilder sqlList = new StringBuilder("select * from menu ");
		StringBuilder condition = new StringBuilder(" where ");
		condition.append(" parent_id = ?");
		Object[] params = new Object[]{menu.getParentId()};
		
		Pagination<Menu> pagination = new Pagination<Menu>();
		Paginable<Menu> paginable = new Paginable<Menu>(pagination);
		paginable.setPage(page);
		sqlCount.append(condition);
		sqlList.append(condition).append(paginable.getLimit());
		
		Integer count = jdbcTemplate.queryForInt(sqlCount.toString(), params);
		pagination.setFullListSize(count);
		if(count < 1) {
			pagination.setList(new ArrayList<Menu>());
		} else {
			
		}
		
		return pagination;
	}*/

}
