public class Latihan2_11 {
    public static void main(String[] args) {
        char charCounter = 'a';
        
        for (int i = 1; i <= 5; i++) {
            int jumlahHuruf = 2 * i - 1;
            for (int j = 0; j < jumlahHuruf; j++) {
                System.out.print(charCounter);
                charCounter++;
            }
            System.out.println();
        }
    }
}
