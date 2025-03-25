import java.util.Scanner;
public class MahasiswaDemo23 {
    public static void main(String[] args) {
        MahasiswaBerprestaasi23 list = new MahasiswaBerprestaasi23();
        Scanner sc = new Scanner(System.in);
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            list.tambah(new Mahasiswa23(nim, nama, kelas, ipk));
        }

        System.out.println("\nData Mahasiswa Sebelum di Searching:");
        list.tampil();

        System.out.println("------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential search");
        double posisi = list.sequentialSearch(cari);
        int pss=(int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("-----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari2 = sc.nextDouble();
        System.out.println("----------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("----------------------------");
        double posisi2 = list.findBinarySearch(cari2, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}