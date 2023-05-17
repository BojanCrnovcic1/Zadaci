package Lekcija6;

import java.util.Scanner;

public class Z34_BrojMalihVelikihSlovaUStringu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int velikaSlova = 0;
        int malaSlova = 0;

        System.out.println("Unesite string: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                velikaSlova++;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                malaSlova++;
            }
        }
        System.out.println("Broj velikih slova u stringu je "+velikaSlova);
        System.out.println("Broj malih slova u stringu je "+malaSlova);
    }
}
