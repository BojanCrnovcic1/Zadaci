package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z47_TrocifrenBrojIZbirNjegovihCifara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite trocifren broj: ");
        int broj = input.nextInt();

        int zadnjaCifra = broj % 10;
        int prednjeDve = broj / 10;
        int prvaCifra = prednjeDve / 10;
        int srednjaCifra = prednjeDve % 10;

        int zbir = prvaCifra + srednjaCifra + zadnjaCifra;

        System.out.println("Zbir cifara broja "+broj+" je "+zbir);
    }
}
