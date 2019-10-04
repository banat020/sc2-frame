package com.banling.sc2.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.banling.sc2.gateway.filter.UserFilter;

@SpringBootApplication
@EnableZuulProxy
public class Sc2GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc2GatewayApplication.class, args);
	}

	@Bean
	public UserFilter userFilter(){
		return new UserFilter();
	}
}
