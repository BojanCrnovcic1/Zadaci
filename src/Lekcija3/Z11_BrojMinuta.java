package Lekcija3;

import java.util.Scanner;

public class Z11_BrojMinuta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int minutaSat = 60;
        final int satDan = 24;
        final int danGodina = 365;

        System.out.println("Unesite minute: ");
        int minut = input.nextInt();

        int godina = minut / minutaSat / satDan / danGodina;
        int dan = minut / minutaSat / satDan % danGodina;

        System.out.println(minut+" minuta ima priblizno "+godina+" godina i "+dan+" dana. ");
    }
}
