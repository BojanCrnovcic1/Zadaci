package Lekcija7;

import java.util.Scanner;

public class Z41_RandomNiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite velicinu niza: ");
        int velicinaNiza = input.nextInt();

        int niz[] = new int[velicinaNiza];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = (int) (Math.random() * 10);

            System.out.print(niz[i]+" ");
        }
    }
}
