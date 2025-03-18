import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting Usia ASC (Bubble Sort)");
            System.out.println("4. Sorting Usia DSC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (data.idx < 10) {
                        System.out.print("Masukkan kode: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan jenis kelamin (true=Laki-laki, false=Perempuan): ");
                        boolean jk = sc.nextBoolean();
                        System.out.print("Masukkan usia: ");
                        int usia = sc.nextInt();
                        data.tambah(new Dosen(kode, nama, jk, usia));
                    } else {
                        System.out.println("Data sudah penuh!");
                    }
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data telah diurutkan secara ASCENDING.");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data telah diurutkan secara DESCENDING.");
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
