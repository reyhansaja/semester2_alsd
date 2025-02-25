import java.util.Scanner;
public class MatakuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahData;
        System.out.print("Jumlah data: ");
        jumlahData = sc.nextInt();
        Matakuliah23[] arrayMatakuliah23 = new Matakuliah23[jumlahData];


        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan data matakuliah ke- " + (i+1));
            arrayMatakuliah23[i] = new Matakuliah23("","",0,0);
            arrayMatakuliah23[i].tambahData(sc);
        }
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data mata kuliah ke-"+ (i+1));
            arrayMatakuliah23[i].cetakInfo();
        }
    }
}
