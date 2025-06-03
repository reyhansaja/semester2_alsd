import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilmDoubleLinkedList filmList = new FilmDoubleLinkedList();
        int pilihan;

        do {
            System.out.println("\n===== MENU FILM =====");
            System.out.println("1. Tambah Film");
            System.out.println("2. Cetak Daftar Film");
            System.out.println("3. Cari Film (berdasarkan ID)");
            System.out.println("4. Urutkan Film berdasarkan Rating (Descending)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Film: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Judul Film: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double rating = sc.nextDouble();
                    filmList.addFilm(new Film(id, judul, rating));
                    break;
                case 2:
                    filmList.printFilms();
                    break;
                case 3:
                    System.out.print("Masukkan ID yang dicari: ");
                    int cari = sc.nextInt();
                    filmList.searchById(cari);
                    break;
                case 4:
                    filmList.sortByRatingDescending();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}