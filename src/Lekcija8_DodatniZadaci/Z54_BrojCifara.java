package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z54_BrojCifara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int brojacCifara = 0;

        System.out.println("Unesite broj: ");
        int broj = input.nextInt();
        while (broj > 0){
            broj /= 10;
            brojacCifara++;
        }
        System.out.println("Broj  ima "+brojacCifara+" cifara.");



    }
}
