package com.nagarro.notificationsystem.impl;

import java.util.List;

import com.nagarro.notificationsystem.impl.SMSNotification;
import com.nagarro.notificationsystem.impl.User;
import com.nagarro.notificationsystem.dao.UserDao;
import com.nagarro.notificationsystem.interfaces.NotificationChannel;
public class SMSNotification implements NotificationChannel {
	
	private static SMSNotification instance;
	
	private SMSNotification() {
		super();
	}

	
	 public static SMSNotification getInstance() {
	        if (instance == null) {
	            synchronized (UserDao.class) {
	                if (instance == null) {
	                    instance = new SMSNotification();
	                }
	            }
	        }
	        return instance;
	 }
	
	
	 @Override
	public void sendMessage(List<User>subscriber,String subject,String messageBody) {
		 System.out.println("Sending Email to "+subscriber.size()+" subscribers: ");		
		 for(User user:subscriber) {
					user.update(subject, messageBody);
				}
	}
	
}