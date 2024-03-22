package com.nagarro.notificationsystem.impl;

import com.nagarro.notificationsystem.enums.ChannelType;
import com.nagarro.notificationsystem.interfaces.Subscriber;

public class User implements Subscriber{
	
	private int userId;
	private String username;
	private ChannelType channelType;
	
	public User() {
		super();
	}
	
	public User(int userId, String username) {
		super();
		this.userId = userId;
		this.username = username;
	}
	

	public ChannelType getChannelType() {
		return channelType;
	}

	public void setChannelType(ChannelType channelType) {
		this.channelType = channelType;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", channelType=" + channelType + "]";
	}

	@Override
	public void update(String subject, String messageBody) {
		System.out.println("UserName: "+username +"\nSubject: "+subject+"\nMessage: "+messageBody);
	}
}