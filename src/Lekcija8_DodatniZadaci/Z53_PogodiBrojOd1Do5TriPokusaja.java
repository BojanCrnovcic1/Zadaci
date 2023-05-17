package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z53_PogodiBrojOd1Do5TriPokusaja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int user = 0;
        int broj = (int) (Math.random() * 5) +1;


        for (user = 0; user < 3; user++) {
            System.out.println("Unesite broj:" );
            user = input.nextInt();

            if (user > broj) {
                System.out.println("Broj je manji. Pokusajte ponovo.");
            }
            else if (user < broj) {
                System.out.println("Broj je veci. Pokusajte ponovo. ");
            }
            else
                System.out.println("Cestitamo! Pogodili ste broj "+broj);
        }
    }
}
