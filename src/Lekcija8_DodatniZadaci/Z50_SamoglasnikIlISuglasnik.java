package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z50_SamoglasnikIlISuglasnik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite slovo: ");
        String slovoString = input.next();
        char slovo = slovoString.charAt(0);

       switch (slovo) {
           case 'a' :
           case 'e' :
           case 'i' :
           case 'o' :
           case 'u' : {
               System.out.println("Samoglasnik.");
           }
           break;
           default:
               System.out.println("Suglasnik. ");
       }
    }
}
