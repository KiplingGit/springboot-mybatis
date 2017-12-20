package me.kipling.springboot.mybatis.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.kipling.springboot.mybatis.dao.UserDao;
import me.kipling.springboot.mybatis.domain.User;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserDao userDao;

	public List<User> findByName(String strLike) {
		logger.info("enter method UserService::findByName,param name => "  + strLike);
		return userDao.findByNameLike(strLike);
	}
}