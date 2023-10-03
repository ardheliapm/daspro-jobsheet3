import java.util.Scanner;

public class Segitiga05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.println("Masukan alas: ");
        alas = scanner.nextInt();
        System.out.println("Masukan tinggi: ");
        tinggi = scanner.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas Segitiga" + luas);
    }
}




 
    