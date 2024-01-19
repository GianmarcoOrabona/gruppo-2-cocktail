package com.learning.gruppo2cocktail.interfaccie;

import com.learning.gruppo2cocktail.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Category, Integer> {
}
