import java.util.Scanner;

public class Tugas2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("==============================================");
        System.out.println("        DAFTAR MENU KAFE KAMPUS               ");
        System.out.println("==============================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-20s : Rp %d\n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("==============================================\n");

        System.out.print("Cari nama menu yang ingin dipesan: ");
        String cariMenu = input.nextLine();

        boolean ditemukan = false;
        int idxDitemukan = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                idxDitemukan = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(">> Menu '" + menu[idxDitemukan] + "' TERSEDIA dengan harga Rp " + harga[idxDitemukan]);
        } else {
            System.out.println(">> Menu '" + cariMenu + "' TIDAK TERSEDIA dalam daftar menu.");
        }

        System.out.println("\n----------------------------------------------");
        System.out.println("               FITUR PEMESANAN               ");
        System.out.println("----------------------------------------------");

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jmlPesanan = input.nextInt();
        input.nextLine();

        String[] pesananNama = new String[jmlPesanan];
        int[] pesananHarga = new int[jmlPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaInput = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaInput)) {
                        pesananNama[i] = menu[j];
                        pesananHarga[i] = harga[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("  [!] Menu tidak valid / tidak ada dalam daftar. Silakan masukkan ulang!");
                }
            }
        }

        System.out.println("\n==============================================");
        System.out.println("             REKAP DAFTAR PESANAN             ");
        System.out.println("==============================================");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.printf("%d. %-20s : Rp %d\n", (i + 1), pesananNama[i], pesananHarga[i]);
        }
        System.out.println("----------------------------------------------");
        System.out.println("TOTAL BIAYA PESANAN     : Rp " + totalBiaya);
        System.out.println("==============================================");

        input.close();
    }
}
