import java.util.Scanner;

public class nestedUjianSkripsi11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.println("Apakah Mahasiswa sudah bebas kompen? (ya/tidak)");
        int bebasKompen = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 1:");
        int bimbingan1P1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 2:");
        int bimbingan1P2 = sc.nextInt();
        
        if (bebasKompen == 1) {
            if (bimbingan1P1 >= 8 && bimbingan1P2 >= 4) {
                pesan = "Mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbingan1P1 < 8 && bimbingan1P2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbingan1P1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);

        sc.close();
    }
}
