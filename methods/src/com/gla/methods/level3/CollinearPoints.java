package com.gla.methods.level3;

import java.util.Scanner;

public class CollinearPoints {

    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (y2 - y1) / (double)(x2 - x1);
        double slopeBC = (y3 - y2) / (double)(x3 - x2);
        double slopeAC = (y3 - y1) / (double)(x3 - x1);

        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean collinearSlope = checkCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = checkCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Using slope method: " + (collinearSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using area method: " + (collinearArea ? "Collinear" : "Not Collinear"));

        sc.close();
    }
}

