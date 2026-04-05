package com.gla.Wrapper;

import java.util.ArrayList;

public class PerformanceComparison {
    public static void main(String[] args) {
        int n = 1000000;

        long startArray = System.currentTimeMillis();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long sumArray = 0;
        for (int i = 0; i < n; i++) {
            sumArray += arr[i];
        }
        long endArray = System.currentTimeMillis();

        long startList = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long sumList = 0;
        for (Integer val : list) {
            sumList += val;
        }
        long endList = System.currentTimeMillis();

        System.out.println("Array sum: " + sumArray);
        System.out.println("Array time: " + (endArray - startArray) + " ms");

        System.out.println("ArrayList sum: " + sumList);
        System.out.println("ArrayList time: " + (endList - startList) + " ms");
    }
}
