package com.jokul.dao.excel;

import com.jokul.domain.Student;
import com.jokul.utils.page.DataGridParam;
import com.jokul.utils.page.DataGridResult;

/**
 * @author jokul
 * @date 2013年11月20日
 */
public interface StudentDao {

	/**
	 * 根据条件查询所有学生
	 * @param student
	 * @param param
	 * @return
	 */
	public DataGridResult<Student> getAll(Student student, DataGridParam param);
}
