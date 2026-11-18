import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int menu = 0;

            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                sc.nextLine();
                continue;
            }

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        if (sc.hasNextInt()) {
                            baris = sc.nextInt();
                            sc.nextLine();
                            if (baris < 1 || baris > penonton.length) {
                                System.out.println("Nomor baris tidak tersedia! (1-" + penonton.length + ")");
                                continue;
                            }
                        } else {
                            System.out.println("Input baris harus berupa angka!");
                            sc.nextLine();
                            continue;
                        }

                        System.out.print("Masukkan kolom (1-2): ");
                        if (sc.hasNextInt()) {
                            kolom = sc.nextInt();
                            sc.nextLine();
                            if (kolom < 1 || kolom > penonton[baris - 1].length) {
                                System.out.println("Nomor kolom tidak tersedia! (1-" + penonton[baris - 1].length + ")");
                                continue;
                            }
                        } else {
                            System.out.println("Input kolom harus berupa angka!");
                            sc.nextLine();
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi baris " + baris + " kolom " + kolom + " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "! Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton " + nama + " berhasil dicatat di baris " + baris + " kolom " + kolom + ".");
                            break;
                        }
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String pilihan = sc.nextLine();
                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\n--- DAFTAR PENONTON ---");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        String penontonTampil = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(penontonTampil + (j < penonton[i].length - 1 ? "\t" : ""));
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid!");
            }
        }
        sc.close();
    }
}
