package pl.edu.ur.main;

import java.util.Scanner;

public class z4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner pytanie = new Scanner(System.in);
        int tab[] = new int[10];
        String x;
        int suma = 0, iloczyn = 1, min = 0, max = 0;
        float srednia;
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
                        suma += tab[i];
                    }
                    System.out.println("Suma = " + suma);
                    break;

                case 2:
                    for (int i = 9; i >= 0; i--) {
                        iloczyn *= tab[i];
                    }
                    System.out.println("Iloczyn = " + iloczyn);
                    break;

                case 3:
                    for (int i = 0; i < 10; i++) {
                        suma += tab[i];
                    }
                    srednia = suma / 10F;
                    System.out.println("Srednia = " + srednia);
                    break;

                case 4:
                    max = tab[0];
                    for (int i = 1; i < 10; i++) {
                        if (tab[i] > max) {
                            max = tab[i];
                        }
                    }
                    System.out.println("Max = " + max);
                    break;
                case 5:
                    min = tab[0];
                    for (int i = 1; i < 10; i++) {
                        if (tab[i] < min) {
                            min = tab[i];
                        }
                    }
                    System.out.println("Min = " + min);
                    break;
                default:
                    System.out.println("Prosze podac numer podpunktu z przedzialu od 1 do 5");
            }
            System.out.println("Czy chcesz sprawdzic kolejny podpunkt?");
            x = pytanie.nextLine();
        } while (x.equals("TAK") || x.equals("tak") || x.equals("Tak"));

    }

}
