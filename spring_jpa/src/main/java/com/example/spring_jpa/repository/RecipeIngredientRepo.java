package com.example.spring_jpa.repository;

import com.example.spring_jpa.entities.RecipeIngredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeIngredientRepo extends CrudRepository<RecipeIngredient, Integer> {

    RecipeIngredient findByName(String recipeIngredientName);
}
