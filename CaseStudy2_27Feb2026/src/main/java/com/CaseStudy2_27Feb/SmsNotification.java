package com.CaseStudy2_27Feb;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SmsNotification implements NotificationService{

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS Sent: " + message);
		
	}

}