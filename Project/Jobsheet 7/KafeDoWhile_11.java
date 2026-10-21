import java.util.Scanner;

public class KafeDoWhile_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi;
        int teh;
        int roti;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;
        String namaPelanggan;

        do{
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.print("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp "+totalHarga);
            sc.nextLine();
            
        } while(true);

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}