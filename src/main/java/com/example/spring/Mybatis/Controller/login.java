package com.example.spring.Mybatis.Controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.tomcat.util.descriptor.web.SessionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName.Form;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.Mybatis.Entity.User;
import com.example.spring.Mybatis.Service.UserService;

@Controller

public class login {
	
	@Autowired
	UserService userService;
	
	@SuppressWarnings("finally")
	@RequestMapping(value="/register")
	public String register(User user){
	
		userService.insertUser(user);
		
		
			return "Success";
	
	}
	
	@SuppressWarnings("finally")
	@RequestMapping(value="/login")
	public String login(User user){
		
	
		userService.selectUser(user);
		return "Success";
	}
	

}
