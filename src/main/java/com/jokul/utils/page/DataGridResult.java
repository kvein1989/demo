package com.jokul.utils.page;

import java.util.List;

/**
 * miniui datagrid 的返回结果集
 * 
 * @author jokul
 * @param <T>
 * @date 2013年11月20日
 */
public class DataGridResult<T> {

	private List<T> data;
	private int total;

	public DataGridResult() {
		super();
	}

	public DataGridResult(List<T> data, int total) {
		super();
		this.data = data;
		this.total = total;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
