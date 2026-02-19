package com.gla.string.Level1;

import java.util.Scanner;

class IllegalArgDemo {

    static void generate(String s) {
        System.out.println(s.substring(5, 2));
    }

    static void handle(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        try {
            generate(s);
        } catch (RuntimeException e) {
            System.out.println("Exception generated");
        }

        handle(s);
    }
}
