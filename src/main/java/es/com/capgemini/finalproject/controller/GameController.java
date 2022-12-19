package es.com.capgemini.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GameController  {

	 @RequestMapping("/Rock-Paper-Scissors")
	  public String hola(Model model) {
	    
	    
	    model.addAttribute("mensaje","hola desde thymeleaf");
	    return "index";
	  }
}
