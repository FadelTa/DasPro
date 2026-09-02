import java.util.Scanner;

public class Bank11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan awal: ");
        int tabunganAwal = input.nextInt();

        System.out.print("Masukkan lama menabung (tahun): ");
        int lamaMenabung = input.nextInt();

        System.out.print("Masukkan bunag dalam %: ");
        double persentaseBunga = input.nextDouble();
        persentaseBunga = persentaseBunga / 100;

        double tabunganAkhir = tabunganAwal * Math.pow(1 + persentaseBunga, lamaMenabung);
        double totalBunga = tabunganAkhir - tabunganAwal;

        System.out.println("------------------------------------");
        System.out.printf("Total Bunga Didapat : Rp%.0f\n", totalBunga);
        System.out.printf("Total Tabungan Akhir: Rp%.0f\n", tabunganAkhir);

        input.close();
    }
}

