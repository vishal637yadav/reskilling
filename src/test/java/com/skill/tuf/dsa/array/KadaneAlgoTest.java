package com.skill.tuf.dsa.array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KadaneAlgoTest {

    KadaneAlgo kadaneAlgo;

    @BeforeEach
    void setUp() {
        kadaneAlgo = new KadaneAlgo();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void bruteForce_getLargestSumOfSubArray() {
        int [] inputArray = {2, 3, 5, -2, 7, -4};
        int expectedOutput = 15;
        //int actualOutput = kadaneAlgo.bruteForce_maxSubArray(inputArray);
        //int actualOutput = kadaneAlgo.better_maxSubArray(inputArray);
        //int actualOutput = kadaneAlgo.optimal_maxSubArray(inputArray);
        int actualOutput = kadaneAlgo.optimal_maxSubArray_followUp(inputArray);

        System.out.println("actualOutput   ::"+actualOutput);
        System.out.println("expectedOutput ::"+expectedOutput);

        assertEquals(actualOutput,expectedOutput);
    }
}