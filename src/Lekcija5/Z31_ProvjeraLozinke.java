package Lekcija5;

import java.util.Scanner;

public class Z31_ProvjeraLozinke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Unesite lozinku: ");
        String  lozinka = input.next();

        isValid(lozinka);

        }






    public static boolean isValid(String lozinka) {
        final int DUZINALOZINKE = 8;
        final int BROJSLOVAIBROJEVA = 2;

        boolean valid = (duzinaLozinke(lozinka,DUZINALOZINKE) && sadrziSlovaBrojeve(lozinka) &&
                sadrziViseOdDvaSlovaBroja(lozinka,BROJSLOVAIBROJEVA));
        return valid;
    }


    public static boolean duzinaLozinke(String lozinka, int duzinaLozinke) {
        if (lozinka.length() < duzinaLozinke) {
            System.out.println("Lozinka nije validna. Ne sadrzi dovoljno karaktera-");
            return false;
        }
        return true;
    }

    public static boolean sadrziSlovaBrojeve(String lozinka) {
        for (int i = 0; i < lozinka.length(); i++) {
            if (!Character.isLetterOrDigit(lozinka.charAt(i))) {
                System.out.println("Lozinka nije validna. Sadrzi nedozvoljene simbole. ");
                return false;
            }
        }
        return true;
    }

    public static boolean sadrziViseOdDvaSlovaBroja(String lozinka, int brojBrojeva) {
        int slova = 0;
        int brojevi = 0;
        for (int i = 0; i < lozinka.length(); i++) {
            if (Character.isLetter(lozinka.charAt(i))) {
                slova++;
            }
            if (Character.isDigit(lozinka.charAt(i))) {
                brojevi++;
            }
            if (slova < brojBrojeva && brojevi < brojBrojeva) {
                System.out.println("Lozinka nije validna. Ne sadrzi dovoljan broj slova ili brojeva- ");
                return false;
            }
        }return true;
    }
}
