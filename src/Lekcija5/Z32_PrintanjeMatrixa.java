package Lekcija5;

import java.util.Scanner;

public class Z32_PrintanjeMatrixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite velicinu matrixa: ");
        int velicinaMatrixa = input.nextInt();

        printMatrix(velicinaMatrixa);

    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int nesumicniBroj = (int) (Math.random() * 2);
                System.out.print(nesumicniBroj+" ");
            }
            System.out.println();
        }
    }
}
