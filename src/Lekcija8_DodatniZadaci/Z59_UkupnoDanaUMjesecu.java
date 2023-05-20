package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z59_UkupnoDanaUMjesecu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mjesec = {"Januar","Februar","Mart","April","Maj","Jun","Jul","Avgust","Septembar",
                "Oktobar","Novembar","Decembar"};

        int[] danMjesec = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Unesite broj dana u mjesecu: ");
        int dan = input.nextInt();
        for (int i = 0; i < danMjesec.length; i++) {
            if (danMjesec[i] == dan) {
                System.out.println(mjesec[i]+" ima "+dan+" dana.");
            }
        }


    }
}
