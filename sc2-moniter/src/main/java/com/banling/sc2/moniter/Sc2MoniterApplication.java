package com.banling.sc2.moniter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Sc2MoniterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc2MoniterApplication.class, args);
	}

}
