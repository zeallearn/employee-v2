package com.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("/userLoginId")
	public String loginId(@RequestParam String requestParam) {
		return "login";
	}
	
	@GetMapping("/userLogin")
	public String login() {
		return "userLogin";
	}
	/*
	 * @GetMapping("/") public String home() { return "index"; }
	 */
}
