package com.jokul.utils;

public enum Message {
	insert("insert", "添加成功"), 
	update("update", "修改成功"), 
	delete("delete", "删除成功"), 
	success("success", "成功");

	private String type;
	private String value;

	private Message(String type, String value) {
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
