package com.nagarro.notificationsystem.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nagarro.notificationsystem.impl.NotificationPublisher;
import com.nagarro.notificationsystem.impl.User;
import com.nagarro.notificationsystem.dao.UserDao;
import com.nagarro.notificationsystem.interfaces.NotificationChannel;
import com.nagarro.notificationsystem.interfaces.Publisher;
import com.nagarro.notificationsystem.interfaces.Subscriber;
import com.nagarro.notificationsystem.model.Notification;
import com.nagarro.notificationsystem.util.NotificationChannelFactory;

public class NotificationPublisher implements Publisher {
	

	 public List<User> subscribers;
	 private static NotificationPublisher publisherInstance;
	 
	 private NotificationPublisher() {
		 subscribers=new ArrayList<>();
	 }

	 public static NotificationPublisher getInstance() {
	        if (publisherInstance == null) {
	            synchronized (NotificationPublisher.class) {
	                if (publisherInstance == null) {
	                	publisherInstance = new NotificationPublisher();
	                }
	            }
	        }
	        return publisherInstance;
	 }
	 

	 	@Override
	    public void publish(Notification notification) {
	 			subscribers=UserDao.getInstance().getSubscriberList().stream().filter(user->user.getChannelType()
	 					.toString().equalsIgnoreCase(notification.getChanelType())).collect(Collectors.toList());
	 			NotificationChannel notificationChannel=NotificationChannelFactory.createChannel(notification.getChanelType());
	 			notificationChannel.sendMessage(subscribers,notification.getSubject(),notification.getMessageBody());
	 	}

		@Override
		public void addSubscriber(User subscriber) {
			subscribers.add(subscriber);
		}

		@Override
		public void removeSubscriber(User subscriber) {
			subscribers.remove(subscriber);
		}

}