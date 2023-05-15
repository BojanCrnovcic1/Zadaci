package Lekcija3;

import java.util.Scanner;

public class Z1_Sabiranje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int broj1 = input.nextInt();
        System.out.println("Unesite drugi broj: ");
        int broj2 = input.nextInt();

        System.out.println("Rezultat dva broja je : "+(broj1+broj2));
    }
}
