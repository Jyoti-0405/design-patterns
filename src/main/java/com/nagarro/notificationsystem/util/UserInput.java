package com.nagarro.notificationsystem.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	


	public  String getNotificationType()throws IOException{
		System.out.print("Please Enter Notification Type(SMS/Email): ");
    	String type=br.readLine();
    	if(type.isEmpty()) {
    		getNotificationType();
    	}
		return type;
	}
	
	public String getSubject()throws IOException {
		System.out.print("Please Enter Notification Subject: ");
    	String subject=br.readLine();
    	if(subject.isEmpty()) {
    		getSubject();
    	}
		return subject;
	}
	
	public String getMessageBody()throws IOException{
		System.out.print("Please Enter Notification Message: ");
		String messageBody=br.readLine();
		if(messageBody.isEmpty()) {
    		getMessageBody();
    	}
		return messageBody;
	}

}
