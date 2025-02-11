public class fungsi {
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},  
            {7, 6, 11, 9},   
            {12, 2, 10, 10}, 
            {5, 5, 7, 12}    
        };
        
        // Harga masing-masing jenis bunga
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        
        tampilkanPendapatan(stokBunga, hargaBunga);
        
        tampilkanStok(stokBunga, 3, "Stok bunga di RoyalGarden 4:");
    }
    
    
    public static void tampilkanPendapatan(int[][] stokBunga, int[] hargaBunga) {
        System.out.println("Pendapatan jika semua bunga terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                totalPendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }
    
    public static void tampilkanStok(int[][] stokBunga, int cabang, String pesan) {
        System.out.println("\n" + pesan);
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int j = 0; j < stokBunga[cabang].length; j++) {
            System.out.println(namaBunga[j] + ": " + stokBunga[cabang][j]);
        }
    }
}
