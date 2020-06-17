package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ReadVariablesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ReadVariablesApplication.class, args);
		Sample s=ctx.getBean("s1",Sample.class);
		s.data();
	}

}
