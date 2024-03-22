package com.nagarro.notificationsystem.impl;
import java.util.List;

import com.nagarro.notificationsystem.impl.EmailNotification;
import com.nagarro.notificationsystem.impl.User;
import com.nagarro.notificationsystem.dao.UserDao;
import com.nagarro.notificationsystem.interfaces.NotificationChannel;

public class EmailNotification implements NotificationChannel {
	

	private static EmailNotification instance;
	
	private EmailNotification() {
		super();
	}
	
	
	
	 public static EmailNotification getInstance() {
	        if (instance == null) {
	            synchronized (UserDao.class) {
	                if (instance == null) {
	                    instance = new EmailNotification();
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