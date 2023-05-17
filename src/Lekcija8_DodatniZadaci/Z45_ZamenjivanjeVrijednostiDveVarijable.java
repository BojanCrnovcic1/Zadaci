package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z45_ZamenjivanjeVrijednostiDveVarijable {
    public static void main(String[] args) {

        int a = 24;
        int b = 71;
        System.out.println("Vrijednosti varijable a -> "+a+" b -> "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Zamijenja vrijednost varijable a -> "+a+" b -> "+b);
    }
}
