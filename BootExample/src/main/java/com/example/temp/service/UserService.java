package com.example.temp.service;

import java.util.List;

import com.example.temp.model.UserModel;

public interface UserService {
	public void addUser(UserModel user);

	public List<UserModel> getAllUser();

	public void deleteUser(Integer userId);

	public UserModel updateUser(UserModel user);

	public UserModel getUser(int userId);
}
