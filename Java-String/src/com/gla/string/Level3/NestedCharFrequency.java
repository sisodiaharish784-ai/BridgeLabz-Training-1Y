package com.gla.string.Level3;

import java.util.Scanner;

class NestedCharFrequency {

    static String[] frequency(String s) {
        char[] c = s.toCharArray();
        int[] f = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            f[i] = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    f[i]++;
                    c[j] = '0';
                }
            }
        }

        int k = 0;
        for (int i = 0; i < c.length; i++)
            if (c[i] != '0') k++;

        String[] r = new String[k * 2];
        int x = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] != '0') {
                r[x++] = String.valueOf(c[i]);
                r[x++] = String.valueOf(f[i]);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] r = frequency(s);

        System.out.println("Char\tCount");
        for (int i = 0; i < r.length; i += 2)
            System.out.println(r[i] + "\t" + r[i + 1]);
    }
}

