import java.util.Scanner;

public class SiakadFor_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai;
        double tertinggi = 0;
        double terendah = 100;

        for (int i = 1; i <= 10; i++){
            System.out.printf("Masukkan nilai mahasiswa ke %d: ",i);
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } if (nilai < terendah){
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi adalah: "+tertinggi);
        System.out.println("Nilai terendah adalah: "+terendah);
        
        sc.close();
    }
}