package com.user.detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserDetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDetailServiceApplication.class, args);
	}
}
