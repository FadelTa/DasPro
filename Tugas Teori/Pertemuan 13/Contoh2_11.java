import java.util.Scanner;

public class Contoh2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahKota = 5;
        int jumlahHari = 7;
        
        double[][] suhu = new double[jumlahKota][jumlahHari];
        String[] namaKota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        
        System.out.println("=== INPUT DATA SUHU KOTA DI JEPANG ===");
        for (int i = 0; i < jumlahKota; i++) {
            System.out.println("\nMasukkan suhu untuk kota " + namaKota[i] + ":");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " (°C): ");
                suhu[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println("\n==================================================");
        System.out.println("        REKAPITULASI RATA-RATA SUHU KOTA          ");
        System.out.println("==================================================");
        
        for (int i = 0; i < jumlahKota; i++) {
            double totalSuhuKota = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalSuhuKota += suhu[i][j];
            }
            double rataRataKota = totalSuhuKota / jumlahHari;
            System.out.printf("Rata-rata suhu di %-10s = %.2f °C\n", namaKota[i], rataRataKota);
        }
        
        double suhuTertinggi = suhu[0][0];
        double suhuTerendah = suhu[0][0];
        String kotaTertinggi = namaKota[0];
        String kotaTerendah = namaKota[0];
        int hariTertinggi = 1;
        int hariTerendah = 1;
        
        for (int i = 0; i < jumlahKota; i++) {
            for (int j = 0; j < jumlahHari; j++) {
                if (suhu[i][j] > suhuTertinggi) {
                    suhuTertinggi = suhu[i][j];
                    kotaTertinggi = namaKota[i];
                    hariTertinggi = j + 1;
                }
                if (suhu[i][j] < suhuTerendah) {
                    suhuTerendah = suhu[i][j];
                    kotaTerendah = namaKota[i];
                    hariTerendah = j + 1;
                }
            }
        }
    
        System.out.println("\n==================================================");
        System.out.println("            ANALISIS EKSTREM SUHU                 ");
        System.out.println("==================================================");
        System.out.printf("🔥 Suhu Tertinggi : %.2f °C (di %s, Hari ke-%d)\n", suhuTertinggi, kotaTertinggi, hariTertinggi);
        System.out.printf("❄️ Suhu Terendah  : %.2f °C (di %s, Hari ke-%d)\n", suhuTerendah, kotaTerendah, hariTerendah);
        
        sc.close();
    }
}