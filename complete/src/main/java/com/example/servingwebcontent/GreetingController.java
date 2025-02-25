package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	final String TITLE = "asd";

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Home") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	@GetMapping("/home")
	public String homeAction(Model model) {
		model.addAttribute("title", TITLE);
		return "home";
	}

}
