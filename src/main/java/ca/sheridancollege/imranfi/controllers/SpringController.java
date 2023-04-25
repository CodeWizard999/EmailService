package ca.sheridancollege.imranfi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.imranfi.EmailServiceImpl;
import jakarta.mail.MessagingException;

@Controller
public class SpringController {

	@Autowired
	EmailServiceImpl esi;

	/*
	@GetMapping("/")
	public String goHome() {
		esi.sendSimpleMessage("dishnserveyou@gmail.com", 
				"Test", "Some Text");

		return "home.html";
	}
	*/
	
	@GetMapping("/")
	public String goHome2() {
		try {
			esi.sendMailWithInline("fizza", 
					"Your email worked", 
					"awsome", 
					"dishnserveyou@gmail.com", 
					"Test");
		} catch (MessagingException e) {
			
			System.out.println(e);
		}
		return "home.html";
	}

}
