package com.codersbay;

import java.util.*;

public class Main {

    static public void guess(String word, int life) {

        char[] filler = new char[word.length()];
        int i = 0;
        while (i < word.length()) {
            filler[i] = '_';
            if (word.charAt(i) == ' ') {
                filler[i] = ' ';
            }
            i++;
        }
        System.out.print(filler);
        System.out.println("\t Life reaming= " + life);

        Scanner s = new Scanner(System.in);

        ArrayList<Character> l = new ArrayList<>();

        while (life > 0) {
            char x = s.next().charAt(0);

            if (l.contains(x)) {
                System.out.println("Already entered");
                continue;
            }
            l.add(x);

            if (word.contains(x + "")) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == x) {
                        filler[j] = x;
                    }
                }
            } else {
                life--;

                switch (life){
                    case 5 -> System.out.println("__________");
                    case 4 -> {
                        System.out.println("    |");
                        System.out.println("    |");
                        System.out.println("    |");
                        System.out.println("    |");
                        System.out.println("    |");
                        System.out.println("____|____");
                    }
                    case 3 -> {
                        System.out.println("    _________________");
                        System.out.println("    |/              |");
                        System.out.println("    |               |");
                        System.out.println("    |");
                        System.out.println("    |");
                        System.out.println("    |");
                        System.out.println("____|____");
                    }
                    case 2 -> {
                        System.out.println("    _________________");
                        System.out.println("    |/              |");
                        System.out.println("    |               |");
                        System.out.println("    |              ( )");
                        System.out.println("    |");
                        System.out.println("    |");
                        System.out.println("____|____");
                    }
                    case 1 -> {
                        System.out.println("    _________________");
                        System.out.println("    |/              |");
                        System.out.println("    |               |");
                        System.out.println("    |              ( )");
                        System.out.println("    |              \\|/");
                        System.out.println("    |");
                        System.out.println("____|____");
                    }
                    case 0 -> {
                        System.out.println("    _________________");
                        System.out.println("    |/              |");
                        System.out.println("    |               |");
                        System.out.println("    |              ( )");
                        System.out.println("    |              \\|/");
                        System.out.println("    |              / \\");
                        System.out.println("____|____");
                    }
                }
            }

            if (word.equals(String.valueOf(filler))) {
                System.out.println(filler);
                System.out.println("You won");
                break;
            }

            System.out.print(filler);
            System.out.println("\t Life reaming= " + life);
        }

        if (life == 0) {
            System.out.println("You lost");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welches Wort soll gesucht werden ?");
        String word = sc.next();

        String breaker = "\n";
        System.out.println(breaker.repeat(20));

        int life = 6;
        guess(word, life);
    }

}
