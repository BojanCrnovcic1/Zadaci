package Lekcija5;

import java.util.Scanner;

public class Z28_DuzinaIPrviKarakterStringa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string: ");
        String str = input.nextLine();

        System.out.println("Duzina stringa je "+str.length());
        System.out.println("Njegov prvi karakter je "+str.charAt(0));
    }
}
