import java.util.Scanner;

public class PemilihanIf11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah dibayar? (true/false)");
        boolean uktLunas = sc.nextBoolean();

        System.out.println(uktLunas ? "Pembayaran UKT terverifikasi" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // } else {
        //     System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        // }

        
    }
}