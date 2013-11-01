package com.jokul.utils.page;

import java.util.List;

public class Paginable<T> {

	private List<T> Rows;//数据
	private Integer total; //总条数

	public List<T> getRows() {
		return Rows;
	}

	public void setRows(List<T> rows) {
		Rows = rows;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
