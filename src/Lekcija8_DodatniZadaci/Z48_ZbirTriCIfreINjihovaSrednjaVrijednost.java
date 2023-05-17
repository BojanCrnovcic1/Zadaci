package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z48_ZbirTriCIfreINjihovaSrednjaVrijednost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvu cifru: ");
        int prvaCifra = input.nextInt();
        System.out.println("Unesite drugu cifru: ");
        int drugaCifra = input.nextInt();
        System.out.println("Unesite trecu cifru: ");
        int trecaCifra = input.nextInt();

        int zbir = prvaCifra + drugaCifra + trecaCifra;

        int srednjaVrijednost = zbir / 3;

        System.out.println("Zbir tri cifre je : "+zbir+" a njegova sredna vrijednost je "+srednjaVrijednost);
    }
}
