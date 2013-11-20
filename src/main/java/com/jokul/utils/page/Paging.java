package com.jokul.utils.page;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

/**
 * @author jokul
 * @param <T>
 * @date 2013年11月20日
 */
public class Paging<T> {

	private DataGridResult<T> dataGridResult = new DataGridResult<T>();
	
	/**
	 * mysql的分页
	 * @param query
	 * @param param
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public DataGridResult<T> mysqlPage(Query query, DataGridParam param) {
		int total = query.list().size();
		dataGridResult.setTotal(total);
		if(total < 1) {
			dataGridResult.setData(new ArrayList<T>());
		} else {
			query.setFirstResult(param.getStartOfPage());
			query.setMaxResults(param.getPageSize());
			List<T> data = query.list();
			dataGridResult.setData(data);
		}
		return dataGridResult;
	}
	
}
