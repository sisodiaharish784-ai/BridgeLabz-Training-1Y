package com.gla.string.Level2;

import java.util.Scanner;

class VoteCheck {

    static String[][] checkVote(int[] a) {
        String[][] r = new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            r[i][0] = String.valueOf(a[i]);
            if (a[i] < 0) r[i][1] = "false";
            else if (a[i] >= 18) r[i][1] = "true";
            else r[i][1] = "false";
        }
        return r;
    }

    static void display(String[][] a) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t" + a[i][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        for (int i = 0; i < 10; i++)
            age[i] = sc.nextInt();

        String[][] r = checkVote(age);
        display(r);
    }
}

