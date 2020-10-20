package com.example.spring_jpa.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecipeIngredientTest {

    RecipeIngredient testObject;

    int recipeIngredientId;
    Ingredient ingredient;
    double amount;
    Recipe recipe;

    @BeforeEach
    void setUp() {
        recipeIngredientId = 1;
        amount = 0.01;
        ingredient = new Ingredient(1, "Spice Rub");
        recipe = new Recipe();
        testObject = new RecipeIngredient(recipeIngredientId ,ingredient , amount , Measurement.G, recipe);
    }

    @Test
    void test_Create() {
        assertEquals(recipeIngredientId, testObject.getRecipeIngredientId());
        assertEquals(ingredient, testObject.getIngredient());
        assertEquals(amount, testObject.getAmount());
        assertEquals(Measurement.G, testObject.getMeasurement());
        assertEquals(recipe, testObject.getRecipe());
    }

    @Test
    void test_Equals() {
        RecipeIngredient isEqual = new RecipeIngredient(recipeIngredientId ,ingredient , amount , Measurement.G, recipe);
        assertTrue(testObject.equals(isEqual));
    }

    @Test
    void test_HashCode() {
        RecipeIngredient expected = new RecipeIngredient(recipeIngredientId ,ingredient , amount , Measurement.G, recipe);
        assertEquals(expected.hashCode(), testObject.hashCode());
    }
}
