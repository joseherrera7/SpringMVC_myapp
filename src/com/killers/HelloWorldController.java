package com.killers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	//HttpServletRequest request
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("UserName") String name, Model model) {
		//String nombre = request.getParameter("UserName");
		
		//Adding info to the model
		model.addAttribute("message", name.concat(" you are the best"));
		
		return "ProcessingForm";
	}
}
