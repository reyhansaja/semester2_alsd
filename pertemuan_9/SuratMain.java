import java.util.Scanner;

public class SuratMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat stack = new StackSurat(10);
        int pilih;

        do {
            System.out.println("\n=== MENU SURAT IZIN MAHASISWA ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat surat = new Surat(idSurat, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat izin berhasil diterima.");
                    break;

                case 2:
                    Surat diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat izin:");
                        System.out.println("Nama: " + diproses.namaMahasiswa);
                        System.out.println("Jenis Izin: " + (diproses.jenisIzin == 'S' ? "Sakit" : "Izin Lain"));
                        System.out.println("Durasi: " + diproses.durasi + " hari");
                    }
                    break;

                case 3:
                    Surat terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir masuk dari:");
                        System.out.println("Nama: " + terakhir.namaMahasiswa);
                        System.out.println("Jenis Izin: " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin Lain"));
                        System.out.println("Durasi: " + terakhir.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
