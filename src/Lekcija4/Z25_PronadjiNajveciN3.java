package Lekcija4;

public class Z25_PronadjiNajveciN3 {
    public static void main(String[] args) {

        int n = 0;

        while (Math.pow(n + 1 ,3) < 12000) {
            n++;
        }
        System.out.println("Najvece n na q je "+n);
    }
}
