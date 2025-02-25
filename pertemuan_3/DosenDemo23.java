import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        Dosen23[] arrayDosen = new Dosen23[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1));

            System.out.print("Kode Dosen: ");
            String kode = sc.nextLine();

            System.out.print("Nama Dosen: ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            sc.nextLine();
            boolean jenisKelamin = (jk == 'L' || jk == 'l'); 

            System.out.print("Usia: ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayDosen[i] = new Dosen23(kode, nama, jenisKelamin, usia);
        }

        System.out.println("DATA DOSEN");
        for (Dosen23 dosen : arrayDosen) {
            dosen.cetakInfo();
        }
    }
}
