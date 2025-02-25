import java.util.Scanner;
public class MatakuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah23[] arrayMatakuliah23 = new Matakuliah23[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data matakuliah ke- " + (i+1));
            arrayMatakuliah23[i] = new Matakuliah23("","",0,0);
            arrayMatakuliah23[i].tambahData(sc);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-"+ (i+1));
            System.out.println("Kode: "+arrayMatakuliah23[i].kode);
            System.out.println("Nama: "+arrayMatakuliah23[i].nama);
            System.out.println("SKS: "+arrayMatakuliah23[i].sks);
            System.out.println("Jumlah jam: "+arrayMatakuliah23[i].jumlahJam);
        }
    }
}
