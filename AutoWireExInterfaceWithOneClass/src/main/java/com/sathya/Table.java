package com.sathya;

import org.springframework.stereotype.Component;

@Component
public class Table implements ITable {

	public void test() {
		System.out.println("This is Table");
	}

	

}
