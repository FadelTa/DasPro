import java.util.Scanner;

/* Menghitung bunga majemuk
Algoritma:
1. Input tabungan awal
2. Input lama menabung
3. Input persentase bunga
4. Hitung tabungan akhir menggunakan rumus bunga majemuk
5. Hitung total bunga
6. Output total bunga dan tabungan akhir

Variabel dan tipe data:
- tabunganAwal: int
- lamaMenabung: int
- persentaseBunga: double
- tabunganAkhir: double
- totalBunga: double*/

public class Kasus2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tabungan awal, lama menabung, dan persentase bunga
        System.out.print("Masukkan jumlah tabungan awal: ");
        int tabunganAwal = input.nextInt();

        System.out.print("Masukkan lama menabung (tahun): ");
        int lamaMenabung = input.nextInt();

        System.out.print("Masukkan bunag dalam %: ");
        double persentaseBunga = input.nextDouble();
        persentaseBunga = persentaseBunga / 100;

        // Hitung tabungan akhir dan total bunga
        double tabunganAkhir = tabunganAwal * Math.pow(1 + persentaseBunga, lamaMenabung);
        double totalBunga = tabunganAkhir - tabunganAwal;

        System.out.println("------------------------------------");
        System.out.printf("Total Bunga Didapat : Rp%.0f\n", totalBunga);
        System.out.printf("Total Tabungan Akhir: Rp%.0f\n", tabunganAkhir);

        input.close();
    }
}