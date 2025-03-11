public class Menu {
    String nama;
    double harga;
    String kategori;

    public Menu(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String tampilInfoMenu(){
        return nama + " Rp. " + harga + "( "+ kategori +")";
    }

    public void setHarga(double newharga){
        this.harga = newharga;
    }
}
