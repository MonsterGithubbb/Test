package com.example.spring.Mybatis.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.spring.Mybatis.Entity.User;
import com.example.spring.Mybatis.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public void insertUser(User user){
		userMapper.insert(user);
	}
	
	
	public void exitUser(User user) {
		 userMapper.exitUser(user);
		
	}

	public User selectUser(User user){
		return  userMapper.selectUser(user.getUserName(), user.getPassword());
	}

}
