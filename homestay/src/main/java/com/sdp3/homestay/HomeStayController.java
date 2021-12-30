package com.sdp3.homestay;

import javax.servlet.http.HttpSession;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



 


@Controller
public class HomeStayController {
	
	 @Autowired HttpSession session;
	
	 
	
	
	@RequestMapping("/")  
	public String login(Model model)  
	{
		return "login.html";
	}
	
	
}

