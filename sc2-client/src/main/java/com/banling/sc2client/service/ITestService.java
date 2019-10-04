package com.banling.sc2client.service;

import java.util.Collection;
import java.util.List;

import com.banling.sc2.module.User;


/**客户端消费服务的接口<br>
 * 应用Ribbon方式
 * @author Ban
 *
 */
public interface ITestService {
	String getMsg(String msg);
	
	List<User> getUserList(Integer count);
	
	Collection<String> getServerMetadata();
	
	public String noRestApi();

}
