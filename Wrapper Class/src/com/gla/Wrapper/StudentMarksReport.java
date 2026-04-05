package com.gla.Wrapper;

import java.util.ArrayList;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object input : inputs) {
            try {
                if (input == null) {
                    continue;
                }

                if (input instanceof Integer) {
                    validMarks.add((Integer) input);
                } else if (input instanceof String) {
                    String str = (String) input;
                    if (str.equalsIgnoreCase("null")) {
                        continue;
                    }
                    validMarks.add(Integer.parseInt(str));
                }
            } catch (NumberFormatException e) {
            }
        }

        int sum = 0;

        for (Integer mark : validMarks) {
            sum += mark;
        }

        double average = (double) sum / validMarks.size();

        System.out.println("Average marks: " + average);
    }
}
