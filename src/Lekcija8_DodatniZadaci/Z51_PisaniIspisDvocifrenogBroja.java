package Lekcija8_DodatniZadaci;

import java.util.Scanner;

public class Z51_PisaniIspisDvocifrenogBroja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite dvocifreni broj: ");
        int broj = input.nextInt();

        int desetice = broj / 10;
        int jedinice = broj % 10;

        if (desetice == 1) {
            switch (jedinice) {
                case 0:
                    System.out.print("Deset");break;
                case 1:
                    System.out.print("Jedanaest");break;
                case 2:
                    System.out.print("Dvanaest");break;
                case 3:
                    System.out.print("Trinaest");break;
                case 4:
                    System.out.print("Cetrnaest"); break;
                case 5:
                    System.out.print("Petnaest");break;
                case 6:
                    System.out.print("Sesnaest");break;
                case 7:
                    System.out.print("Sedamanest");break;
                case 8:
                    System.out.print("Osamnaest");break;
                case 9:
                    System.out.print("Devetnaest");break;
            }
        }else {
            switch (desetice) {
                case 2:
                    System.out.print("Dvadeset");break;
                case 3:
                    System.out.print("Trideset");break;
                case 4:
                    System.out.print("Cetrdeset");break;
                case 5:
                    System.out.print("Pedeset");break;
                case 6:
                    System.out.print("Sesdeset");break;
                case 7:
                    System.out.print("Sedamdeset");break;
                case 8:
                    System.out.print("Osamdeset");break;
                case 9:
                    System.out.print("Devedeset");break;
            }
        }
        switch (jedinice) {
            case 1:
                System.out.print(" jedan");break;
            case 2:
                System.out.print(" dva");break;
            case 3:
                System.out.print(" tri");break;
            case 4:
                System.out.print(" cetiri");break;
            case 5:
                System.out.print(" pet");break;
            case 6:
                System.out.print(" sest");break;
            case 7:
                System.out.print(" sedam");break;
            case 8:
                System.out.print(" osam");break;
            case 9:
                System.out.print(" devet");break;
        }
    }
}
