package com.jokul.utils.page;

import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Query;

public class Paginable<T> {

	private Pagination<T> pagination = new Pagination<T>();
	
	//设置当前页
	public void setPage(String page) {
		if(StringUtils.isBlank(page)) {
			pagination.setPageNumber(1);
		} else {
			pagination.setPageNumber(Integer.parseInt(page));
		}
	}
	
	/**
	 * 结合displaytag分页
	 * @param query
	 * @param page
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Pagination<T> paging(Query query, String page) {
		this.setPage(page);
		int count = query.list().size();
		pagination.setFullListSize(count);
		if(count < 1) {
			pagination.setList(new ArrayList<T>());
		} else {
			query.setFirstResult((pagination.getPageNumber() - 1) * pagination.getObjectsPerPage());
			query.setMaxResults(pagination.getObjectsPerPage());
			pagination.setList(query.list());
		}
		return pagination;
	}
}
