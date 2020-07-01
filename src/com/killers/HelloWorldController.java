package com.killers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() { //gives the form
		return "HelloWorldForm";
	}
	
	/*@RequestMapping("/processForm")
	public String processForm() {
		return "ProcessingForm";
	}*/
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		String nombre = request.getParameter("UserName");
		
		//Adding info to the model
		model.addAttribute("message", nombre.concat(" you are the best"));
		
		return "ProcessingForm";
	}
}
