import java.util.Scanner;

public class Matakuliah23 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah23(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode: ");
        this.kode = sc.nextLine();
        System.out.print("Nama: ");
        this.nama = sc.nextLine();
        System.out.print("SKS: ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam: ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("----------------------");
    }
}