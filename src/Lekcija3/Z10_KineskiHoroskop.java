package Lekcija3;

import java.util.Scanner;

public class Z10_KineskiHoroskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite godinu:");
        int godina = input.nextInt();

        int kineskiHoroskop = godina % 12;

        switch (kineskiHoroskop) {
            case 0 : {
                System.out.println("Majmun");
            }break;
            case 1 : {
                System.out.println("Pjetao");
            }break;
            case 2 : {
                System.out.println("Pas");
            }break;
            case 3 : {
                System.out.println("Svinja");
            }break;
            case 4 : {
                System.out.println("Pacov");
            }break;
            case 5 : {
                System.out.println("Vo");
            }break;
            case 6 : {
                System.out.println("Tigar");
            }break;
            case 7 : {
                System.out.println("Zec");
            }break;
            case 8 : {
                System.out.println("Zmaj");
            }break;
            case 9 : {
                System.out.println("Zmija");
            }break;
            case 10 : {
                System.out.println("Konj");
            }break;
            case 11 : {
                System.out.println("Ovca");
            }break;
        }
    }
}
