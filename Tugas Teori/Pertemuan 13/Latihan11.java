import java.util.Scanner;

public class Latihan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];
        
       System.out.println("=== INPUT HASIL SURVEY ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                while (true) {
                    System.out.print("  Masukkan jawaban pertanyaan ke-" + (j + 1) + " (1-5): ");
                    if (sc.hasNextInt()) {
                        int nilai = sc.nextInt();
                        if (nilai >= 1 && nilai <= 5) {
                            survei[i][j] = nilai;
                            break;
                        } else {
                            System.out.println("  [Error] Nilai harus antara 1 sampai 5!");
                        }
                    } else {
                        System.out.println("  [Error] Masukkan angka yang valid!");
                        sc.next(); 
                    }
                }
            }
        }

       System.out.println("\n=== RATA-RATA NILAI PER RESPONDEN ===");
        for (int i = 0; i < 10; i++) {
            double totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += survei[i][j];
            }
            double rataResponden = totalResponden / 6;
            System.out.printf("Rata-rata responden ke-%d = %.2f\n", (i + 1), rataResponden);
        }

       System.out.println("\n=== RATA-RATA NILAI PER PERTANYAAN ===");
        for (int j = 0; j < 6; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataPertanyaan = totalPertanyaan / 10;
            System.out.printf("Rata-rata untuk pertanyaan ke-%d = %.2f\n", (j + 1), rataPertanyaan);
        }

       System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        double totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        
        double rataTotal = totalKeseluruhan / 60;
        System.out.printf("Nilai rata-rata keseluruhan survey = %.2f\n", rataTotal);

        sc.close();
    }
}