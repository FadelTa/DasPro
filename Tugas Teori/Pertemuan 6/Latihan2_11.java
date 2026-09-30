import java.util.Scanner;

public class Latihan2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan hari");
        String hari = sc.nextLine().toLowerCase();
        System.out.println("Masukkan jenis buku");
        String jenis = sc.nextLine().toLowerCase();
        System.out.println("Masukkan harga per buku");
        double harga = sc.nextDouble();
        System.out.println("Masukkan jumlah buku");
        int jumlahBuku = sc.nextInt();

        int diskon = 0;

        if (hari.equals("rabu")) {
            if (jenis.equals("novel")) {
                if (jumlahBuku > 3) {
                    diskon = 9;
                } else {
                    diskon = 8;
                }
                } else {
                    diskon = 8;
                }
            } else if (jenis.equals("kamus")) {
                if (jumlahBuku > 2) {
                    diskon = 12;
                } else {
                    diskon = 10;
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 5;
                } else {
                    diskon = 0;
                }
            }

        double total = harga * jumlahBuku;
        double potongan = total * diskon / 100;
        double bayar = total - potongan;

        System.out.println("Diskon      : " + diskon + "%");
        System.out.printf("Potongan    : %.2f%n", potongan);
        System.out.printf("Total bayar : %.2f%n", bayar);

        sc.close();
    }
}