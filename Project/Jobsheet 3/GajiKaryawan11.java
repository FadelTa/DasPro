import java.util.Scanner;

public class GajiKaryawan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus,totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;
        
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();

        bonus = gajiPokok * 0.05;
        totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok);

        System.out.println("Bonus bulanan yang anda terima : " + bonus);
        System.out.println("Total gaji yang anda terima adalah : " + (int) totGaji);

        sc.close();
    }
}
