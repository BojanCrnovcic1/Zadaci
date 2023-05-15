package Lekcija3;

import java.util.Scanner;

public class Z4_Ocijena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj bodova (0 - 100 ) :");
        int bodovi = input.nextInt();

        if (bodovi >= 90) {
            System.out.println("Ocijena je 10.");
        }
        else if (bodovi >= 80 && bodovi <= 89) {
            System.out.println("Ocijena je 9.");
        }
        else if (bodovi >= 70 && bodovi <= 79) {
            System.out.println("Ocijena je 8.");
        }
        else if (bodovi >= 60 && bodovi <= 69) {
            System.out.println("Ocijena je 7.");
        }
        else if (bodovi >= 50 && bodovi <= 59) {
            System.out.println("Ocijena je 6.");
        }
        else
            System.out.println("Korisnik nije polozio ispit. ");
    }
}
