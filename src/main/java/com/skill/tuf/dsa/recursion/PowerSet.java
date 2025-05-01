package com.skill.tuf.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    public ArrayList<ArrayList<Integer>> powerSet(int[] a) {

        return powerSetRecursiveHelper(a, a.length - 1);

    }

    private ArrayList<ArrayList<Integer>> powerSetRecursiveHelper(int[] a, int index) {
        ArrayList<ArrayList<Integer>> rlist = null;
        //base case
        if (index == 0) {
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();
            l2.add(a[index]);

            rlist = new ArrayList<>();
            rlist.add(l1);
            rlist.add(l2);
            return rlist;
        }

        ArrayList<ArrayList<Integer>> olist = powerSetRecursiveHelper(a, index - 1);
        rlist = new ArrayList<>(olist);

        for (ArrayList<Integer> l : olist) {
            ArrayList<Integer> cloneList = (ArrayList<Integer>) l.clone();
            cloneList.add(a[index]);
            rlist.add(cloneList);
        }

        return rlist;
    }

    private void powerSetRecursiveHelper2(int[] arr, int index, String ans,List<String> ansList) {
        if (index == arr.length) {
            if(!ans.isEmpty()){
                ans = ans.substring(1);
            }
            ansList.add("{"+ans+"}");
            return;
        }
        //Without Including Current Element
        powerSetRecursiveHelper2(arr, index + 1, ans,ansList);
        //Including Current Element
        powerSetRecursiveHelper2(arr, index + 1, ans + "," + arr[index],ansList);

    }

    public List<String> printPowerSetRecursively(int[] arr) {
        List<String> ansList = new ArrayList<>();
        powerSetRecursiveHelper2(arr, 0, "",ansList);

        System.out.println("arr ::-->>"+Arrays.toString(arr)+" |-| ansList ::-->>"+ansList);
        return ansList;
    }


}
