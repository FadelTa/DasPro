import java.util.Scanner;

public class Latihan1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jam;
        int hari = 1;

        do {
            System.out.println("Masukkan jam belajar hari ke-" + hari + ": ");
            jam = sc.nextInt();
            if (jam > 10) {
                System.out.println("Jam belajar tidak dianggap tidak mungkin.");
                System.out.println("Silahkan masukkan kembali jam belajar hari ke " + hari);
                continue;
            }
            hari++;
            
        } while (hari >= 7);

        sc.close();
    }
}