package es.com.capgemini.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.com.capgemini.finalproject.model.Move;
@Controller
@RequestMapping("/aei")
public class ViewController {
	
	 @GetMapping("/")
	  public String gameIndex(Model model) {
		 return "index";
	  }
	 
	 
	 @GetMapping("/res")
	  public String gameResults(Model model) {
		 return "result";
	  }

	 
	 @PostMapping("/table")
	  public String gameTable(Model model) {
		 return "table";
	  }
	 
	  @GetMapping("/s")
	    public String createStudentForm(Model model){
	        
	        // este objeto Student almacenara los valores 
	        Move move = new Move();
	       
	        model.addAttribute("move", move);

	        return "index";
	    }

}