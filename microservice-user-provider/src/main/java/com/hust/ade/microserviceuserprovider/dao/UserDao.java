package com.hust.ade.microserviceuserprovider.dao;

import com.hust.ade.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

	String TABLE_NAME = "user";
//	String FIELDS = User.getField();
	String FIELDS = " id, username, age, balance";

	@Insert({"insert into ", TABLE_NAME, "(", FIELDS, "{" +
			"values (#{id}, #{username}, #{age}, #{balance})"})
	int addUser(User user);

	@Select({"select ", FIELDS, "from", TABLE_NAME, "where id=#{id}" })
	User selectById(Long id);

}
