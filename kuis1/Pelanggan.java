public class Pelanggan {
    String nama;
    Pesanan pesanan;
    String kontak;

    public Pelanggan(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
        this.pesanan = new Pesanan();
    }

    public void pesan(Menu menu) {
        pesanan.tambahPesanan(menu);
    }

    public void lihatPesanan() {
        System.out.println("\nPelanggan: " + nama + " (" + kontak + ")");
        pesanan.tampilkanPesanan();
    }
}
