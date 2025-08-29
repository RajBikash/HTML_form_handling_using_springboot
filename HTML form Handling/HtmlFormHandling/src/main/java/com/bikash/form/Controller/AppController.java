package com.bikash.form.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bikash.form.Model.Student;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String index() {
		 
		return "index";
	
	}
	@PostMapping("/view")
	public String register(@ModelAttribute Student student,Model model) {
		
		model.addAttribute("student",student);
		return "data";
		
	}

}
