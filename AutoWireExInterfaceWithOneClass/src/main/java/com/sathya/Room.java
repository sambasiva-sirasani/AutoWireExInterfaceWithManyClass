package com.sathya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Room {
	@Autowired
	private ITable it;
	public void save() {
		System.out.println("This is a Room");
		it.test();
	}

}
