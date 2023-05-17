package Lekcija6;

public class Z36_MetodeSabiranje {
    public static void main(String[] args) {

        System.out.println("Rezultat je "+sabiranje(2,4));
        System.out.println("Rezultat je "+sabiranje(2.0,4.0));

    }


    public static double sabiranje(double broj1, double broj2) {
        return broj1 + broj2;
    }
    public static int sabiranje(int broj1, int broj2) {
        return broj1 + broj2;
    }
}
