package com.jokul.dao;

import com.jokul.domain.User;
import com.jokul.utils.page.Pagination;

public interface UserDao {

	public int add(User user);
	
	public int update(User user);
	
	public int delete(Integer userId);
	
	public User getById(Integer userId);
	
	public Pagination<User> list(User user, String page);
}
