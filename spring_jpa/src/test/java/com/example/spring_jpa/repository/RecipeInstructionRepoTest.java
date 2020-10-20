package com.example.spring_jpa.repository;

import com.example.spring_jpa.entities.RecipeInstruction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class RecipeInstructionRepoTest {

    @Autowired
    RecipeInstructionRepo recipeInstructionRepo;

    RecipeInstruction testObject;

    @BeforeEach
    public void setUp() {
        testObject = new RecipeInstruction(1,"Pasta Pesto");
        RecipeInstruction saveObject = recipeInstructionRepo.save(testObject);
    }

    @Test
    public void create() {
        testObject = new RecipeInstruction(1,"Pasta Pesto");
        RecipeInstruction createObject = recipeInstructionRepo.create(testObject);
    }


    @Test
    public void test_find_By_Name(){
        RecipeInstruction findProductsByName = recipeInstructionRepo.findByName("Pasta Pesto");
        System.out.println("findProductsByName = " + findProductsByName);
    }

    @Test
    public void test_Update(){
        testObject = new RecipeInstruction(1,"Pasta");
        RecipeInstruction update = recipeInstructionRepo.update(testObject);
        System.out.println("update = " + update);
    }

    @Test
    public void test_delete() {
        testObject = new RecipeInstruction(1,"Pasta Pesto");
        recipeInstructionRepo.delete(testObject);
        System.out.println("delete = " + testObject);
    }
}
