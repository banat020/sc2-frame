package com.banling.sc2.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Sc2ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc2ServiceApplication.class, args);
	}

}
