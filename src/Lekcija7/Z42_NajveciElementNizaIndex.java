package Lekcija7;

import java.util.Scanner;

public class Z42_NajveciElementNizaIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite velicinu niza: ");
        int velicnaNiza = input.nextInt();

        int niz[] = new int[velicnaNiza];

        System.out.println("Ispunite niz elementima: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }

        System.out.println("Najveci elemenat u nizu je : "+max(niz));
        System.out.println("Index najveceg elementa u nizu je : "+index(niz));
    }

    public static int max(int []array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int index(int []array) {
        int index = 0;
        int max =array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}
