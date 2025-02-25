public class Dosen23 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen23(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo() {
        System.out.println("Kode Dosen  : " + kode);
        System.out.println("Nama Dosen  : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia Dosen  : " + usia + " tahun");
        System.out.println("-----------------------------");
    }
}