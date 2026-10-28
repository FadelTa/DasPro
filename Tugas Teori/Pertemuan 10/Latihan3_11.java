import java.util.Scanner;

public class Latihan3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int total = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                total += kuadrat;
                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            if (i > 1) {
                System.out.print(" = " + total);
            }
            System.out.println();
        }
        scanner.close();
    }
}
