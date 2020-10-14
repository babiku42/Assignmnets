package com.vqstika.sm.util;

public class QueryUtil {
	public static final String INSERT_USER= "insert into user_tbl(user_name,password,email,mobileNo,nationality,gender,city_name,country_name,comments,hobbies,dob)values(?,?,?,?,?,?,?,?,?,?,?) ";
	public static final String UPDATE_USER="update user_tbl set user_name=?,password=?,email=?,mobileNo=?,nationality=?,gender=?,city_name=?,country_name=?,comments=?,hobbies=?,dob=? where id=?";
	public static final String DELETE_USER="delete from user_tbl where id=?";
	public static final String LIST_USER="select * from user_tbl";
	public static final String GET_USER_BY_ID="select *from user_tbl where id=?";
}
