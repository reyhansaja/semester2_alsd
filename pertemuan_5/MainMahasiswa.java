public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] dataMahasiswa = {
            new Mahasiswa("Ahmad", 78, 82),
            new Mahasiswa("Budi", 85, 88),
            new Mahasiswa("Cindy", 90, 87),
            new Mahasiswa("Dian", 76, 79),
            new Mahasiswa("Eko", 92, 95),
            new Mahasiswa("Fajar", 88, 85),
            new Mahasiswa("Gina", 80, 83),
            new Mahasiswa("Hadi", 82, 84)
        };

        int jumlah = dataMahasiswa.length;
        int[] uts = new int[jumlah];
        int[] uas = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            uts[i] = dataMahasiswa[i].uts;
            uas[i] = dataMahasiswa[i].uas;
        }

        int nilaiTertinggiUTS = AnalisisNilai.cariMaxUTS(uts, 0, jumlah - 1);
        int nilaiTerendahUTS = AnalisisNilai.cariMinUTS(uts, 0, jumlah - 1);
        double rataRataUAS = AnalisisNilai.hitungRataUAS(uas);

        System.out.println("Nilai UTS Tertinggi : " + nilaiTertinggiUTS);
        System.out.println("Nilai UTS Terendah  : " + nilaiTerendahUTS);
        System.out.println("Rata-rata Nilai UAS : " + rataRataUAS);
    }
}
