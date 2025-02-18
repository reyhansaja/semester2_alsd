public class MataKuliah23 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah23(){
    }
    public MataKuliah23(String kodeMk, String nama, int sks, int jumlahJam){
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi(){
        System.out.println("kode mata kuliah: "+kodeMk);
        System.out.println("nama: "+nama);
        System.out.println("sks: "+sks);
        System.out.println("jumlah jam: "+jumlahJam);
    }
    void ubahSks(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam(int tambahJam){
        jumlahJam = jumlahJam + tambahJam;
    }
    void kurangJam(int kurangJam){
        if(jumlahJam>kurangJam){
            jumlahJam= jumlahJam-kurangJam;
        }
        else{
            System.out.println("jam tidak bisa di kurangi");
        }
    }
    
}

