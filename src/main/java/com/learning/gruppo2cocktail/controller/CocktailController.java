package com.learning.gruppo2cocktail.controller;

import com.learning.gruppo2cocktail.interfaccie.CocktailRepository;
import com.learning.gruppo2cocktail.model.Cocktail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cocktails")
public class CocktailController {
    @Autowired
    private CocktailRepository cocktailRepository;

    // Get all cocktails
    @GetMapping
    public String index(Model model) {
        List<Cocktail> cocktails = cocktailRepository.findAll();
        model.addAttribute("cocktails", cocktails);
        return "cocktail/home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Cocktail cocktail = new Cocktail();
        model.addAttribute("cocktail", cocktail);

        // Passo tramite Model, la lista degli ingredienti
        model.addAttribute("ingredientList", cocktailRepository.findAll());
        return "cocktail/newCocktail";
    }
}