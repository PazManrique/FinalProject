package es.com.capgemini.finalproject.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import es.com.capgemini.finalproject.model.CharacterFactory;
import es.com.capgemini.finalproject.model.Move;
import es.com.capgemini.finalproject.model.Result;
import es.com.capgemini.finalproject.service.ResultService;


@Controller
@RequestMapping("/")
public class GameController  {
    
    @Autowired
    private ResultService resultService;
    
     
     @GetMapping("/")
        public String moveForm(Model model){
            Move move = new Move();     
            model.addAttribute("move", move);
          
            return "index";
        }
     
     @GetMapping("/table")
        public String listResult(Model model) {
            model.addAttribute("results", resultService.resultList());
            return "table";
        }
     
     @PostMapping("/result")
        public String saveMove(@ModelAttribute("move") Move move, Model model) {
            resultService.saveResult(move);
            Result result = move.moveResult();
            model.addAttribute("result", result);
            return "result";
        }
     
 
 

     
}
