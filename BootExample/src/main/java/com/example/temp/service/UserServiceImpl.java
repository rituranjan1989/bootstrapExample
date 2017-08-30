package com.example.temp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.temp.dao.UserDao;
import com.example.temp.model.UserModel;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void addUser(UserModel user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	public List<UserModel> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	public UserModel updateUser(UserModel user) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserModel getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
