import java.util.Scanner;

public class TugasMandiri11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        System.out.println("=== INPUT DATA SURVEI KEPUASAN (NILAI 1 - 5) ===");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("\nResponden ke-" + (i + 1) + ":");
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int nilai;
                do {
                    System.out.print("  Pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("  Input tidak valid! Nilai harus antara 1 sampai 5.");
                    }
                } while (nilai < 1 || nilai > 5);
                survei[i][j] = nilai;
            }
        }

        System.out.println("\n========================================");
        System.out.println("1. RATA-RATA NILAI PER RESPONDEN");
        System.out.println("========================================");
        double totalKeseluruhan = 0;
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double totalResponden = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalResponden += survei[i][j];
            }
            double rataResponden = totalResponden / JUMLAH_PERTANYAAN;
            System.out.printf("Responden ke-%-2d : %.2f\n", (i + 1), rataResponden);
            totalKeseluruhan += totalResponden;
        }

        System.out.println("\n========================================");
        System.out.println("2. RATA-RATA NILAI PER PERTANYAAN");
        System.out.println("========================================");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataPertanyaan = totalPertanyaan / JUMLAH_RESPONDEN;
            System.out.printf("Pertanyaan ke-%d : %.2f\n", (j + 1), rataPertanyaan);
        }

        System.out.println("\n========================================");
        System.out.println("3. RATA-RATA NILAI KESELURUHAN");
        System.out.println("========================================");
        double rataKeseluruhan = totalKeseluruhan / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);
        System.out.printf("Rata-rata Keseluruhan: %.2f\n", rataKeseluruhan);

        sc.close();
    }
}
