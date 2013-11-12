package com.jokul.dao;

import com.jokul.domain.User;
import com.jokul.utils.page.Pagination;

public interface UserDao {

	public void add(User user);
	
	public void update(User user);
	
	public void delete(Integer userId);
	
	public User getById(Integer userId);
	
	public Pagination<User> list(User user, String page);
}
