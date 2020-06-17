package com.sathya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
@Component
public class Test implements CommandLineRunner {
	
	@Autowired
	private Service service;

	@Override
	public void run(String... args) throws Exception {

		FileSystemResource file=new FileSystemResource("F:\\Saved Pictures\\pk.jpg");
		boolean sent=service.sendEmail("s.sambasiva599@gmail.com", 
				new String[] {
					"paleti.venkatasiva@gmail.com", 
						
				}, 
				new String[] {
						"paleti.venkatasiva@gmail.com",
						
				}, "Welcome every one", 
				"<h3>Hello abcd</h3> <b>AA</b> <i>aa</i> <u>Welcome</u>"
				, file);
		if(sent) {
			System.out.println("Email sent");
		}else {
			System.out.println("sending failed..");
		}
	}

}
