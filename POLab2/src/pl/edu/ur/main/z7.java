package pl.edu.ur.main;

import java.util.Scanner;

public class z7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ile elementow chcesz posegregowac?");
        int n = input.nextInt();
        int tab[] = new int[n];
        System.out.println("Podaj kolejne " + n + " wyrazy/ów tablicy");
        for (int i = 0; i < n; i++) {
            tab[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int x = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = x;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " wyraz to: " + tab[i]);
        }
    }
}
