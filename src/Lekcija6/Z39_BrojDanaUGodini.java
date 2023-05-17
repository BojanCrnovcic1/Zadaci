package Lekcija6;

import java.util.Scanner;

public class Z39_BrojDanaUGodini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite godinu: ");
        int godina = input.nextInt();

        System.out.println(godina+". ima "+brojDanaUGodini(godina)+" dana.");
    }

    public static int brojDanaUGodini(int godina) {
        int brojDana = 0;
        if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
            brojDana = 366;
        }
        else
            brojDana = 365;
        return brojDana;
    }

}
