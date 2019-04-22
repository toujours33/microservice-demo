package com.hust.ade.microserviceuserconsumer.controller;

import com.hust.ade.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NewsController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/news/user/{id}")
	public User viewUser(@PathVariable Long id){
		return restTemplate.getForObject("http://localhost:8088/user/" + id, User.class);
	}

}
