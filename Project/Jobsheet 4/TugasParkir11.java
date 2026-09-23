import java.util.Scanner;

public class TugasParkir11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lamaParkir;
        System.out.print("Masukkan durasi parkir (jam): ");
        lamaParkir = sc.nextInt();
        int biayaParkir;

        if (lamaParkir <= 2) {
            biayaParkir = 2000;
        } else {
            biayaParkir = 2000 + (lamaParkir - 2) * 1000;
        }
        System.out.println("Biaya parkir: " + biayaParkir);

        sc.close();
    }
}
