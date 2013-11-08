package com.jokul.utils.page;

import org.apache.commons.lang.StringUtils;

public class Paginable<T> {

	private Pagination<T> pagination;

	public Paginable(Pagination<T> pagination) {
		this.pagination = pagination;
	}
	
	//设置当前页
	public void setPage(String page) {
		if(StringUtils.isBlank(page)) {
			pagination.setPageNumber(1);
		} else {
			pagination.setPageNumber(Integer.parseInt(page));
		}
	}
	
	//mysql分页
	public String getLimit() {
		StringBuilder sb = new StringBuilder(" limit ");
		sb.append(pagination.getObjectsPerPage() * (pagination.getPageNumber() - 1));
		sb.append(",");
		sb.append(pagination.getObjectsPerPage());
		return sb.toString();
	}
}
