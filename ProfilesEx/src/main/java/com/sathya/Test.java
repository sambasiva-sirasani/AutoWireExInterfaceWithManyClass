package com.sathya;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {
	
	@Value("${my.db.name}")
	private String name;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("The Db is:"+name);
	}

}
