import java.util.Scanner;

/* Menghitung luas tanah yang tidak digunakan 
Algoritma :
1. Input panjang tanah
2. Input lebar tanah
3. Input diameter kolam ikan
4. Input sisi taman bunga
5. Hitung luas tanah = panjang * lebar
6. Hitung jari-jari kolam = diameter / 2
7. Hitung luas kolam = π * jari-jari²
8. Hitung luas taman = sisi²
9. Hitung luas sisa = luas tanah - luas kolam - luas taman
10. Output luas sisa

Variabel dan tipe data:
- panjangTanah: double
- lebarTanah: double
- diameterKolam: double
- sisiTaman: double
- luasTanah: double
- jariJari: double
- luasKolam: double
- luasTaman: double
- luasSisa: double*/

public class Tugas2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjangTanah,lebarTanah,diameterKolam,sisiTaman,luasTanah,jariJari,luasKolam,luasTaman,luasSisa;

        // Input
        System.out.print("Masukkan panjang tanah (m): ");
        panjangTanah = input.nextDouble();

        System.out.print("Masukkan lebar tanah (m): ");
        lebarTanah = input.nextDouble();

        System.out.print("Masukkan diameter kolam ikan (m): ");
        diameterKolam = input.nextDouble();

        System.out.print("Masukkan sisi taman bunga (m): ");
        sisiTaman = input.nextDouble();

        // Proses
        luasTanah = panjangTanah * lebarTanah;
        jariJari = diameterKolam / 2;
        luasKolam = Math.PI * jariJari * jariJari;
        luasTaman = sisiTaman * sisiTaman;
        luasSisa = luasTanah - luasKolam - luasTaman;

        // Output
        System.out.println("Luas tanah keseluruhan : " + luasTanah + " m2");
        System.out.println("Luas kolam ikan         : " + luasKolam + " m2");
        System.out.println("Luas taman bunga        : " + luasTaman + " m2");
        System.out.println("Luas tanah tidak digunakan: " + luasSisa + " m2");

        input.close();
    }
}