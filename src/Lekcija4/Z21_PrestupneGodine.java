package Lekcija4;

import java.util.Scanner;

public class Z21_PrestupneGodine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Unesite pocetnu godinu: ");
        int pocetnaGodina = input.nextInt();
        System.out.println("Unesite zadnju godinu: ");
        int zadnjaGodina = input.nextInt();

        for (int i = pocetnaGodina; i < zadnjaGodina; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i+" ");
                count++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
