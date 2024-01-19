package com.learning.gruppo2cocktail.interfaccie;

import com.learning.gruppo2cocktail.model.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, Integer> {
}
