package com.jokul.utils.page;

/**
 * 用于接收miniui datagrid的参数
 * @author jokul
 * @date 2013年11月20日
 */
public class DataGridParam {

	// 当前页（MiniUI的第一页是0）
	private int pageIndex;
	// 分页大小
	private int pageSize;
	// 排序字段名称
	private String sortField;
	// 排序类型（asc 或者desc）
	private String sortOrder;

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	
	public int getStartOfPage() {
		return pageIndex * pageSize;
	}

}
