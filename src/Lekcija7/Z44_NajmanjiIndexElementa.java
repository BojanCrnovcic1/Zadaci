package Lekcija7;

import java.util.Scanner;

public class Z44_NajmanjiIndexElementa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int niz[] = new int[10];
        System.out.println("Unesite niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }
        System.out.println("Najmanji element niza je na indexu: "+indexOfSmallestElement(niz));
    }
    public static int indexOfSmallestElement(int[] array){
        int index = 0;
        int min = array[index];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
