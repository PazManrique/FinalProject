package es.com.capgemini.finalproject.controller;

 

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import es.com.capgemini.finalproject.model.CharacterFactory;
import es.com.capgemini.finalproject.model.Move;
import es.com.capgemini.finalproject.service.ResultService;

 

//@Controller
//@RequestMapping("/aei")
public class GameController  {
    
    @Autowired
    private ResultService resultService;
    
     @GetMapping("/all")
      public ResponseEntity<Iterable<Move>> resultList(){
         Iterable<Move> results = resultService.resultList();
         return new ResponseEntity<Iterable<Move>>(results, HttpStatus.OK);
      }
     
     
     @GetMapping("/iou")
        public String moveForm(Model model){
            Move move = new Move();
//            CharacterFactory fig = new CharacterFactory() {
//				
//				
//			};
			CharacterFactory fig = CharacterFactory.getInstance(0);
            model.addAttribute("move", move);
            model.addAttribute("fig", fig);
            model.addAttribute("figu", CharacterFactory.getInstance(1));
          
            return "index";
        }
     @GetMapping("/table")
        public String listMOve(Model model) {
            model.addAttribute("moves", resultService.resultList());
            return "table";
        }
     
     @PostMapping("/table")
        public String saveStudent(@ModelAttribute("move") Move move) {
            resultService.saveResult(move);
            return "redirect:/table";
        }
     
     

 

     @PostMapping("/Dresults") public Move addResult(@RequestBody Move

 

              theResult) {
              
              
         theResult.setIdResults(0);
              
              resultService.saveResult(theResult);
              
              return theResult; }

 

     
     @GetMapping("/Dtable")
      public String gameTable(Model model) {
       
        return "table";
      }
     
     
     @PutMapping("/Dtable")
        public Move updateProduct(@RequestBody Move theResult) {
            
         resultService.saveResult(theResult);
            
            return theResult;
        }
        
        // add mapping for DELETE /Products/{productId} - delete Product
        
        @DeleteMapping("/DProducts/{productId}")
        public String deleteProduct(@PathVariable int idResults) {
            
            Move tempProduct = resultService.findById(idResults);
            
            // throw exception if null
            
            if (tempProduct == null) {
                throw new RuntimeException("Product id not found - " + idResults);
            }
            
            resultService.deleteById(idResults);
            
            return "Deleted Product id - " + idResults;
        }
     
     
     
     
     
}
