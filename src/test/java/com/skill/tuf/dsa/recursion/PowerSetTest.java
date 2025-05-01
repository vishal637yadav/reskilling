package com.skill.tuf.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerSetTest {

    PowerSet powerSet;

    @BeforeEach
    void setUp() {
        powerSet = new PowerSet();
    }

    @Test
    void powerSet() {
        int[] inputArray = {1, 2, 3, 4};
        int[][] expectedOutputArray = {{}, {1}, {2}, {1, 2}};

        ArrayList<ArrayList<Integer>> actualOutput = powerSet.powerSet(inputArray);
        System.out.println("actualOutput ::" + actualOutput);
    }

    @Test
    void printPowerSetRecursively() {
        int [] inputArray1 = {};
        List<String> outputList1 = List.of("{}");
        List<String> actualList1 = powerSet.printPowerSetRecursively(inputArray1);
        checkListEquality(outputList1,actualList1);

        int [] inputArray2 = {1};
        List<String> outputList2 = List.of("{}","{1}");
        List<String> actualList2 = powerSet.printPowerSetRecursively(inputArray2);
        checkListEquality(outputList2,actualList2);

        int [] inputArray3 = {1,2};
        List<String> outputList3 = List.of("{}","{1}","{2}","{1,2}");
        List<String> actualList3 = powerSet.printPowerSetRecursively(inputArray3);
        checkListEquality(outputList3,actualList3);

        int [] inputArray4 = {1,2,3};
        List<String> outputList4 = List.of("{}","{1}","{2}","{1,2}","{3}","{1,3}","{2,3}","{1,2,3}");
        List<String> actualList4 = powerSet.printPowerSetRecursively(inputArray4);
        checkListEquality(outputList4,actualList4);

        int [] inputArray5 = {1,2,3,4};
        List<String> outputList5 = List.of("{}","{1}","{2}","{1,2}","{3}","{1,3}","{2,3}","{1,2,3}","{4}","{1,4}","{2,4}","{1,2,4}","{3,4}","{1,3,4}","{2,3,4}","{1,2,3,4}");
        List<String> actualList5 = powerSet.printPowerSetRecursively(inputArray5);
        checkListEquality(outputList5,actualList5);

    }

    void checkListEquality(List<String> l1, List<String> l2){
        System.out.println("----------------------");
        List<String> sorted1 = new ArrayList<>(l1);
        List<String> sorted2 = new ArrayList<>(l2);
        Collections.sort(sorted1);
        Collections.sort(sorted2);
        System.out.println("--sorted1 ::"+sorted1);
        System.out.println("--sorted2 ::"+sorted2);
        System.out.println("----------------------");
        assertEquals(sorted1, sorted2);

    }

}