package com.jokul.web.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jokul.domain.Menu;
import com.jokul.service.system.MenuService;
import com.jokul.utils.Constant;

@Controller
@RequestMapping(value = "/system/menu/")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	/**
	 * 进入菜单管理页面
	 * @return
	 */
	@RequestMapping(value = "main")
	public String main() {
		return "system/menu/menuTree";
	}

	/**
	 * 根据菜单ID，获取所有子节点
	 * @param menuId
	 * @return
	 */
	@RequestMapping(value = "tree")
	@ResponseBody
	public List<Menu> tree(Integer menuId) {
		if(menuId == null) {
			menuId = Constant.menu_parent_id;
		}
		List<Menu> list = menuService.tree(menuId);
		
		return list;
	}
	
	@RequestMapping(value = "detail")
	public String detail(Integer menuId, ModelMap map) {
		Menu menu = menuService.getById(menuId);
		map.addAttribute("menu", menu);
		return "system/menu/menuDetail";
	}
	
	public String v_add() {
		return "system/menu/menuAdd";
	}
	
	public String o_add(Menu menu) {
		return "";
	}
}
