package com.gla.string.Level1;

import java.util.Scanner;

class StringIndexDemo {

    static void generate(String s) {
        System.out.println(s.charAt(s.length()));
    }

    static void handle(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        try {
            generate(s);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated");
        }

        handle(s);
    }
}

