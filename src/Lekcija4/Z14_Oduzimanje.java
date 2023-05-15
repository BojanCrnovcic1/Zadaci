package Lekcija4;

import java.util.Scanner;

public class Z14_Oduzimanje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prviBroj = (int) (Math.random() * 10);
        int drugiBroj = (int) (Math.random() * 10);

        int broj1 = (prviBroj < drugiBroj)?drugiBroj : prviBroj;
        int broj2 = (drugiBroj > prviBroj)?prviBroj : drugiBroj;

        System.out.println("Koliko je "+broj1+" - "+broj2+" ?");
        int rezultat = input.nextInt();

        if (rezultat == broj1 - broj2) {
            System.out.println("Tacan odgovor! Cestitamo! ");
        }
        else
            System.out.println("Odgovor je netacan. Tacan odgovor je "+(broj1 - broj2));
    }
}
