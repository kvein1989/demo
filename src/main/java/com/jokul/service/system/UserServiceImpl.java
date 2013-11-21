package com.jokul.service.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jokul.dao.system.UserDao;
import com.jokul.domain.User;
import com.jokul.utils.page.DataGridParam;
import com.jokul.utils.page.DataGridResult;

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

	public void delete(User user) {
		userDao.delete(user);
	}

	public User getById(Integer userId) {
		return userDao.getById(User.class, userId);
	}

	public DataGridResult<User> list(User user,  DataGridParam param) {
		return userDao.list(user, param);
	}

}
