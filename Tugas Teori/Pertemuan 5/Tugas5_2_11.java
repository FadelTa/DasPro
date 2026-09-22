import java.util.Scanner;

public class Tugas5_2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int antrean;
        System.out.print("Masukkan kode layanan : ");
        antrean = sc.nextInt();

        switch (antrean) {
            case 1:
                System.out.println("Layanan : Legalisir Ijazah");
                System.out.println("Loket : A");
                break;
            case 2:
                System.out.println("Layanan : Surat keterangan akif kuliah");
                System.out.println("Loket : B");
                break;
            case 3:
                System.out.println("Layanan : Pembayaran UKT");
                System.out.println("Loket : C");
                break;
            case 4:
                System.out.println("Layanan : Pengajuan cuti akademik");
                System.out.println("Loket : D");
                break;
            default:
                System.out.println("Kode antrean tidak valid");

        sc.close();
        }
    }
}