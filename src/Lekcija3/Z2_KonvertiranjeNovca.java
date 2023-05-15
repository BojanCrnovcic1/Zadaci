package Lekcija3;

import java.util.Scanner;

public class Z2_KonvertiranjeNovca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos u funtama: ");
        double funte = input.nextDouble();

        double marka = funte * 2.2;

        System.out.println("Iznos "+funte+" funti je "+marka+" BAM.");
    }
}
