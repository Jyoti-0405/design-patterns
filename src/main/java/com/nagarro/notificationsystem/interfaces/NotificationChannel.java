package com.nagarro.notificationsystem.interfaces;
import java.util.List;

import com.nagarro.notificationsystem.impl.User;

public interface NotificationChannel {
	void sendMessage(List<User> subscriber, String subject, String messageBody);

}
