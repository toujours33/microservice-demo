package com.hust.ade.microserviceuserprovider.service;

import com.hust.ade.entity.User;
import com.hust.ade.microserviceuserprovider.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

	@Resource
	private UserDao userDao;

	public User getById(Long id){
		return userDao.selectById(id);
	}

}
