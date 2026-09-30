import java.util.Scanner;

public class Latihan1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("bil1 = ");
        int bil1 = sc.nextInt();
        System.out.print("bil2 = ");
        int bil2 = sc.nextInt();
        System.out.print("bil3 = ");
        int bil3 = sc.nextInt();

        int maks;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                maks = bil1;
            } else {
                maks = bil3;
            }
        } else {
            if (bil2 > bil3) {
                maks = bil2;
            } else {
                maks = bil3;
            }
        }

        System.out.println("bilangan terbesar : " + maks);
        sc.close();
    }
}