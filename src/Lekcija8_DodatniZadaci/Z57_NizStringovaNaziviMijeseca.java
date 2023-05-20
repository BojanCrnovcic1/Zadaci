package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z57_NizStringovaNaziviMijeseca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj za mjesec (1 - 12) : ");
        int broj = input.nextInt();

        String[] mjesec = {"Januar","Februar","Mart","April","Maj","Jun","Jul","Avgust","Septembar",
        "Oktobar","Novembar","Decembar"};

        System.out.println(mjesec[broj - 1]);
    }
}
