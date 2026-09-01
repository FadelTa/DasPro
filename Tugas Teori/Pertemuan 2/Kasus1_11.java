import java.util.Scanner;

/* Menghitung keliling persegi panjang
Algoritma:
1. Input panjang
2. Input lebar
3. Hitung keliling = 2 * (panjang + lebar)
4. Output keliling

Variabel dan tipe data:
- panjang: int
- lebar: int
- keliling: int*/

public class Kasus1_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        // Tambahkan petunjuk input
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling: " + keliling);

        input.close();
    }
}