package Lekcija6;

import java.util.Scanner;

public class Z37_Naopako {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj:");
        int broj = input.nextInt();

        naopako(broj);
        System.out.println(naopakoVraca(broj));

    }

    public static void naopako(int broj) {
        String number = "";
        String numb = broj + "";
        for (int i = numb.length() - 1; i >= 0; i--) {
            number += numb.charAt(i);
        }
        System.out.print(Integer.parseInt(number)+" ");
    }
    public static int naopakoVraca(int broj) {
        String number = "";
        String numb = broj + "";
        for (int i = numb.length() -1; i >= 0; i--) {
            number += numb.charAt(i);
        }
        return Integer.parseInt(number);
    }
}
