package com.sathya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Father {
	
	@Autowired
	@Qualifier("c2")
	private IChild ic;
	public void work() {
		System.out.println("Father can do Work");
		ic.study();
	}

}
