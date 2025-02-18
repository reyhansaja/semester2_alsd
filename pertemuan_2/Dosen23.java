public class Dosen23 {
    String idDosen;
    String nama;
    boolean status;
    int tahunBergabung;
    String bidangKeahlian;
    String statusAktif;

    public Dosen23() {
    }

    public Dosen23(String id, String nama, boolean status, int thn, String bidang) {
        this.idDosen = id;
        this.nama = nama;
        this.status = status;
        this.tahunBergabung = thn;
        this.bidangKeahlian = bidang;
        setStatusAktif(status);  
    }

    void setStatusAktif(boolean status) {
        this.status = status;
        if (status) {
            this.statusAktif = "Aktif";
        } else {
            this.statusAktif = "Tidak Aktif";
        }
    }

    void tampilkanInformasi() {
        System.out.println("Kode Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }

    int hitungMasaKerja() {
        int masaKerja = 2025 - tahunBergabung;
        System.out.println("Masa kerja: " + masaKerja);
        return masaKerja;
    }
}
