package Lekcija3;

import java.util.Scanner;

public class Z3_ParanNeparanBroj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = input.nextInt();

        if (broj % 2 == 0) {
            System.out.println("Broj "+broj+" je paran.");
        }
        else
            System.out.println("Broj "+broj+" je neparan.");
    }
}
