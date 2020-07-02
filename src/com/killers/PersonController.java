package com.killers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		PersonImp person = new PersonImp();
		model.addAttribute("person", person);
		return "personRegister";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("person") PersonImp person,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "personRegister";
		} else {
			return "personConfirmed";
		}
		
	}
}
