package com.gla.Wrapper;

import java.util.ArrayList;
import java.util.Objects;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {4, 5, 3, 4};

        ArrayList<Integer> objectRatings = new ArrayList<>();
        objectRatings.add(5);
        objectRatings.add(null);
        objectRatings.add(3);

        ArrayList<Integer> combined = new ArrayList<>();

        for (int rating : primitiveRatings) {
            combined.add(rating);
        }

        for (Integer rating : objectRatings) {
            if (Objects.nonNull(rating)) {
                combined.add(rating);
            }
        }

        int sum = 0;
        int count = 0;

        for (Integer rating : combined) {
            sum += rating;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Average rating: " + average);
    }
}