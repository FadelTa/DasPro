import java.util.Scanner;

public class MenghitungTotalBayar11 {
    public static void main(String[] args) {
        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan harga barang: ");
        harga = sc.nextDouble();
        potongan = harga * diskon;
        jml_bayar = harga - potongan;
        System.out.println("Total bayar adalah: " + jml_bayar);
    }
}