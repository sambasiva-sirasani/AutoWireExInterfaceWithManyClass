package com.sathya;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("social")
public class SocialAlert implements AlertService{

	@Override
	public void showMsg() {
		System.out.println("From SocialAlert Service");
	}

}
