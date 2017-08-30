package com.example.temp.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.temp.model.UserModel;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(UserModel user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	public List<UserModel> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	public UserModel updateUser(UserModel employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserModel getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
