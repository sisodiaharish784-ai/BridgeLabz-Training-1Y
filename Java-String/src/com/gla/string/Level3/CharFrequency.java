package com.gla.string.Level3;

import java.util.Scanner;

class CharFrequency {

    static String[][] freq(String s) {
        int[] f = new int[256];

        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;

        int c = 0;
        for (int i = 0; i < 256; i++)
            if (f[i] > 0) c++;

        String[][] r = new String[c][2];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (f[ch] > 0) {
                r[k][0] = String.valueOf(ch);
                r[k][1] = String.valueOf(f[ch]);
                k++;
                f[ch] = 0;
            }
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

