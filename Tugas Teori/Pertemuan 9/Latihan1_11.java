import java.util.Scanner;

public class Latihan1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jam;
        int hari;
        int totalJam = 0;

        hari = 1;

        do {
            System.out.print("Masukkan jam belajar hari ke-" + hari + " (Jam): ");
            jam = sc.nextInt();
            if (jam > 10) {
                System.out.println("Jam belajar tidak dianggap tidak mungkin.");
                System.out.println("Silahkan masukkan kembali jam belajar hari ke " + hari);
                continue;
            }
            totalJam += jam;
            hari++;
            
        } while (hari <= 7);

        System.out.println("Total jam belajar selama 1 minggu adalah: " + totalJam);

        sc.close();
    }
}