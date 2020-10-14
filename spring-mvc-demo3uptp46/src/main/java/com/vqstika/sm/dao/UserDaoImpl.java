package com.vqstika.sm.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vqstika.sm.model.User1;
import com.vqstika.sm.util.QueryUtil;
import com.vqstika.sm.util.UserRowMapper;

public class UserDaoImpl implements UserDao {
	@Autowired
private DataSource dataSource;
	
	@Override
	public void saveUser(User1 user) {
getJdbcTemplate().update(QueryUtil.INSERT_USER,new Object[] {user.getUserName(),user.getPassword(),user.getEmail(),user.getMobileNo(),user.getNationality(),user.getGender(),user.getAddress().getCityName(),user.getAddress().getCountryName(),user.getComments(),user.getHobbies(),user.getDob()});
	}
	
	@Override
	public void updateUser(User1 user) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update(QueryUtil.UPDATE_USER,new Object[]{user.getUserName(),user.getPassword(),user.getEmail(),user.getMobileNo(),user.getNationality(),user.getGender(),user.getAddress().getCityName(),user.getAddress().getCountryName(),user.getComments(),user.getHobbies(),user.getDob(),user.getId()});
			
	}
	@Override
	public void deleteUser(int id) {
		getJdbcTemplate().update(QueryUtil.DELETE_USER,new Object[]{id}); 
		
	}
	@Override
	public List<User1> getAllUser() {
		// TODO Auto-generated method stub
		return  getJdbcTemplate().query(QueryUtil.LIST_USER, new UserRowMapper());
	}
	@Override
	public User1 getUserById(int id) {
		// TODO Auto-generated method stub
		return  getJdbcTemplate().query(QueryUtil.GET_USER_BY_ID, new Object[] {id},new UserRowMapper()).get(0);
	}
	private JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	 
	}
}
   