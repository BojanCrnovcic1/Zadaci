package Lekcija7;

import java.util.Scanner;

public class Z43_DveOverloadMetode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nizINT[] = new int[10];
        double nizDOUBLE[] = new double[10];

        System.out.println("Unesite niz: ");
        for (int i = 0; i < nizDOUBLE.length; i++) {
            nizDOUBLE[i] = input.nextDouble();
            nizINT[i] = (int) nizDOUBLE[i];
        }

        System.out.println("Prsjek 10 double brojeva je : "+average(nizDOUBLE));
        System.out.println("Prosjek 10 integer brojeva je : "+average(nizINT));
    }

    public static int average(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / 10;
    }
    public static double average(double[] array) {
        double suma = 0.0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / 10;
    }
}
