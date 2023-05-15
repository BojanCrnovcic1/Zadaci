package Lekcija4;

public class Z23_BrojeviDijeljiviSa5Ili6AliNeOba {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Brojevi dijeljivi sa 5 ili 6 ali ne oba izmedju 100 i 200: ");
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.print(i+" ");
                count++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
