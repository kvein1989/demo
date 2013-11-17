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
	
	/**
	 * 菜单详情页面
	 * @param menuId
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "detail")
	public String detail(Integer menuId, ModelMap map) {
		if(menuId == null) {
			menuId = 1;
		}
		Menu menu = menuService.getById(menuId);
		map.addAttribute("menu", menu);
		return "system/menu/menuDetail";
	}
	
	/**
	 * 进入添加页面
	 * @return
	 */
	@RequestMapping(value = "v_add")
	public String v_add(Integer menuId, ModelMap map) {
		map.addAttribute("menuId", menuId);
		return "system/menu/menuAdd";
	}
	
	/**
	 * 添加菜单
	 * @param menu
	 * @return
	 */
	@RequestMapping(value = "o_add")
	public String o_add(Menu menu) {
		Integer menuId = menuService.insert(menu);
		return "redirect:/system/menu/detail.do?menuId=" + menuId;
	}
	
	/**
	 * 进入修改页面
	 * @param menuId
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "v_update")
	public String v_update(Integer menuId, ModelMap map) {
		Menu menu = menuService.getById(menuId);
		
		map.addAttribute("menu", menu);
		return "system/menu/menuUpdate";
	}
	
	/**
	 * 对菜单进行更新操作
	 * @param menu
	 * @return
	 */
	@RequestMapping(value = "o_update")
	public String o_update(Menu menu) {
		menuService.update(menu);
		return "redirect:/system/menu/v_update.do?menuId=" + menu.getMenuId();
	}
	
	/**
	 * 删除菜单
	 * @param menuId
	 * @param parentId
	 * @return
	 */
	@RequestMapping(value = "delete")
	public String delete(Integer menuId, Integer parentId) {
		menuService.delete(menuId);
		return "redirect:/system/menu/detail.do?menuId=" + parentId;
	}
}
