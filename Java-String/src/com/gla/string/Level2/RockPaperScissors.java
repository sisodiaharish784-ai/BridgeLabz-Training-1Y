package com.gla.string.Level2;

import java.util.Scanner;

class RockPaperScissors {

    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String winner(String u, String c) {
        if (u.equals(c)) return "Draw";
        if (u.equals("rock") && c.equals("scissors")) return "User";
        if (u.equals("paper") && c.equals("rock")) return "User";
        if (u.equals("scissors") && c.equals("paper")) return "User";
        return "Computer";
    }

    static String[][] stats(int u, int c, int t) {
        String[][] a = new String[2][3];
        a[0][0] = "User";
        a[0][1] = String.valueOf(u);
        a[0][2] = String.valueOf((u * 100) / t);

        a[1][0] = "Computer";
        a[1][1] = String.valueOf(c);
        a[1][2] = String.valueOf((c * 100) / t);
        return a;
    }

    static void displayGames(String[][] g) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < g.length; i++)
            System.out.println((i+1) + "\t" + g[i][0] + "\t" + g[i][1] + "\t\t" + g[i][2]);
    }

    static void displayStats(String[][] s) {
        System.out.println("\nPlayer\tWins\tWin%");
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i][0] + "\t" + s[i][1] + "\t" + s[i][2] + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[][] games = new String[n][3];
        int uw = 0, cw = 0;

        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);

            games[i][0] = user;
            games[i][1] = comp;
            games[i][2] = win;

            if (win.equals("User")) uw++;
            else if (win.equals("Computer")) cw++;
        }

        displayGames(games);
        String[][] s = stats(uw, cw, n);
        displayStats(s);
    }
}

