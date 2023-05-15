package Lekcija3;

import java.util.Scanner;

public class Z5_KonvertovanjeNovcaPrepravka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos u funtama: ");
        double funte = input.nextDouble();

        double marka = funte * 2.2;

        if (funte < 0) {
            System.out.println("Greska. Unos ne mogu biti negativni brojevi. ");
        }
        else
            System.out.println("Iznos "+funte+" funti je "+marka+" BAM.");
    }
}
