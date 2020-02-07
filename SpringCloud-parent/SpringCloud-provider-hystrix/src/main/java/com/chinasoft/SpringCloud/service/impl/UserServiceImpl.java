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
	public User getUser(int id) {
		// TODO Auto-generated method stub
		User user = userDao.getUser(id);
		return user;
	}

 

}
