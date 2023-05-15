package Lekcija3;

import java.util.Scanner;

public class Z8_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite tezinu: ");
        double tezina = input.nextDouble();
        System.out.println("Unesite visinu: ");
        double visina = input.nextDouble();

        double bmi = tezina / (visina + visina);

        if (bmi < 18.5) {
            System.out.println("Pothranjenost. ");
        }
        else if (bmi < 25.0 && bmi >= 18.5) {
            System.out.println("Normalni BMI.");
        }
        else if (bmi < 30.0 && bmi >= 25.0) {
            System.out.println("Gojaznost. ");
        }
        else if (bmi >= 30.0) {
            System.out.println("Pretilost. ");
        }
    }
}
