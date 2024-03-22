package com.nagarro.notificationsystem.model;

public class Notification {
	String chanelType;
	String subject;
	String messageBody;
	public Notification() {
		super();
	}
	
	public Notification(String chanelType, String subject, String messageBody) {
		super();
		this.chanelType = chanelType;
		this.subject = subject;
		this.messageBody = messageBody;
	}

	public String getChanelType() {
		return chanelType;
	}
	public void setChanelType(String chanelType) {
		this.chanelType = chanelType;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	@Override
	public String toString() {
		return "Notification [chanelType=" + chanelType + ", subject=" + subject + ", messageBody=" + messageBody + "]";
	}
	
}
