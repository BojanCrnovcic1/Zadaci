package Lekcija5;

import java.util.Scanner;

public class Z27_BrojeviDijeljiviSa13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = input.nextInt();

        for (int i = 1; i < broj; i++) {
            if (i % 13 == 0) {
                System.out.print(i+" ");
            }
        }

    }
}
