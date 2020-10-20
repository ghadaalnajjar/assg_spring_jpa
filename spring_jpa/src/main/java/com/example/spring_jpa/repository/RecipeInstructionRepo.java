package com.example.spring_jpa.repository;

import com.example.spring_jpa.entities.RecipeInstruction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeInstructionRepo extends CrudRepository<RecipeInstruction, Integer> {

    RecipeInstruction create(RecipeInstruction recipeInstruction);

    RecipeInstruction findByName(String Instructions);

    RecipeInstruction update(RecipeInstruction recipeInstruction);

    void delete(RecipeInstruction recipeInstruction);
}
