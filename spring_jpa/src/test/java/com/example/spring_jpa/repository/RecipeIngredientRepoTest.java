package com.example.spring_jpa.repository;

import com.example.spring_jpa.entities.Ingredient;
import com.example.spring_jpa.entities.Measurement;
import com.example.spring_jpa.entities.Recipe;
import com.example.spring_jpa.entities.RecipeIngredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class RecipeIngredientRepoTest {

   @Autowired
    RecipeIngredientRepo recipeIngredientRepo;

    RecipeIngredient testObject;

    int recipeIngredientId;
    Ingredient ingredient;
    double amount;
    Recipe recipe;

    @BeforeEach
    public void setUp() {
        recipeIngredientId = 1;
        amount = 0.01;
        ingredient = new Ingredient(1, "Spice Rub");
        recipe = new Recipe();
        testObject = new RecipeIngredient(recipeIngredientId ,ingredient , amount , Measurement.G, recipe);
    }

    @Test
    public void test_find_By_Name(){
        RecipeIngredient findByName = recipeIngredientRepo.findByName("Spice Rub");
        System.out.println("findByName = " + findByName);
    }
}
