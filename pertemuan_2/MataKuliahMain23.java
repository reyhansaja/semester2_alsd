public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 matkul1 = new MataKuliah23();
        matkul1.kodeMk = "TI-001";
        matkul1.nama = "Pemrograman Dasar";
        matkul1.sks = 2;
        matkul1.jumlahJam = 3;

        matkul1.tampilkanInformasi();
        matkul1.tambahJam(2);
        matkul1.tampilkanInformasi();

        matkul1.tampilkanInformasi();
        matkul1.kurangJam(4);
        matkul1.tampilkanInformasi();

        matkul1.tampilkanInformasi();
        matkul1.ubahSks(1);
        matkul1.tampilkanInformasi();

        matkul1.tampilkanInformasi();
        matkul1.kurangJam(2);
        matkul1.tampilkanInformasi();
    }
}
