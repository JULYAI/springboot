package com.danmu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.danmu.bean.User;
import com.danmu.dao.UserDao;
import com.danmu.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		int i=0;
		userDao.save(user);
	}


	

}
