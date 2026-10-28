import java.util.Scanner;

public class Tugas2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan nilai n = ");
            n = input.nextInt();
            if (n < 3) {
                System.out.println("Nilai n minimal 3!");
            }
        } while (n < 3);

        int total = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int hasil = 0;
                hasil = i*j;
                System.out.printf("%4d", hasil);
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + total);

        input.close();
    }
}