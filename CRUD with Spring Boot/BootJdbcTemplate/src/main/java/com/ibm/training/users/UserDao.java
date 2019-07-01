package com.ibm.training.users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<User> getUsers(){  
		String sql = "select * from userdetails";
		 return jdbcTemplate.query(sql, new Usermapper());  
			 
		 }
	
	class Usermapper implements RowMapper<User>{
		
		public User mapRow(ResultSet rs, int rowNum) throws SQLException{
			User user = new User();
			user.setUserName(rs.getString("userName"));
			user.setUserId(rs.getInt("userId"));
			user.setUserAddress(rs.getString("userAddress"));
			return user;
			
		}
	}

	public String getUser(int id) {
		String sql = "select userName from userdetails where userId = ?";

		return jdbcTemplate.queryForObject(sql, new Object[] { id }, String.class);
	}

	int updateUser(User user, Integer id) {
		String sql = "update userdetails set userName = ? where userId = ?";

		return jdbcTemplate.update(sql, new Object[] { user, id });
	}

	int deleteUser(int userId) {
		String sql = "delete from userdetails where userId = ?";

		return jdbcTemplate.update(sql, new Object[] { userId });
	}

	public void addUser(User user) {
		String sql = "insert into userdetails values(?, ?, ?)";
		
		jdbcTemplate.update(sql, new Object[] {
				user.getUserName(),
				user.getUserId(),
				user.getUserAddress()
		});
	}


	
}
