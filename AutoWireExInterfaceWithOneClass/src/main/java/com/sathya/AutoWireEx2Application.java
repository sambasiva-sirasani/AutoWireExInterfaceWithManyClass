package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoWireEx2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(AutoWireEx2Application.class, args);
		Room r=ctx.getBean("room",Room.class);
		r.save();
	}

}
