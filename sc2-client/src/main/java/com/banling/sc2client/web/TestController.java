package com.banling.sc2client.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.banling.sc2.module.User;
import com.banling.sc2client.service.ITestService;

import java.util.List;

/**
 * 不使用feign，而是用RestTemplate
 *
 */
@RestController
public class TestController {
	
	@Autowired
	private ITestService testService;
	
	/**简单测试
	 * @param msg
	 * @return
	 */
	@GetMapping("/test/{msg}")
	public String test(@PathVariable String msg){
		return testService.getMsg(msg);
	}
	
	
	/**代理非RestFull接口
	 * @param msg String
	 * @return String
	 */
	@GetMapping("/norestapi/{msg}")
	public String noRestApi(@PathVariable String msg){
		return testService.noRestApi();
	}
	
	@GetMapping("/userList/{count}")
	public List<User> getUserList(@PathVariable Integer count){
		return testService.getUserList(count);
	}
	
	@GetMapping("getMeta")
	public Collection<String> getMeta(){
		return testService.getServerMetadata();
	}
}
