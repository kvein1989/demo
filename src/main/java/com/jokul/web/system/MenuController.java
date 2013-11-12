package com.jokul.web.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	@RequestMapping(value = "tree")
	@ResponseBody
	public List<Menu> tree(Integer menuId) {
		if(menuId == null) {
			menuId = Constant.menu_parent_id;
		}
		List<Menu> list = menuService.tree(menuId);
		
		return list;
	}
}
