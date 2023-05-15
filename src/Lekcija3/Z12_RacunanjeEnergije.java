package Lekcija3;

import java.util.Scanner;

public class Z12_RacunanjeEnergije {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite velicinu vode po kilogramu: ");
        double M = input.nextDouble();
        System.out.println("Unesite pocetnu temperaturu: ");
        double initialTemperature = input.nextDouble();
        System.out.println("Unesite konacnu temperaturu: ");
        double finalTemeprature = input.nextDouble();

        double Q = M * (finalTemeprature - initialTemperature) * 8184;

        System.out.println("Potrebna energija je "+Q);
    }
}
