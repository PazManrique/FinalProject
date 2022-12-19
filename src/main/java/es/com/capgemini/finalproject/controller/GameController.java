package es.com.capgemini.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GameController  {

	 @RequestMapping("/")
	  public String gameIndex(Model model) {
	   
	    return "index";
	  }
	 
	 @RequestMapping("/result")
	  public String gameResult(Model model) {
	    
	
	    return "result";
	  }
	 
	 @RequestMapping("/table")
	  public String gameTable(Model model) {
	    
	
	    return "table";
	  }
}
