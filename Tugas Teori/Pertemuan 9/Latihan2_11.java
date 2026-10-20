import java.util.Scanner;

public class Latihan2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int gaji;
        int hari;
        double jamKerja = 0;
        int totalGajiBonus = 0;
        int totalGajiReguler = 0;
        int hariDenganBonus = 0;
        int totalBonus;
        int totalGaji;

        hari = 1;
        do {
            System.out.println("Silahkan memasukkan nilai - (minus) pada jam kerja jika ingin menghentikan program");
            System.out.print("Masukkan jam kerja pada hari ke-" + hari + ": ");
            jamKerja = sc.nextDouble();
            if (jamKerja < 0) {
                break;
            }
            System.out.print("Masukkan gaji pada hari ke-" + hari + ": ");
            gaji = sc.nextInt();

            if (jamKerja > 8) {
                hariDenganBonus ++;
                totalGajiBonus += gaji;
            } else {
                totalGajiReguler += gaji;
            }
            hari ++;

        } while (jamKerja > 0);

        totalBonus = (int) (totalGajiBonus * 0.20);
        totalGaji = totalBonus + totalGajiBonus + totalGajiReguler;

        System.out.println("Total gaji reguler adalah: " + totalGajiReguler);
        System.out.print("Total gaji dengan bonus adalah: " + totalGajiBonus);
        System.out.printf(" (%d hari).%n" , hariDenganBonus);
        System.out.println("Bonus yang didapatkan (Total gaji dengan bonus x 20%): " + totalBonus);
        System.out.println("=========================================");
        System.out.println("Total Gaji yang didapatkan: " + totalGaji);

        sc.close();
    }
}