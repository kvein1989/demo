package com.jokul.web.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jokul.domain.User;
import com.jokul.service.system.UserService;
import com.jokul.utils.page.DataGridParam;
import com.jokul.utils.page.DataGridResult;

@Controller
@RequestMapping("/system/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/v_add")
	public String v_add() {
		return "system/user/userAdd";
	}
	
	@RequestMapping(value = "/o_add")
	@ResponseBody
	public String o_add(User user) {
		userService.add(user);
		return "成功";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "system/user/userList";
	}
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public DataGridResult<User> list(DataGridParam param, User user) {
		DataGridResult<User> result = userService.list(user, param);
		return result;
	}
	
}
