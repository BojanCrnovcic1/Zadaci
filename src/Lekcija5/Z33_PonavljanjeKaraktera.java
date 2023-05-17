package Lekcija5;

import java.util.Scanner;

public class Z33_PonavljanjeKaraktera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string: ");
        String str = input.nextLine();
        System.out.println("Unesite karakter: ");
        String karakter = input.next();
        char kar = karakter.charAt(0);

        System.out.println("Ponavljanje unesenog karaktera u stringu je "+count(str,kar));
    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
}
