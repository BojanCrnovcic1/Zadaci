package Lekcija4;

public class Z19_BacanjeNovcica {
    public static void main(String[] args) {

        int pismo = 0;
        int glava = 0;

        System.out.println("Bacanje novcica 1000000 puta.");

        for (int i = 0; i < 1000000; i++) {

            int novcic = (int) (Math.random() *2);
            if (novcic == 0) {
                pismo++;
            }
            else glava++;
        }
        System.out.println("Novcic je pao "+pismo+" na pismo. ");
        System.out.println("Novcic je pao "+glava+" na glavu. ");
    }
}
