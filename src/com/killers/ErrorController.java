package com.killers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secondary")
public class ErrorController {
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("UserName") String name, Model model) {
		//String nombre = request.getParameter("UserName");
		
		//Adding info to the model
		model.addAttribute("message", name.concat(" you are the worst"));
		
		return "ProcessingForm";
	}
}
