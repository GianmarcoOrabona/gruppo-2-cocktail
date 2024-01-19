package com.learning.gruppo2cocktail.controller;

import com.learning.gruppo2cocktail.model.Cocktail;
import org.springframework.beans.factory.annotation.Autowired;
import com.learning.gruppo2cocktail.repository.CocktailRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/cocktails")
public class CocktailController {
    private final CocktailRepository cocktailRepository;

    @Autowired
    public CocktailController(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    // Get all cocktails
    @GetMapping
    public String getAllCocktails(Model model) {
        List<Cocktail> cocktails = cocktailRepository.findAll();
        model.addAttribute("cocktails", cocktails);
        return "cocktails/list";
    }

}