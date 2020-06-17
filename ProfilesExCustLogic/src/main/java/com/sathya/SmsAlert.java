package com.sathya;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sms")
public class SmsAlert implements AlertService{

	@Override
	public void showMsg() {
		System.out.println("From SmsAlert service");
	}

}
