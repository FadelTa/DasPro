import java.util.Scanner;

public class tugas2SeleksiAsisten11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean statusMahasiswa;
        boolean sedangDisanksi;
        double nilaiDaspro;
        boolean sertifikat;
        double nilaiWawancara;
        
        System.out.print("Apakah berstatus mahasiswa aktif? (true/false) ");
        statusMahasiswa = sc.nextBoolean();

        System.out.print("Apakah sedang memiliki sanksi? (true/false)" );
        sedangDisanksi = sc.nextBoolean();

        if (statusMahasiswa && !sedangDisanksi) {
            System.out.print("Masukkan nilai dasar pemrograman : ");
            nilaiDaspro = sc.nextDouble();
            System.out.print("Apakah memiliki sertifikat kompetisi pemrograman? (true/false)");
            sertifikat = sc.nextBoolean();

            if ((nilaiDaspro >= 80) || sertifikat) {
                System.out.print("Masukkan nilai wawancara : ");
                nilaiWawancara = sc.nextDouble();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Mahasiswa diterima menjadi asisten");
                } else {
                    System.out.println("Mohon maaf, nilai minimal belum tercukupi untuk menjadi asisten");
                }
            } else {
                System.out.println("Gagal! Nilai Dasar Pemrograman mahasiswa < 80 atau tidak memiliki sertifikat");
            }
        } else {
            System.out.println("Gagal! Status mahasiswa tidak aktif atau sedang memiliki sanksi");
        }

        sc.close();
    }
}
