package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z60_PonavljanjeElemenataNiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj n ");
        int n = scanner.nextInt();
        int[] niz = new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("Unesite " + (i+1) + ". vrednost ");
            niz[i] = scanner.nextInt();
        }
        for (int i=0; i<niz.length; i++) {
            boolean ponavljaSe = false;
            for (int j=i+1; j<niz.length; j++)
                if (niz[i] == niz[j])
                    ponavljaSe = true;
            if (ponavljaSe)
                System.out.print(niz[i]);
        }
    }
}
