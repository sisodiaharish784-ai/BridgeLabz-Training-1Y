package com.gla.string.Level2;

import java.util.Scanner;

class SplitCompare {

    static int len(String s) {
        int c = 0;
        try {
            while (true) s.charAt(c++);
        } catch (Exception e) {
            return c;
        }
    }

    static String[] splitText(String s) {
        int l = len(s), w = 1;
        for (int i = 0; i < l; i++)
            if (s.charAt(i) == ' ') w++;

        int[] idx = new int[w + 1];
        int k = 1;
        idx[0] = -1;

        for (int i = 0; i < l; i++)
            if (s.charAt(i) == ' ') idx[k++] = i;

        idx[k] = l;

        String[] r = new String[w];
        for (int i = 0; i < w; i++) {
            String t = "";
            for (int j = idx[i] + 1; j < idx[i + 1]; j++)
                t += s.charAt(j);
            r[i] = t;
        }
        return r;
    }

    static boolean same(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] a1 = splitText(s);
        String[] a2 = s.split(" ");

        System.out.println(same(a1, a2));
    }
}

