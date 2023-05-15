package Lekcija4;

import java.util.Scanner;

public class Z26_PonavljanjeNajvecegBroja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int count = 1;
        int numbers;

        System.out.println("Unesite brojeve dok ne unesete 0:");

       do {
           numbers = input.nextInt();
           if (numbers > max) {
               max = numbers;
               count = 0;
           }
           if (numbers == max){
               count++;
           }

       }while (numbers != 0);
        System.out.println("Najveci broj je : "+max);
        System.out.println("Ponavljanje najveceg broja je : "+count);


    }
}
