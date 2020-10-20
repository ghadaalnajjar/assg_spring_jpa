package com.example.spring_jpa.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecipeInstructionTest {
    RecipeInstruction testObject;

    @BeforeEach
    public void setUp() {
        testObject = new RecipeInstruction(1,"Pasta Pesto");
    }

    @Test
    public void test_Create() {
        assertEquals(1, testObject.getInstructionId());
        assertEquals("Pasta Pesto", testObject.getInstructions());
    }

    @Test
    public void test_Equals() {
        RecipeInstruction isEqual = new RecipeInstruction(1,"Pasta Pesto");
        assertTrue(testObject.equals(isEqual));
    }

    @Test
    public void test_HashCode() {
        RecipeInstruction expected = new RecipeInstruction(1,"Pasta Pesto");
        assertEquals(expected.hashCode(), testObject.hashCode());
    }

    @Test
    public void test_ToString() {
        String toString = testObject.toString();
        assertTrue(toString.contains("1"));
        assertTrue(toString.contains("Pasta Pesto"));
    }
}
