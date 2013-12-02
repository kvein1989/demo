package com.jokul.service.system;

import com.jokul.domain.User;
import com.jokul.utils.page.DataGridParam;
import com.jokul.utils.page.DataGridResult;

public interface UserService {

	public void add(User user);

	public void update(User user);

	public void delete(User user);

	public User getById(Integer userId);

	public DataGridResult<User> list(User user, DataGridParam param);
}
