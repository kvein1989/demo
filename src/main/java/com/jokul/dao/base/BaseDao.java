package com.jokul.dao.base;

import com.jokul.domain.User;

/**
 * @author jokul
 * @param <T>
 * @date 2013年11月21日
 */
public interface BaseDao<T> {

	public void add(T t);

	public void update(T t);

	public void delete(T t);

	public User getById(Class<T> clazz, Integer id);
}
