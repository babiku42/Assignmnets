package com.vqstika.sm.service;

import java.util.List;

import com.vqstika.sm.model.User1;

public interface UserService {
	void saveUser(User1 user);

	void updateUser(User1 user);

	void deleteUser(int id);

	List<User1> getAllUser();

	User1 getUserById(int id);
}
