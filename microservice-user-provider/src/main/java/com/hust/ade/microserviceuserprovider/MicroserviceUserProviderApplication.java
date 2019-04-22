package com.hust.ade.microserviceuserprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceUserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUserProviderApplication.class, args);
	}

}
