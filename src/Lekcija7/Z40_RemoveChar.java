package Lekcija7;

import java.util.Scanner;

public class Z40_RemoveChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string: ");
        String str = input.nextLine();
        System.out.println("Unesite karakter: ");
        String karakter = input.next();
        char kar = karakter.charAt(0);

        System.out.println("Izmijenjeni string: "+removeChar(str,kar));

    }

    public static String removeChar(String str, char ch){
        char[] noviNizKaraktera = str.toCharArray();
        int lustCaracter = noviNizKaraktera.length -1;
        noviNizKaraktera[lustCaracter] = ch;

        String noviString = "";
        for (int i = 0; i < noviNizKaraktera.length; i++) {
            noviString += noviNizKaraktera[i];
        }
        return noviString;
    }
}
