package Lekcija4;

import java.util.Scanner;

public class Z17_ZbirProsjekBrojevaUPetlji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int suma = 0;
        double prosjek = 0.0;
        System.out.println("Unosite brojeve dok ne unesete 0: ");
        int brojevi = input.nextInt();
        suma += brojevi;

        while (brojevi != 0){
            brojevi = input.nextInt();

            suma += brojevi;
            count++;
            prosjek = suma / count;

        }

        System.out.println("Zbir unesenih brojeva je : " + suma);
        System.out.println("Njihov prosjek je : " + prosjek);
    }
}
