
package com.nagarro.notificationsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.notificationsystem.enums.ChannelType;
import com.nagarro.notificationsystem.impl.User;

public class UserDao {
	
	private List<User>userList;
	
	private static UserDao instance;
	
	private UserDao() {
		userList=new ArrayList<>();
		for(int i=0;i<=50;i++) {
			User user=new User(i,"User"+i);
			
			if(i%2==0) {
				user.setChannelType(ChannelType.EMAIL);
				userList.add(user);
			}else {
				user.setChannelType(ChannelType.SMS);
				userList.add(user);
			}
			
			
		}
	}
	
	public List<User> getSubscriberList(){
		return userList;
	}
	
	 public static UserDao getInstance() {
	        if (instance == null) {
	            synchronized (UserDao.class) {
	                if (instance == null) {
	                    instance = new UserDao();
	                }
	            }
	        }
	        return instance;
}
}
