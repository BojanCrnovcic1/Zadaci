package Lekcija3;

import java.util.Scanner;

public class Z6_PonovoSabiranje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int brojJedan = (int) (Math.random() * 10);
        int brojDva = (int) (Math.random() * 10);

        System.out.println("Koliko je "+brojJedan+" + "+brojDva+" ?");
        int rezultat = input.nextInt();

        if (rezultat == brojJedan + brojDva) {
            System.out.println("Cestitamo to je tacan odgovor!");
        }
        else
            System.out.println("Zao nam je to je netacan odgovor. Tacan rezultat je "+(brojJedan+brojDva));
    }
}
