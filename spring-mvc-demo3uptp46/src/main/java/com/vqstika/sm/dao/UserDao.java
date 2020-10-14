package com.vqstika.sm.dao;

import java.util.List;

import com.vqstika.sm.model.User1;

public interface UserDao {
	void saveUser(User1 user);

	void updateUser(User1 user);

	void deleteUser(int id);

	List<User1> getAllUser();

	User1 getUserById(int id);
}
