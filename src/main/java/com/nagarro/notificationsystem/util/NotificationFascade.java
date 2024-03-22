package com.nagarro.notificationsystem.util;

import com.nagarro.notificationsystem.impl.NotificationPublisher;
import com.nagarro.notificationsystem.interfaces.Publisher;
import com.nagarro.notificationsystem.model.Notification;

public class NotificationFascade {
	public void sendNotification(Notification notification) {
	 	Publisher publisher=NotificationPublisher.getInstance();
	 	publisher.publish(notification);
    }

}
