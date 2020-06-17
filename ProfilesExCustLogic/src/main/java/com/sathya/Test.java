package com.sathya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner{
	
	@Autowired
	private AlertService as;
	@Override
	public void run(String... args) throws Exception {
		as.showMsg();
	}

}
