package com.green.java.BookStoreOnlineClient.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	@GetMapping("/login")
	public String showLoginView() {
		
		return "login";
	}
}
