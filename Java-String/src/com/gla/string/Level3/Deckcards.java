package com.gla.string.Level3;

import java.util.Scanner;

class DeckCards {

    static String[] initDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String s : suits)
            for (String r : ranks)
                deck[k++] = r + " of " + s;
        return deck;
    }

    static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String t = deck[i];
            deck[i] = deck[r];
            deck[r] = t;
        }
    }

    static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) return null;
        String[][] p = new String[players][cards];
        int k = 0;
        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                p[i][j] = deck[k++];
        return p;
    }

    static void printPlayers(String[][] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println("Player " + (i + 1));
            for (String c : p[i]) System.out.println(c);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = initDeck();
        shuffle(deck);
        String[][] p = distribute(deck, players, cards);
        if (p != null) printPlayers(p);
        else System.out.println("Not possible");
    }
}

