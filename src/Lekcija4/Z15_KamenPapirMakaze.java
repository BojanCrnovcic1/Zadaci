package Lekcija4;

import java.util.Scanner;

public class Z15_KamenPapirMakaze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Izaber: Kamen -> 0; Papir -> 1; Makaze -> 2");
        int user = input.nextInt();

        System.out.println("Igrate ");
        switch (user){
            case 0: {
                System.out.println("Kamen");}break;
            case 1: {
                System.out.println("Papir");}break;
            case 2: {
                System.out.println("Makaze");}break;
            default:
                System.out.println("Greska. Pogresan unos. ");
        }

        int computer = (int) (Math.random() * 3);

        System.out.println("Kompjuter igra ");
        switch (computer) {
            case 0: {
                System.out.println("Kamen");}break;
            case 1: {
                System.out.println("Papir");}break;
            case 2: {
                System.out.println("Makaze");}break;
        }

        if (user == computer ) {
            System.out.println("Igra je nerijesena. ");
        }
        else if (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
            System.out.println("Vi ste pobjedili! ");
        }
        else
            System.out.println("Kompjuter je pobjedio. ");

    }
}
