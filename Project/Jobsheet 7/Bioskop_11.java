import java.util.Scanner;

public class Bioskop_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualanHarian = 0;
        int jumlahTiket;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik -1 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == -1) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid (tidak boleh negatif). Silakan masukkan ulang!");
                continue;
            }

            double totalHarga = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double hargaSetelahDiskon = totalHarga - (totalHarga * diskon);
            totalTiketTerjual += jumlahTiket;
            totalPenjualanHarian += hargaSetelahDiskon;

            System.out.println("Subtotal sebelum diskon : Rp " + totalHarga);
            System.out.println("Diskon                  : " + (int)(diskon * 100) + "%");
            System.out.println("Total bayar transaksi   : Rp " + hargaSetelahDiskon);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n=== REKAP PENJUALAN TIKET HARI INI ===");
        System.out.println("Total tiket terjual  : " + totalTiketTerjual + " tiket");
        System.out.println("Total hasil penjualan: Rp " + totalPenjualanHarian);

        sc.close();
    }
}
