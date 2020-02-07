package com.chinasoft.SpringCloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chinasoft.SpringCloud.entity.User;

@Mapper
public interface UserDao {
 
	
	public User getUser(int id);
 
}
