package com.hust.ade.microserviceuserprovider;

import com.hust.ade.entity.User;
import com.hust.ade.microserviceuserprovider.dao.UserDao;
import org.junit.Test;

import javax.annotation.Resource;

public class UserDaoTest extends BaseTest {

	@Resource
	private UserDao userDao;

	@Test
	public void testSelect(){
		User user = userDao.selectById(1l);
		System.out.println(user.getBalance());
	}

}
