package com.sathya;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("c1")
@Primary
public class Child1 implements IChild{

	public void study() {
		System.out.println("This is Child1");
	
	}

}
