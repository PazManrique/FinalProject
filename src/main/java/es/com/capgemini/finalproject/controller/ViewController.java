package es.com.capgemini.finalproject.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import es.com.capgemini.finalproject.model.Move;
//@Controller
//@RequestMapping("/game")

public class ViewController {
	
	 @GetMapping("/")
	  public String gameIndex(Model model) {
		 return "index";
	  }
	 
	 
	 @GetMapping("/result")
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
