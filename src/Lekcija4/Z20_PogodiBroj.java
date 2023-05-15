package Lekcija4;

import java.util.Scanner;

public class Z20_PogodiBroj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int broj = (int) (Math.random() * 10);
        int user;
        do {
            System.out.println("Unesite broj: ");
            user = input.nextInt();

            if (user > broj) {
                System.out.println("Broj je manji pokustajte ponovo. ");
            }
            else if (user < broj) {
                System.out.println("Broj je veci pokusajte ponovo. ");
            }
            else
                System.out.println("Cestitamo! Pogodili ste broj!");

        }while (user != broj);


    }
}
