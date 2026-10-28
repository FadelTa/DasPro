import java.util.Scanner;

public class Latihan4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlProduk, jmlHari;

        do {
            System.out.print("Masukkan jumlah produk (minimal 1): ");
            jmlProduk = sc.nextInt();
        } while (jmlProduk < 1);

        do {
            System.out.print("Masukkan jumlah hari (minimal 1): ");
            jmlHari = sc.nextInt();
        } while (jmlHari < 1);

        int totalSeluruh = 0;
        int p = 1;

        while (p <= jmlProduk) {
            System.out.println("\nProduk " + p);
            int totalProduk = 0;

            for (int h = 1; h <= jmlHari; h++) {
                int terjual;
                do {
                    System.out.print("  Hari " + h + ": ");
                    terjual = sc.nextInt();
                    if (terjual < 0) {
                        System.out.println("    Jumlah tidak boleh negatif! Silakan ulangi.");
                    }
                } while (terjual < 0);

                totalProduk += terjual;
            }

            double rataRata = (double) totalProduk / jmlHari;
            System.out.println("Total produk " + p + " = " + totalProduk);
            System.out.println("Rata-rata produk " + p + " = " + rataRata);

            totalSeluruh += totalProduk;
            p++;
        }

        System.out.println("\nTotal seluruh produk = " + totalSeluruh);
        sc.close();
    }
}
