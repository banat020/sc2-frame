package com.banling.sc2client.web;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banling.sc2.module.User;
import com.banling.sc2client.service.FeignClientService;


/**
 * 使用feign为作客户端工具
 *
 */
@RestController
@RequestMapping("/client")
public class ClientController {
	
	private final Logger logger=Logger.getLogger(this.getClass());

	@Autowired
	private FeignClientService feignClientService;
	
	/**简单测试
	 * @param msg
	 * @return
	 */
	@GetMapping("/test/{msg}")
	public String test(@PathVariable String msg){
		logger.info("test");
		return feignClientService.getMsg(msg);
	}
	
	
	@GetMapping("/norestapi")
	public String noRestApi(){
		logger.info("norestapi");
		return feignClientService.noRestApi();
	}
	
	@GetMapping("/userList/{count}")
	public List<User> getUserList(@PathVariable Integer count){
		logger.info("getUserList");
		return feignClientService.getUserList(count);
	}
}
