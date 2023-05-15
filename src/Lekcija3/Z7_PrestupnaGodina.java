package Lekcija3;

import java.util.Scanner;

public class Z7_PrestupnaGodina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite godinu: ");
        int godina = input.nextInt();

        if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
            System.out.println(godina+". godina je prestupna. ");
        }
        else
            System.out.println(godina+". godina nije prestupna. ");
    }
}
