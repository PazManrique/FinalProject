package es.com.capgemini.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.com.capgemini.finalproject.model.Result;
import es.com.capgemini.finalproject.service.ResultService;

@RestController
@RequestMapping("/")
public class GameController  {
	@Autowired
	ResultService resultService;

	 @GetMapping("/")
	  public ResponseEntity<Iterable<Result>> resultList(){
		 Iterable<Result> results = resultService.resultList();
		 return new ResponseEntity<Iterable<Result>>(results, HttpStatus.OK);
	  }
	 
	 @PostMapping("/result")
	  public String gameResult(Model model) {
	   
	    return "result";
	  }
	 
	 @GetMapping("/table")
	  public String gameTable(Model model) {
	   
	    return "table";
	  }
}
