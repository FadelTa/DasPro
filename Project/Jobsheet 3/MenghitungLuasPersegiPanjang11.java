import java.util.Scanner;

public class MenghitungLuasPersegiPanjang11 {
    public static void main(String[] args) {
        int panjang;
        int lebar;
        int luas;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar persegi panjang: ");
        lebar = sc.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}