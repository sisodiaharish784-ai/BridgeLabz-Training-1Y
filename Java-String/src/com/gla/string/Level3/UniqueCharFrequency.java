package com.gla.string.Level3;

import java.util.Scanner;

class UniqueCharFrequency {

    static char[] uniqueChars(String s) {
        char[] t = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean u = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == c) u = false;
            if (u) t[k++] = c;
        }

        char[] r = new char[k];
        for (int i = 0; i < k; i++) r[i] = t[i];
        return r;
    }

    static String[][] freq(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;

        char[] u = uniqueChars(s);
        String[][] r = new String[u.length][2];

        for (int i = 0; i < u.length; i++) {
            r[i][0] = String.valueOf(u[i]);
            r[i][1] = String.valueOf(f[u[i]]);
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] r = freq(s);

        System.out.println("Char\tCount");
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i][0] + "\t" + r[i][1]);
    }
}

