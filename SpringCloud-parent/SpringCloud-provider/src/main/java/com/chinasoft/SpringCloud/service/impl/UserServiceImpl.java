package com.chinasoft.SpringCloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.SpringCloud.dao.UserDao;
import com.chinasoft.SpringCloud.entity.User;
import com.chinasoft.SpringCloud.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		boolean flag;
		flag = userDao.addUser(user);
		return flag;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		User user = userDao.getUser(id);
		System.out.println("microservice-provider1微服务在响应客户端请求……");
		System.out.println("user : " + user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> users = userDao.getUsers();
		return users;
	}

}
