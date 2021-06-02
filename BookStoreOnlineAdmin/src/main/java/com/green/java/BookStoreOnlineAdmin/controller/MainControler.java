package com.green.java.BookStoreOnlineAdmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainControler {

	@GetMapping("/login")
	public String showLoginView() {
		return "login";
	}	

}
