package com.gla.string.Level3;

import java.util.Scanner;

class UniqueChars {

    static int len(String s) {
        int i = 0;
        try {
            while (true) s.charAt(i++);
        } catch (Exception e) {
            return i;
        }
    }

    static char[] unique(String s) {
        int l = len(s);
        char[] temp = new char[l];
        int k = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            boolean f = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == c) f = false;
            if (f) temp[k++] = c;
        }

        char[] r = new char[k];
        for (int i = 0; i < k; i++) r[i] = temp[i];
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] u = unique(s);
        for (char c : u) System.out.print(c + " ");
    }
}

