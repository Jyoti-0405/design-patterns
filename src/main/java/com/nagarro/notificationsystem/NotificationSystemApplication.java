package com.nagarro.notificationsystem;

import java.io.*;

import com.nagarro.notificationsystem.model.Notification;

import com.nagarro.notificationsystem.util.NotificationFascade;

import com.nagarro.notificationsystem.util.UserInput;
public class NotificationSystemApplication 
{

	
    public static void main( String[] args )throws IOException
    {
    	UserInput userInput=new UserInput();
    		
    	NotificationFascade notificationFascade=new NotificationFascade();
    	
    	Notification notification=
    			new Notification(userInput.getNotificationType()
    			,userInput.getSubject(),userInput.getMessageBody());
    	
    	notificationFascade.sendNotification(notification);
    }
}