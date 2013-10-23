package com.jokul.dao;

import java.util.List;

import com.jokul.domain.User;

public interface UserDao {

	public int add(User user);
	
	public int update(User user);
	
	public int delete(Integer userId);
	
	public User getById(Integer userId);
	
	public List<User> list();
}
