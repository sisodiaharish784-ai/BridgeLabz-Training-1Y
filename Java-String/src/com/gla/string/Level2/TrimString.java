package com.gla.string.Level2;

import java.util.Scanner;

class TrimString {

    static int[] trimIndex(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j && s.charAt(i) == ' ') i++;
        while (j >= i && s.charAt(j) == ' ') j--;
        return new int[]{i, j + 1};
    }

    static String sub(String s, int a, int b) {
        String r = "";
        for (int i = a; i < b; i++)
            r += s.charAt(i);
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

        int[] idx = trimIndex(s);
        String t1 = sub(s, idx[0], idx[1]);
        String t2 = s.trim();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(same(t1, t2));
    }
}

