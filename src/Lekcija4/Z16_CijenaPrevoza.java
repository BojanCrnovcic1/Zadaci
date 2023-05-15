package Lekcija4;

import java.util.Scanner;

public class Z16_CijenaPrevoza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu paketa: ");
        double tezina = input.nextDouble();

        double cijena = 0.0;
       if (tezina > 50) {
           System.out.println("Paket se ne moze poslati");
       }
       else {
        if (tezina > 0 && tezina <= 1) {
            cijena = 3.5;
        }
        else if (tezina <= 3) {
            cijena = 5.5;
        }
        else if (tezina <= 10) {
            cijena = 8.5;
        }
        else
            cijena = 10.5;
       }
        System.out.println("Cijena paketa je "+(cijena * tezina)+"$");

    }
}
