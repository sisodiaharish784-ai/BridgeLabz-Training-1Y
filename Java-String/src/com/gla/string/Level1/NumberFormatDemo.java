package com.gla.string.Level1;

import java.util.Scanner;

class NumberFormatDemo {

    static void generate(String s) {
        System.out.println(Integer.parseInt(s));
    }

    static void handle(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
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
