public class AntrianKRS {
    Mahasiswa[] antrian;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDPA;
    int jumlahMahasiswa;

    public AntrianKRS(int max, int jumlahDPA) {
        this.max = max;
        this.antrian = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDPA = jumlahDPA;
        this.jumlahMahasiswa = 0;
    }

    public boolean cekKosong() {
        return size == 0;
    }

    public boolean cekPenuh() {
        return size == max;
    }

    public void mengosongkanAntrian() {
        antrian = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (cekPenuh()) {
            System.out.println("Antrian penuh, mahasiswa tidak dapat ditambahkan.");
            return;
        }
        rear = (rear + 1) % max;
        antrian[rear] = mhs;
        size++;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil ditambahkan ke antrian.");
    }

    public void panggilAntrian() {
        if (cekKosong()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dipanggil.");
            return;
        }

        if (size >= 2) {
            System.out.println("Memproses KRS untuk:");
            antrian[front].tampilkanData();
            antrian[(front + 1) % max].tampilkanData();
            front = (front + 2) % max;
            size -= 2;
        } else if (size == 1) {
            System.out.println("Memproses KRS untuk:");
            antrian[front].tampilkanData();
            front = (front + 1) % max;
            size--;
        } else {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dipanggil.");
        }
    }

    public void tampilkanSemuaAntrian() {
        if (cekKosong()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian Mahasiswa:");
        System.out.println("NIM\t\tNAMA\t\tPRODI\t\tKELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            antrian[index].tampilkanData();
        }
    }

    public void tampilkanDepanAntrian() {
        if (cekKosong()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian Terdepan:");
        System.out.println("NIM\t\tNAMA\t\tPRODI\t\tKELAS");
        if (size >= 2) {
            antrian[front].tampilkanData();
            antrian[(front + 1) % max].tampilkanData();
        } else {
            antrian[front].tampilkanData();
        }
    }

    public void tampilkanBelakangAntrian() {
        if (cekKosong()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian Belakang:");
        System.out.println("NIM\t\tNAMA\t\tPRODI\t\tKELAS");
        antrian[rear].tampilkanData();
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah diproses: " + (jumlahMahasiswa - size));
    }

    public void cetakJumlahBelumProses() {
        int belumProses = jumlahDPA - (jumlahMahasiswa - size);
        System.out.println("Jumlah mahasiswa yang belum diproses: " + Math.max(0, belumProses));
    }
}