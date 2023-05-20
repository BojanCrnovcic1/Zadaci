package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z56_NajvecaVrijednostNizaIndexIBrojElemenataManjiOdSredneVrijednosti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj elemenetara u nizu: ");
        int n = input.nextInt();

        int niz[] = new int[n];
        System.out.println("Ispunite niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }

        System.out.println("Najveci elemenat u nizu je: "+max(niz));
        System.out.println("Njegov index je : "+index(niz));
        System.out.print("Elementi manji od srednje vrijednosti su: "+manjiOdProsjeka(niz));

    }


    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int index(int[] array) {
        int index = 0;
        int max = array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int prosjek(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / array.length;
    }
    public static int manjiOdProsjeka(int[] array) {
        int count = 0;
        double prosjek = prosjek(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < prosjek){
                count++;
            }
        }
        return count;
    }
}
