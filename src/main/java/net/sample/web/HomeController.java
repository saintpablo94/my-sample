package net.sample.web;

import org.springframework.web.bind.annotation.GetMapping;

import net.sample.domain.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	
	@GetMapping("")
	public String home(Model model){
		model.addAttribute("questions", questionRepository.findAll());
		return "index";
	}
}
