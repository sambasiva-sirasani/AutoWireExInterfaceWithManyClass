package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoWireExInterfaceWithManyClassApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(AutoWireExInterfaceWithManyClassApplication.class, args);
		Father f=ctx.getBean("father",Father.class);
		f.work();
	}

}
