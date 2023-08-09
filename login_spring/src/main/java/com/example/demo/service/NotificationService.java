package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class NotificationService {
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}
	
	public void sendNotification(User user) throws MailException {
		SimpleMailMessage mail=new SimpleMailMessage();
		
		mail.setTo(user.getUserName());
		mail.setFrom("menotify32@gmail.com\n");
		mail.setSubject("Project Login Details");
		mail.setText("Hi "+user.getUserName()+",\nPlease login using the given credentials.\n\nYour login qualifications are as per the following:\nUsername: " +
				user.getUserName() + "\nPassword: "+ user.getPassword());
		javaMailSender.send(mail);
	}
	
	

}
