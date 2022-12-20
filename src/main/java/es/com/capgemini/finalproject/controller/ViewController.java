package es.com.capgemini.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class ViewController {
	
	 @GetMapping("/")
	  public String gameIndex(Model model) {
		 return "index";
	  }
	 
	 
	 @GetMapping("/results")
	  public String gameResults(Model model) {
		 return "result";
	  }

	 
	 @GetMapping("/table")
	  public String gameTable(Model model) {
		 return "table";
	  }

}
