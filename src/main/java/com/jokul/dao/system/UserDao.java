package com.jokul.dao.system;

import com.jokul.dao.base.BaseDao;
import com.jokul.domain.User;
import com.jokul.utils.page.DataGridParam;
import com.jokul.utils.page.DataGridResult;

public interface UserDao extends BaseDao<User>{
	
	public DataGridResult<User> list(User user, DataGridParam param);
}
