package com.skill.tuf.dsa.array;
/*
Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.

Examples:
Input: nums = [2, 3, 5, -2, 7, -4]
Output: 15
Explanation: The subarray from index 0 to index 4 has the largest sum = 15
*/

public class KadaneAlgo {

    public int bruteForce_maxSubArray(int a[]) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                StringBuilder sb = new StringBuilder();
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                    sb.append(a[k]).append(",");
                }
                sb.delete(sb.length() - 1, sb.length());
                System.out.println("-------------------------------------");
                System.out.println("maxSum ---::" + maxSum);
                System.out.println("sb.    ---::" + sb);
                System.out.println("sum    ---::" + sum);
                System.out.println("-------------------------------------");
                sb.delete(0, sb.length());
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }
        return maxSum;
    }

    public int better_maxSubArray(int a[]) {
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < a.length; j++) {
                sum += a[j];
                sb.append(a[j]).append(",");
                //sb.delete(sb.length()-1,sb.length());
                System.out.println("-------------------------------------");
                System.out.println("maxSum ---::" + maxSum);
                System.out.println("sb.    ---::" + sb);
                System.out.println("sum    ---::" + sum);
                System.out.println("-------------------------------------");

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            sb.delete(0, sb.length());

        }
        return maxSum;
    }

    public int optimal_maxSubArray(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum <0){
                sum = 0;
            }
        }

        return maxSum;
    }

    public int optimal_maxSubArray_followUp(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int startIndex =-1, endIndex=-1;

        for (int i = 0; i < a.length; i++) {
            if(sum == 0){
                startIndex=i;
            }
            sum += a[i];
            if(sum > maxSum){
                maxSum = sum;
                endIndex = i;
            }
            if(sum <0){
                sum = 0;
            }
        }
        System.out.println("Start :"+startIndex+",  End : "+endIndex);
        return maxSum;
    }

}
