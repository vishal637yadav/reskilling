package com.skill.tuf.dsa.recursion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ReverseArray {

    private final Logger logger = LoggerFactory.getLogger(ReverseArray.class);

    public int[] reverseArray(int[] a) {
        if(logger.isDebugEnabled())
            logger.debug("-->-Input Arrays ::{}", Arrays.toString(a));

        int [] output = reverseArrayRecursively(a, 0);

        if(logger.isDebugEnabled())
            logger.debug("-->-Output Arrays ::{}", Arrays.toString(output));

        return output;
    }

    private int[] reverseArrayRecursively(int[] a, int i) {
        int size = a.length;
        //base case
        if (size == i) {
            return new int[size];
        }

        int[] outArr = reverseArrayRecursively(a, i + 1);
        outArr[size - i - 1] = a[i];
        if(logger.isDebugEnabled())
            logger.debug("-->->--OutArr ::{}", Arrays.toString(outArr));

        return outArr;
    }


}
