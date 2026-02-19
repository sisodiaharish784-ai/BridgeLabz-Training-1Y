package com.gla.string.Level2;

import java.util.Scanner;

class StudentGrade {

    static int[][] generatePCM(int n) {
        int[][] m = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = 10 + (int)(Math.random() * 91);
        return m;
    }

    static double[][] calcStats(int[][] m) {
        double[][] r = new double[m.length][3];
        for (int i = 0; i < m.length; i++) {
            int t = m[i][0] + m[i][1] + m[i][2];
            double avg = t / 3.0;
            double per = (t / 300.0) * 100;
            r[i][0] = t;
            r[i][1] = Math.round(avg * 100.0) / 100.0;
            r[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return r;
    }

    static String grade(double p) {
        if (p >= 80) return "A";
        if (p >= 70) return "B";
        if (p >= 60) return "C";
        if (p >= 50) return "D";
        if (p >= 40) return "E";
        return "R";
    }

    static String[] grades(double[][] s) {
        String[] g = new String[s.length];
        for (int i = 0; i < s.length; i++)
            g[i] = grade(s[i][2]);
        return g;
    }

    static void display(int[][] m, double[][] s, String[] g) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < m.length; i++)
            System.out.println((i+1)+"\t"+m[i][0]+"\t"+m[i][1]+"\t"+m[i][2]+"\t"+
                    (int)s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t"+g[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] pcm = generatePCM(n);
        double[][] stats = calcStats(pcm);
        String[] g = grades(stats);

        display(pcm, stats, g);
    }
}

