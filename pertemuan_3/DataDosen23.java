public class DataDosen23 {
    public static void dataSemuaDosen(Dosen23[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen23 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJUMLAH DOSEN BERDASARKAN JENIS KELAMIN");
        System.out.println("Laki-laki : " + pria);
        System.out.println("Perempuan : " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        System.out.println("\nRATA-RATA USIA DOSEN BERDASARKAN JENIS KELAMIN");
        System.out.println("Laki-laki : " + (jumlahPria > 0 ? (totalUsiaPria / jumlahPria) : 0) + " tahun");
        System.out.println("Perempuan : " + (jumlahWanita > 0 ? (totalUsiaWanita / jumlahWanita) : 0) + " tahun");
    }

    public static void infoDosenPalingTua(Dosen23[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen23 dosenTertua = arrayOfDosen[0];

        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\nDOSEN PALING TUA");
        dosenTertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen23[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen23 dosenTermuda = arrayOfDosen[0];

        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\nDOSEN PALING MUDA");
        dosenTermuda.cetakInfo();
    }
}
