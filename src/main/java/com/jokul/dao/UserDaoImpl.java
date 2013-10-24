package com.jokul.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.jokul.domain.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int add(final User user) {
		final String sql = "insert into user(username,password) values (?,?)";
		Object[] params = new Object[]{user.getUsername(),user.getPassword()};
		
		/*final List<User> list = new ArrayList<User>();
		for(int i = 0;i < 10; i++) {
			User u = new User();
			u.setUsername("00000" + i);
			u.setPassword("123456");
			list.add(u);
		}
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				User a = list.get(i);
				ps.setString(1, a.getUsername());
				ps.setString(2, a.getPassword());
			}
			
			public int getBatchSize() {
				return list.size();
			}
		});*/
		
		return jdbcTemplate.update(sql, params);
	}

	public int update(User user) {
		String sql = "update user set username = ?,password = ? where userid = ?";
		Object[] params = new Object[]{user.getUsername(),user.getPassword(),user.getUserId()};
		return jdbcTemplate.update(sql, params);
	}

	public int delete(Integer userId) {
		String sql = "delete from user where userid = ?";
		return jdbcTemplate.update(sql, new Object[]{userId});
	}

	public User getById(final Integer userId) {
		String sql = "select userid,username,password from user where userid = ?";
		
		final User user = new User();
		jdbcTemplate.query(sql, new Object[]{userId}, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				user.setUserId(userId);
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
		});
		
		return user;
	}

	public List<User> list() {
		String sql = "select userid,username,password from user";
		
		final List<User> list = new ArrayList<User>();
		jdbcTemplate.query(sql, new Object[]{}, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				User user = new User();
				user.setUserId(rs.getInt("userid"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				list.add(user);
			}
		});
		return list;
	}

}
