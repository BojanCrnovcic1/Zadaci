package Lekcija5;

import java.util.Scanner;

public class Z30_KarakteriStringa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite String: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.print(ch+" ");
        }
    }
}
