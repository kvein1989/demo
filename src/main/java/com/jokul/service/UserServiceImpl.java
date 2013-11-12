package com.jokul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jokul.dao.UserDao;
import com.jokul.domain.User;
import com.jokul.utils.page.Pagination;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public void add(User user) {
		userDao.add(user);
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void delete(Integer userId) {
		userDao.delete(userId);
	}

	public User getById(Integer userId) {
		return userDao.getById(userId);
	}

	public Pagination<User> list(User user, String page) {
		return userDao.list(user, page);
	}

}
