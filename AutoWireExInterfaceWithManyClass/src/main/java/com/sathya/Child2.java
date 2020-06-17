package com.sathya;

import org.springframework.stereotype.Component;

@Component("c2")
public class Child2 implements IChild{

	@Override
	public void study() {
		System.out.println("This is child2");
		
		}

}
