package com.example.spring_jpa.repository;

import com.example.spring_jpa.entities.Recipe;
import com.example.spring_jpa.entities.RecipeCategory;
import com.example.spring_jpa.entities.RecipeIngredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepo extends CrudRepository<RecipeRepo, Integer> {

    List<Recipe> findByRecipeName (String recipeName);
    List<RecipeIngredient> findByAllRecipeIngredient (String ingredientName);
    List<RecipeCategory> findByAllRecipeCategory (String category);
    List<RecipeCategory> findByAllRecipeCategories (List<RecipeCategory> categories);
}
