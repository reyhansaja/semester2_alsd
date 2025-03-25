public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void pencarianDataSequential(String cari) {
        boolean ditemukan = false;
        for (int j = 0; j < idx; j++) {
            if (dataDosen[j].nama.equalsIgnoreCase(cari)) {
                dataDosen[j].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama '" + cari + "' tidak ditemukan.");
        }
    }

    // Metode Binary Search untuk mencari berdasarkan Usia
    void pencarianDataBinary(int cari) {
        sortDosenByUsia();
        
        int left = 0, right = idx - 1;
        boolean ditemukan = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (dataDosen[mid].usia == cari) {
                System.out.println("Data dosen dengan usia " + cari + " ditemukan:");
                int i = mid;
                while (i >= 0 && dataDosen[i].usia == cari) {
                    dataDosen[i].tampil();
                    i--;
                }
                i = mid + 1;
                while (i < idx && dataDosen[i].usia == cari) {
                    dataDosen[i].tampil();
                    i++;
                }
                ditemukan = true;
                break;
            } else if (dataDosen[mid].usia > cari) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan usia " + cari + " tidak ditemukan.");
        }
    }

    void sortDosenByUsia() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
}
