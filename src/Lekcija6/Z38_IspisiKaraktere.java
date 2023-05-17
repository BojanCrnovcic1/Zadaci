package Lekcija6;

import java.util.Scanner;

public class Z38_IspisiKaraktere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesi prvi karakter: ");
        String prviKarakter = input.next();
        char prviKar = prviKarakter.charAt(0);
        System.out.println("Unesite zadnji karakter: ");
        String zadnjiKarakter = input.next();
        char zadnjiKar = zadnjiKarakter.charAt(0);
        System.out.println("Unesite broj po liniji: ");
        int brojPoLiniji = input.nextInt();

        ispisiKaraktere(prviKar,zadnjiKar,brojPoLiniji);

    }

    public static void ispisiKaraktere(char k1, char k2, int brojPoLiniji) {
        int count = 0;
        for (int i = k1; i <= k2; i++) {
            System.out.print((char) i+" ");
            count++;
            if (count == brojPoLiniji) {
                System.out.println();
                count = 0;
            }
        }

    }
}
