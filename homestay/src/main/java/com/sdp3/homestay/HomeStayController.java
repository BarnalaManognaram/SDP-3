package com.sdp3.homestay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeStayController {
	@RequestMapping("/index")  
	public String getAllBooks(Model model)  
	{
		return "index.html";
	}
	
}

