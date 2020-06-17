package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesExApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ProfilesExApplication.class, args);
		SpringApplication app=new SpringApplication(ProfilesExApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
