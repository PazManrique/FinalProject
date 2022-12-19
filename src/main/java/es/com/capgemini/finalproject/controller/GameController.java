package es.com.capgemini.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.com.capgemini.finalproject.service.ResultService;

@Controller
@RequestMapping("/")
public class GameController {

	private final ResultService resultService;
	
	public GameController (ResultService resultService){
		this.resultService = resultService;
	}
	
	@GetMapping("/")
	public String gameIndex (Model model) {
		return "index";
		
	}
	
	@GetMapping("/result")
	public String gameResult (Model model) {
		return "result";
		
	}
	
	@GetMapping("/table")
	public String gameTable (Model model) {
		return "table";
		
	}
}
