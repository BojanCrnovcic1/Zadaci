package Lekcija5;

import java.util.Scanner;

public class Z29_OcijeneKaoSlovo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ocijenu kao slovo: ");
        String ocjena = input.next();
        char ocj = ocjena.charAt(0);

        switch (ocj) {
            case 'A' : {
                System.out.println("Ocjena je 5.");
            }break;
            case 'B' : {
                System.out.println("Ocjena je 4.");
            }break;
            case 'C' : {
                System.out.println("Ocjena je 3.");
            }break;
            case 'D' : {
                System.out.println("Ocjena je 2.");
            }break;
            case 'F' : {
                System.out.println("Ocjena je 1.");
            }break;
            default:
                System.out.println("Pogresan unos.");
        }
    }
}
