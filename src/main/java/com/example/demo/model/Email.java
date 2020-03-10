package com.example.demo.model;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString
@Document(collection = "Emails")
public class Email {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String emailText;
	private String emailSubject;
	private String emailFrom;
	private String emailTo;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmailText() {
		return emailText;
	}
	public void setEmailText(String emailText) {
		this.emailText = emailText;
	}
	public String getEmailSubject() {
		return emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}
	
}
