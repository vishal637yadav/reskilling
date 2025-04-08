package com.skill.tuf.dsa.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsValidParenthesisTest {

    private IsValidParenthesis isValidParenthesis;

    @BeforeEach
    void setUp() {
        isValidParenthesis = new IsValidParenthesis();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isValid1() {
        String inputString  = "{[()]}";
        boolean expectedOutput = true;
        boolean actualOutput = isValidParenthesis.isValid(inputString);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void isValid2() {
        String inputString  = "{[()}";
        boolean expectedOutput = false;
        boolean actualOutput = isValidParenthesis.isValid(inputString);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void isValid3() {
        String inputString  = "{][}";
        boolean expectedOutput = false;
        boolean actualOutput = isValidParenthesis.isValid(inputString);
        assertEquals(expectedOutput,actualOutput);
    }
}