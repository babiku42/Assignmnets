 package com.vqstika.sm.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vqstika.sm.model.Address;
import com.vqstika.sm.model.User1;

public class UserRowExtractor implements  ResultSetExtractor<User1>{

	@Override
	public User1 extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		User1 user= new User1();
		user.setId(rs.getInt("id"));
		user.setUserName(rs.getString("user_name"));
		user.setPassword(rs.getString("password"));
		user.setMobileNo(rs.getLong("mobileNo"));
		user.setEmail(rs.getString("email"));
		user.setComments(rs.getString("comments"));
		user.setGender(rs.getString("gender"));
		user.setDob(rs.getDate("dob"));
		user.setNationality(rs.getString("nationality"));
		user.setHobbies(rs.getString("hobbies"));
		Address address= new Address();
		address.setCityName(rs.getString("city_name"));
		address.setCountryName(rs.getString("country_name"));
 		user.setAddress(address);
		
		
		return user;
	}

}
