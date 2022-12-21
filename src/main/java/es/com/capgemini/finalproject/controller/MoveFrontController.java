package es.com.capgemini.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import es.com.capgemini.finalproject.model.MoveFront;
import es.com.capgemini.finalproject.service.MoveService;


@Controller
@RequestMapping("/book")
public class MoveFrontController {

	
    private final MoveService moveService;

    public MoveFrontController(MoveService moveService) {
        this.moveService = moveService;
    }

    @GetMapping("/viewMoveFronts")
    public String viewMoveFronts(Model model) {
        model.addAttribute("move", moveService.getMove());
        return "table";
    }

    @GetMapping("/")
    public String addMoveFrontView(Model model) {
        model.addAttribute("move", new MoveFront());
        return "index";
    }

    @PostMapping("/")
    public RedirectView addMoveFront(@ModelAttribute("move") MoveFront book, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/book/addMoveFront", true);
        MoveFront savedMoveFront = moveService.addMoveFront(book);
        redirectAttributes.addFlashAttribute("savedMoveFront", savedMoveFront);
        redirectAttributes.addFlashAttribute("addMoveFrontSuccess", true);
        return redirectView;
    }
}