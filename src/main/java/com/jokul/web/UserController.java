package com.jokul.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jokul.domain.User;
import com.jokul.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/addUI")
	public String userAddUI() {
		return "user/userAdd";
	}
	
	@RequestMapping("/add")
	public ModelAndView userAdd(User user) {
		userService.add(user);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/user/list.do");
		view.addObject("user", user);
		return view;
	}
	
	@RequestMapping("/updateUI")
	public String updateUI(Integer userId, ModelMap map) {
		User user = userService.getById(userId);
		map.addAttribute("user", user);
		return "user/userUpdate";
	}
	
	@RequestMapping("/update")
	public String update(User user) {
		userService.update(user);
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer userId) {
		userService.delete(userId);
		return "redirect:/user/list.do";
	}
	
	@RequestMapping(value = "/v_list")
	public String v_list() {
		return "user/userList";
	}
	
	@RequestMapping("/o_list")
	@ResponseBody
	public List<User> o_list(ModelMap map) {
		List<User> users = userService.list();
		return users;
	}
	
	@RequestMapping("/detail")
	public String detail(Integer userId, ModelMap map) {
		User user = userService.getById(userId);
		map.addAttribute("user", user);
		return "user/userDetail";
	}
	
}
