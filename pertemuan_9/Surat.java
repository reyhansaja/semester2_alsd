public class Surat {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' atau 'I'
    int durasi;

    public Surat() {}

    public Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
