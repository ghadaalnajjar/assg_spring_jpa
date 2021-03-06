package com.example.spring_jpa.repository;

import com.example.spring_jpa.entities.Ingredient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class IngredientRepoTest {

    @Autowired
    IngredientRepo testObject;

    @Test
    public void findByIngredientName () {
        Ingredient ingredient = testObject.save(new Ingredient(1, "Spice Rub"));
        System.out.println("Ingredient : " + ingredient);
        Ingredient ingredient1 = testObject.save(new Ingredient(2, "Rise"));
        System.out.println("Ingredient1 : " + ingredient1);

        List<Ingredient> ingredientList = testObject.findByIngredientName("Spice Rub");
        Assertions.assertTrue(ingredientList.isEmpty());
        Assertions.assertEquals(ingredient, ingredientList.get(1));
    }
}
