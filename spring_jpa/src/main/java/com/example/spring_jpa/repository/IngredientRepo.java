package com.example.spring_jpa.repository;

import com.example.spring_jpa.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepo extends CrudRepository<Ingredient, Integer> {

    List<Ingredient> findByIngredientName (String ingredientName);
}
