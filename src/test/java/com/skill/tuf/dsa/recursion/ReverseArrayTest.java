package com.skill.tuf.dsa.recursion;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    private static ReverseArray reverseArray;

    @BeforeAll
    public static void setUp(){
        final Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.setLevel(Level.DEBUG);

        reverseArray = new ReverseArray();
    }


    @Test
    void test1() {
        int [] inputArray = {1,2,3,4,5,6,7};
        int [] expectedOutput = {7,6,5,4,3,2,1};
        int [] actualOutput = reverseArray.reverseArray(inputArray);
        assertArrayEquals(actualOutput,expectedOutput);
    }

    @Test
    void test2() {
        int [] inputArray = {1,2,3,4,5,6};
        int [] expectedOutput = {6,5,4,3,2,1};
        int [] actualOutput = reverseArray.reverseArray(inputArray);
        assertArrayEquals(actualOutput,expectedOutput);
    }

    @Test
    void test3() {
        int [] inputArray = {1,2};
        int [] expectedOutput = {2,1};
        int [] actualOutput = reverseArray.reverseArray(inputArray);
        assertArrayEquals(actualOutput,expectedOutput);
    }

    @Test
    void test4() {
        int [] inputArray = {1};
        int [] expectedOutput = {1};
        int [] actualOutput = reverseArray.reverseArray(inputArray);
        assertArrayEquals(actualOutput,expectedOutput);
    }

    @Test
    void test5() {
        int [] inputArray = {};
        int [] expectedOutput = {};
        int [] actualOutput = reverseArray.reverseArray(inputArray);

        assertArrayEquals(actualOutput,expectedOutput);
    }

}