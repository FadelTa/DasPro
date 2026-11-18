public class Contoh1_11 {
    public static void main(String[] args) {
        
        int[][] penjualan = {
            {2, 8, 6, 0},   
            {7, 3, 6, 0},   
            {4, 6, 5, 0},   
            {0, 0, 0, 0}    
        };

        String[] namaCabang = {"Dieng (0)", "Soehat (1)", "Sengkaling (2)", "Total"};

      for (int i = 0; i < 3; i++) {
            int totalCabang = 0;
            for (int j = 0; j < 3; j++) {
                totalCabang += penjualan[i][j];
            }
            penjualan[i][3] = totalCabang; 
        }

        for (int j = 0; j < 3; j++) {
            int totalKategori = 0;
            for (int i = 0; i < 3; i++) {
                totalKategori += penjualan[i][j];
            }
            penjualan[3][j] = totalKategori;
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < 3; i++) {
            totalKeseluruhan += penjualan[i][3];
        }
        penjualan[3][3] = totalKeseluruhan;

        System.out.println("=== TABEL LAPORAN PENJUALAN BUKU TOGAMAS (4x4) ===");
        System.out.printf("%-18s %-12s %-10s %-15s %-8s\n", "Cabang / Kategori", "Novel (0)", "Komik (1)", "Ensiklopedia (2)", "Total");
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-18s", namaCabang[i]);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-14d", penjualan[i][j]);
            }
            System.out.println();
        }
    }
}