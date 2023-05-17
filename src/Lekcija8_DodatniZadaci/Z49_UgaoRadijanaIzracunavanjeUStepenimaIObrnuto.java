package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z49_UgaoRadijanaIzracunavanjeUStepenimaIObrnuto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ugao radijana: ");
        double ugaoRadijana = input.nextDouble();

        double stepenRadijana = ugaoRadijana * 180 / Math.PI;

        System.out.println("Stepen radijana je "+stepenRadijana);
    }
}
