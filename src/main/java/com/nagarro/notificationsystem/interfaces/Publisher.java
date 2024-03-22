package com.nagarro.notificationsystem.interfaces;

import com.nagarro.notificationsystem.impl.User;
import com.nagarro.notificationsystem.model.Notification;

public interface Publisher {
	void addSubscriber(User subscriber);
	 void removeSubscriber(User subscriber);
	 void publish(Notification notification);

}
