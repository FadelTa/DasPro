import java.util.Scanner;

/* Menghitung gaji bersih karyawan
Algoritma:
1. Input gaji pokok
2. Input jumlah anak
3. Hitung total tunjangan = jumlah anak * tunjangan per anak
4. Hitung potongan pensiun = persen pensiun * gaji pokok
5. Hitung gaji bersih = gaji pokok + total tunjangan - potongan pensiun
6. Output total tunjangan, potongan pensiun, dan gaji bersih

Variabel dan tipe data:
- gajiPokok: double
- jumlahAnak: int
- tunjanganPerAnak: double
- persenPensiun: double
- totalTunjangan: double
- potonganPensiun: double
- gajiBersih: double*/

public class Tugas1_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiPokok,totalTunjangan,potonganPensiun,gajiBersih;
        int jumlahAnak;
        double tunjanganPerAnak = 100000;   // Rp100.000 per anak
        double persenPensiun = 0.10;        // potongan dana pensiun 10%

        // Input
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        // Proses
        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = persenPensiun * gajiPokok;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        // Output
        System.out.println("Total tunjangan anak : Rp" + totalTunjangan);
        System.out.println("Potongan pensiun     : Rp" + potonganPensiun);
        System.out.println("Gaji bersih : Rp" + gajiBersih);

        input.close();
    }
}