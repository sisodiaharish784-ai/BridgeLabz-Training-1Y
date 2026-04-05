package com.gla.Wrapper;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing2 {
    public static void main(String[] args) {
        int[] ages = {22, 45, 19, 30, 27};

        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages) {
            ageList.add(age);
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest age: " + youngest);
        System.out.println("Oldest age: " + oldest);
    }
}
