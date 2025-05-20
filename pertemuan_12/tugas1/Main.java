import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListQueue antrian = new DoubleLinkedListQueue();
        int pilihan;

        do {
            System.out.println("\n===== MENU ANTRIAN VAKSIN =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data (Vaksinasi)");
            System.out.println("3. Cetak Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    antrian.enqueue(nama, usia);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.printQueue();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}