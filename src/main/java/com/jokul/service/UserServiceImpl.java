package com.jokul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jokul.dao.UserDao;
import com.jokul.domain.User;
import com.jokul.utils.page.Pagination;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public int add(User user) {
		return userDao.add(user);
	}

	public int update(User user) {
		return userDao.update(user);
	}

	public int delete(Integer userId) {
		return userDao.delete(userId);
	}

	public User getById(Integer userId) {
		return userDao.getById(userId);
	}

	public Pagination<User> list() {
		return userDao.list();
	}

}
