package com.sdp3.homestay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeStayController {
	@RequestMapping("/signup")  
	public String signup(Model model)  
	{
		return "signup.html";
	}
	@RequestMapping("/login")  
	public String login(Model model)  
	{
		return "signup.html";
	}
	
}

