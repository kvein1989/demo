package com.jokul.service;

import com.jokul.domain.User;
import com.jokul.utils.page.Pagination;

public interface UserService {

	public int add(User user);

	public int update(User user);

	public int delete(Integer userId);

	public User getById(Integer userId);

	public Pagination<User> list();
}
