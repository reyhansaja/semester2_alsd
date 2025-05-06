import java.util.Scanner;
public class MainAntrianKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimal antrian: ");
        int maxAntrian = sc.nextInt();
        System.out.print("Masukkan jumlah mahasiswa yang ditangani DPA: ");
        int jumlahDPA = sc.nextInt();

        AntrianKRS antrianKRS = new AntrianKRS(maxAntrian, jumlahDPA);

        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian untuk Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Mahasiswa Sudah Diproses");
            System.out.println("8. Cetak Jumlah Mahasiswa Belum Diproses");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrianKRS.tambahAntrian(mhs);
                    break;
                case 2:
                    antrianKRS.panggilAntrian();
                    break;
                case 3:
                    antrianKRS.tampilkanSemuaAntrian();
                    break;
                case 4:
                    antrianKRS.tampilkanDepanAntrian();
                    break;
                case 5:
                    antrianKRS.tampilkanBelakangAntrian();
                    break;
                case 6:
                    antrianKRS.cetakJumlahAntrian();
                    break;
                case 7:
                    antrianKRS.cetakJumlahDiproses();
                    break;
                case 8:
                    antrianKRS.cetakJumlahBelumProses();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}