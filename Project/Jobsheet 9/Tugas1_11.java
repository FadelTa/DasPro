import java.util.Scanner;

public class Tugas1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        double rataRata = (double) total / n;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < n; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("\n========================================");
        System.out.println("=== REKAP NILAI MAHASISWA ===");
        System.out.println("========================================");
        for (int i = 0; i < n; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }

        System.out.println("----------------------------------------");
        System.out.println("Total nilai        : " + total);
        System.out.printf("Rata-rata nilai    : %.2f\n", rataRata);
        System.out.println("Nilai tertinggi    : " + tertinggi);
        System.out.println("Nilai terendah     : " + terendah);
        System.out.println("========================================");

        sc.close();
    }
}
