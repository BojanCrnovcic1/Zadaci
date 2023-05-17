package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z55_BrojUnazad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = input.nextInt();

        System.out.println("Ispisan uneseni broj unazad: "+ispisUnazad(broj));


    }
    public static int ispisUnazad(int broj) {
        String numb = broj + "";
        String number = "";
        for (int i = numb.length() -1; i >= 0; i--) {
            number += numb.charAt(i);
        }
        return Integer.parseInt(number);
    }
}
