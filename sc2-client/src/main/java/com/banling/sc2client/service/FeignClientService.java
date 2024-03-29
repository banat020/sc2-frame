package com.banling.sc2client.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.banling.sc2.module.User;


@FeignClient(name="sc2-service") 
public interface FeignClientService {
	
	//@FeignClient(name="sc2-service")，只定义了服务ID，没有contextpath信息。
	//如服务定义了contextpath的，那么路径中必须将contextpath也写上，如：[contextpath]/hello/getMsg
	@RequestMapping(value = "/sc2-service/hello/getMsg", method = RequestMethod.GET)
	String getMsg(@RequestParam("msg") String msg);
	
	@RequestMapping(value = "/sc2-service/hello/userList/{count}", method = RequestMethod.GET)
	List<User> getUserList(@PathVariable("count") Integer count);

	@RequestMapping(value = "/sc2-service/welcome", method = RequestMethod.GET)
	public String noRestApi();
	
}
