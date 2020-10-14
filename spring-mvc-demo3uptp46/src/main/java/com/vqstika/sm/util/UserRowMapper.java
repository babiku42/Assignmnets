package com.vqstika.sm.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vqstika.sm.model.User1;

public class UserRowMapper  implements RowMapper<User1>{

	@Override
	public User1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new UserRowExtractor().extractData(rs);
	}

}
