package com.banling.sc2.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sc2RegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc2RegisterApplication.class, args);
	}

}
