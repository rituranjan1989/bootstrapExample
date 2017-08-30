package com.example.temp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.temp.dao.LoginDao;
import com.example.temp.model.LoginModel;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public boolean checkLogin(LoginModel loginModel) {
		// TODO Auto-generated method stub
		return loginDao.checkLogin(loginModel);
	}

}
