package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ReadDataOfClassApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ReadDataOfClassApplication.class, args);
		Sample s1=ctx.getBean("sample",Sample.class);
		s1.data();
	}

}
