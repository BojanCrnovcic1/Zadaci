package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z58_BrojMjesecaNiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite mjesec i vidite koliko ima dana. Uzmimo da februar ima 28 dana. ");
        int broj = input.nextInt();

        int[] danMjesec = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Izabrani mjesec ima : "+danMjesec[broj -1]);

    }
}
