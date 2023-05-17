package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z46_PrviVeciOdDrugog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int prviBroj = input.nextInt();
        System.out.println("Unesite drugi broj: ");
        int drugiBroj = input.nextInt();

        boolean jeVeci = prviBroj > drugiBroj;

        System.out.println("Prvi broj je veci od drugog: "+jeVeci);
    }
}
