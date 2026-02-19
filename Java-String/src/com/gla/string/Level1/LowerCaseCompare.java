package com.gla.string.Level1;

import java.util.Scanner;

class LowerCaseCompare {

    static String toLower(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                r += (char)(c + 32);
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

        String l1 = toLower(s);
        String l2 = s.toLowerCase();

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(same(l1, l2));
    }
}

