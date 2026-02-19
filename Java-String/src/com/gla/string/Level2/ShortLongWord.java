package com.gla.string.Level2;

import java.util.Scanner;

class ShortLongWord {

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
        idx[0] = -1;
        int k = 1;

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

    static String[][] wordLength(String[] a) {
        String[][] r = new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            r[i][0] = a[i];
            r[i][1] = String.valueOf(len(a[i]));
        }
        return r;
    }

    static int[] findMinMax(String[][] a) {
        int min = Integer.parseInt(a[0][1]);
        int max = min;
        int mi = 0, ma = 0;

        for (int i = 1; i < a.length; i++) {
            int v = Integer.parseInt(a[i][1]);
            if (v < min) { min = v; mi = i; }
            if (v > max) { max = v; ma = i; }
        }
        return new int[]{mi, ma};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = splitText(s);
        String[][] data = wordLength(words);
        int[] r = findMinMax(data);

        System.out.println("Shortest: " + data[r[0]][0]);
        System.out.println("Longest: " + data[r[1]][0]);
    }
}
