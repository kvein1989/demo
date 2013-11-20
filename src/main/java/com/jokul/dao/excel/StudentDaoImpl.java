package com.jokul.dao.excel;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jokul.domain.Student;
import com.jokul.utils.page.DataGridParam;
import com.jokul.utils.page.DataGridResult;
import com.jokul.utils.page.Paging;

/**
 *
 * @author jokul
 * @date 2013年11月20日
 */
@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public DataGridResult<Student> getAll(Student student, DataGridParam param) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Student");
		DataGridResult<Student> dataGridResult = new Paging<Student>().mysqlPage(query, param);
		session.getTransaction().commit();
		session.close();
		return dataGridResult;
	}

}
