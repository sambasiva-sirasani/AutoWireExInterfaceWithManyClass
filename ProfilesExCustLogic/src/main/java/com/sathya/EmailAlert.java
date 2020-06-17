package com.sathya;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class EmailAlert implements AlertService{

	@Override
	public void showMsg() {
		System.out.println("From EmailAlert Service");
	}

}
