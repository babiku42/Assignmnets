 package com.vqstika.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vqstika.sm.dao.UserDao;
import com.vqstika.sm.model.User1;

public class UserServiceImpl implements UserService {
	@Autowired
private UserDao userDao;
	@Override
	public void saveUser(User1 user) {
		userDao.saveUser(user); 
	}
	@Override
	public void updateUser(User1 user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
		
	}
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(id);
	}
	@Override
	public List<User1> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}
	@Override
	public User1 getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

}
