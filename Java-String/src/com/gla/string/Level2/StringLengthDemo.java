package com.gla.string.Level2;

import java.util.Scanner;

class StringLengthDemo {

    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int l1 = findLength(s);
        int l2 = s.length();

        System.out.println(l1);
        System.out.println(l2);
    }
}

