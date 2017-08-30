package com.example.temp.dao;

import com.example.temp.model.LoginModel;

public interface LoginDao {
     public boolean checkLogin(LoginModel loginModel);
     public boolean checkLoginNew(LoginModel loginModel);
}
