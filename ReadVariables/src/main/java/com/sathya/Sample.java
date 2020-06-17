package com.sathya;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Sample {
	
	//Reading Static Data
	/*
	 * @Value("111") private int id;
	 * 
	 * @Value("siva") private String name;
	 * 
	 * public void data() { System.out.println("Data is:"+id+"====="+name); }
	 */

	//Reading from Application.Properties
	@Value("${id}")
	private int id;
	@Value("${name}")
	private String name;
	
	public void data() {
		System.out.println("Data is:"+id+"==="+name);
	}
}
