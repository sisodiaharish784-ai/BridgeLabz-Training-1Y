package com.gla.string.Level1;

import java.util.Scanner;

class UpperCaseCompare {

    static String toUpper(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                r += (char)(c - 32);
            else
                r += c;
        }
        return r;
    }

    static boolean same(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String u1 = toUpper(s);
        String u2 = s.toUpperCase();

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(same(u1, u2));
    }
}

