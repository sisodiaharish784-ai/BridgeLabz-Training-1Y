package com.gla.string.Level3;

import java.util.Scanner;

class BMICalculator {

    static String[][] bmiStatus(double[][] a) {
        String[][] r = new String[a.length][4];
        for (int i = 0; i < a.length; i++) {
            double w = a[i][0];
            double h = a[i][1] / 100.0;
            double bmi = w / (h * h);
            bmi = Math.round(bmi * 100.0) / 100.0;

            r[i][0] = String.valueOf(a[i][1]);
            r[i][1] = String.valueOf(w);
            r[i][2] = String.valueOf(bmi);

            if (bmi < 18.5) r[i][3] = "Underweight";
            else if (bmi < 25) r[i][3] = "Normal";
            else if (bmi < 30) r[i][3] = "Overweight";
            else r[i][3] = "Obese";
        }
        return r;
    }

    static void display(String[][] a) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t\t" + a[i][1] + "\t\t" + a[i][2] + "\t" + a[i][3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble();
            hw[i][1] = sc.nextDouble();
        }

        String[][] result = bmiStatus(hw);
        display(result);
    }
}

