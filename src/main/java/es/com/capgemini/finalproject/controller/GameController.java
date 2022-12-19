package es.com.capgemini.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.com.capgemini.finalproject.service.ResultService;

@Controller
@RequestMapping("/")
public class GameController  {

	 @RequestMapping("/Rock-Paper-Scissors")
	  public String hola(Model model) {
	    
	    
	    model.addAttribute("mensaje","hola desde thymeleaf");
	    return "index";
	  }
}
