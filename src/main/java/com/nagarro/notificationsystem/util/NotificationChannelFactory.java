package com.nagarro.notificationsystem.util;
import com.nagarro.notificationsystem.impl.SMSNotification;
import com.nagarro.notificationsystem.impl.EmailNotification;
import com.nagarro.notificationsystem.interfaces.NotificationChannel;

public class NotificationChannelFactory {
	public static NotificationChannel createChannel(String channelType) {
		if("email".equalsIgnoreCase(channelType)) {
			return EmailNotification.getInstance();
		}
		else if("sms".equalsIgnoreCase(channelType)) {
			return  SMSNotification.getInstance();
		}
		else 
			throw new IllegalArgumentException("Invalid channel type: " + channelType);
		
	}

}
