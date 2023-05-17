package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z52_PetCijelihBrojevaNjihovZbirIProizvod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int broj;
        int zbir = 0;
        int proizvod = 1;

        System.out.println("Unesite 5 brojeva: ");
        for (int i = 0; i < 5; i++) {
            broj = input.nextInt();

            zbir += broj;
            proizvod *= broj;

        }
        System.out.println("Zbir unesenih brojeva je : "+zbir+"" +
                "\n a proizvod unesenih brojeva je : "+proizvod);
    }
}
