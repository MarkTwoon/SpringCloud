package com.chinasoft.SpringCloud.service;

import java.util.List;

import com.chinasoft.SpringCloud.entity.User;

public interface UserService {
public boolean addUser(User user);
	
	public User getUser(int id);
	
	public List<User> getUsers();
}
