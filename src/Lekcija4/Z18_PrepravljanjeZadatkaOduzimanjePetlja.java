package Lekcija4;

import java.util.Scanner;

public class Z18_PrepravljanjeZadatkaOduzimanjePetlja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int brojJedan = (int) (Math.random() * 10);
        int brojDva = (int) (Math.random() * 10);

        int broj1 = (brojJedan < brojDva)?brojDva:brojJedan;
        int broj2 = (brojDva > brojJedan)?brojJedan:brojDva;

        int rezultat;

        do {
            System.out.println("Koliko je "+broj1+" - "+broj2+" ? ");
            rezultat = input.nextInt();

            if (rezultat == broj1 - broj2){
                System.out.println("Cestitamo tacan odgovor!");
            }
            else
                System.out.println("Odgovor je pogresan. Pokusajte ponovo.");
        }while (rezultat != broj1 - broj2);


    }
}
