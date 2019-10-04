package com.banling.sc2.service.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banling.sc2.module.User;

import org.slf4j.Logger;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/hello")  
public class HelloController {
	
	private final Logger logger=LoggerFactory.getLogger(getClass());
	
	@ApiOperation(value="获取消息", notes="根据传入参数获取响应消息")
    @ApiImplicitParam(name = "msg", value = "入参", required = true, dataType = "String",paramType = "query")
	@RequestMapping(value="/getMsg",method=RequestMethod.GET)
	public String getMsg(String msg){
		logger.info("getMsg");
		return "What msg do get from client 222 :"+msg;
	}
	
	@ApiOperation(value="获取消息", notes="根据传入参数获取响应消息")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "msg1", value = "入参1", required = true, dataType = "String",paramType = "query"),
		@ApiImplicitParam(name = "msg2", value = "入参2", required = true, dataType = "String",paramType = "query")
	})
	@RequestMapping(value="/getMoreMsgs",method=RequestMethod.GET)
	public String getMoreMsgs(String msg1,String msg2){
		logger.info("getMoreMsgs");
		return msg1+"   ...   "+msg2;
	}
	
	//显式声明返回为JSON
	@ApiOperation(value="获取用户信息列表", notes="根据传入参数获取响应消息")
	@ApiImplicitParam(name = "count", value = "返回的记录数量", required = true, dataType = "Integer",paramType = "query")
	@GetMapping(value="getUsers",produces = "application/json;charset=UTF-8")
	public List<User> getUsers(Integer count){
		logger.info("getUsers");
		List<User> list=null;
		if(count!=null&&count.intValue()>0){
			list=new ArrayList<User>();
			for(int i=0;i<count.intValue();i++){
				list.add(new User(i,"userName_"+i,new Date()));
			}
		}
		return list;
	}
	
	
	@ApiOperation(value="获取用户信息列表", notes="根据传入参数获取响应消息")
	@ApiImplicitParam(name = "count", value = "返回的记录数量", required = true, dataType = "Integer",paramType = "path")
	@GetMapping("userList/{count}")
	public List<User> userList(@PathVariable Integer count){
		logger.info("userList");
		List<User> list=null;
		if(count!=null&&count.intValue()>0){
			list=new ArrayList<User>();
			for(int i=0;i<count.intValue();i++){
				list.add(new User(i,"userName_"+i,new Date()));
			}
		}
		return list;
	}
	
}
