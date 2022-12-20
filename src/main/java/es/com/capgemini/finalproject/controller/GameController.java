package es.com.capgemini.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.com.capgemini.finalproject.model.Result;
import es.com.capgemini.finalproject.service.ResultService;

@RestController
@Controller
@RequestMapping("/")
public class GameController  {
	@Autowired
	ResultService resultService;
	
	 @GetMapping("/all")
	  public ResponseEntity<Iterable<Result>> resultList(){
		 Iterable<Result> results = resultService.resultList();
		 return new ResponseEntity<Iterable<Result>>(results, HttpStatus.OK);
	  }
	 
	 
	 @PostMapping("/Dresults") public Result addResult(@RequestBody Result
			  theResult) {
			  
			  
		 theResult.setIdResults(0);
			  
			  resultService.saveResult(theResult);
			  
			  return theResult; }
	 
	
	 
	 @GetMapping("/Dtable")
	  public String gameTable(Model model) {
	   
	    return "table";
	  }
	 
	 
	 @PutMapping("/Dtable")
		public Result updateProduct(@RequestBody Result theResult) {
			
		 resultService.saveResult(theResult);
			
			return theResult;
		}
		
		// add mapping for DELETE /Products/{productId} - delete Product
		
		@DeleteMapping("/DProducts/{productId}")
		public String deleteProduct(@PathVariable int idResults) {
			
			Result tempProduct = resultService.findById(idResults);
			
			// throw exception if null
			
			if (tempProduct == null) {
				throw new RuntimeException("Product id not found - " + idResults);
			}
			
			resultService.deleteById(idResults);
			
			return "Deleted Product id - " + idResults;
		}
	 
	 
	 
	 
	 
}
