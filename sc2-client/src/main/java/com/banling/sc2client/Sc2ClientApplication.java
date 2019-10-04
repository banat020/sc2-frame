package com.banling.sc2client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.banling.sc2client"}) //开启Feign
public class Sc2ClientApplication {

	
	//应用Ribbon方式
	@Bean
    @LoadBalanced //添加负载均衡支持，很简单，只需要在RestTemplate上添加@LoadBalanced注解，那么RestTemplate即具有负载均衡的功能
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Sc2ClientApplication.class, args);
	}

}
