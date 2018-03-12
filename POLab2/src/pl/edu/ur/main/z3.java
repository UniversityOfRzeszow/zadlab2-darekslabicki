package pl.edu.ur.main;

import java.util.Scanner;

public class z3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner pytanie = new Scanner(System.in);
        int tab[] = new int[10];
        String x;
        System.out.println("Podaj kolejne 10 wyrazów tablicy");
        for (int i = 0; i < 10; i++) {
            tab[i] = input.nextInt();
        }
        do {
            System.out.println("Ktory podpunkt zadania wyswietlic?");
            int n = input.nextInt();
            switch (n) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Wyraz " + (i + 1) + " = " + tab[i]);
                    }
                    break;

                case 2:
                    for (int i = 9; i >= 0; i--) {
                        System.out.println("Wyraz " + (i + 1) + " = " + tab[i]);
                    }
                    break;

                case 3:
                    for (int i = 0; i < 10; i++) {
                        if (i % 2 == 0) {
                            System.out.println("Wyraz " + (i + 1) + " = " + tab[i]);
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < 10; i++) {
                        if (i % 2 == 1) {
                            System.out.println("Wyraz " + (i + 1) + " = " + tab[i]);
                        }
                    }
                    break;
                default:
                    System.out.println("Prosze podac numer podpunktu z przedzialu od 1 do 4");
            }
            System.out.println("Czy chcesz sprawdzic kolejny podpunkt?");
            x = pytanie.nextLine();
        } while (x.equals("TAK") || x.equals("tak") || x.equals("Tak"));

    }

}
