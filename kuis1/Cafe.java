public class Cafe {
    public static void main(String[] args) {
        Menu[] daftarMenu = {
            new Menu("Coklat Panas", 15000, "Minuman"),   
            new Menu("Nasi Uduk", 20000, "Makanan")   
        };

        System.out.println("Menu yang ada: ");
        for (Menu menu : daftarMenu) {
            System.out.println(menu.tampilInfoMenu());
        }

        daftarMenu[0].setHarga(30000);

        System.out.println("\nSetelah perubahan harga:");
        for (Menu menu : daftarMenu) {
            System.out.println(menu.tampilInfoMenu());
        }

        Pelanggan pelanggan1 = new Pelanggan("Andi", "082334553192");
        
        pelanggan1.pesan(daftarMenu[0]);
        pelanggan1.pesan(daftarMenu[1]);
        
        pelanggan1.lihatPesanan();
    }
}
