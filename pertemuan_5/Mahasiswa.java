public class Mahasiswa {
    String nama;
    int uts;
    int uas;

    public Mahasiswa(String nama, int uts, int uas) {
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }
}

class AnalisisNilai {
    public static int cariMaxUTS(int[] uts, int l, int r) {
        if (l == r) return uts[l];
        
        int tengah = (l + r) / 2;
        int kiriMax = cariMaxUTS(uts, l, tengah);
        int kananMax = cariMaxUTS(uts, tengah + 1, r);
        
        if (kiriMax > kananMax) {
            return kiriMax;
        } else {
            return kananMax;
        }        
    }

    public static int cariMinUTS(int[] uts, int l, int r) {
        if (l == r) return uts[l];
        
        int tengah = (l + r) / 2;
        int kiriMin = cariMinUTS(uts, l, tengah);
        int kananMin = cariMinUTS(uts, tengah + 1, r);
        
        if (kananMin > kiriMin) {
            return kiriMin;
        } else {
            return kananMin;
        } 
    }

    public static double hitungRataUAS(int[] uas) {
        int total = 0;
        for (int nilai : uas) {
            total += nilai; 
        }
        return (double) total / uas.length;
    }
}
