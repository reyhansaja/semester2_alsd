import java.util.Scanner;
public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa23[] arrayofMahasiswa23 = new Mahasiswa23[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa23[i] = new Mahasiswa23();
            System.out.println("Masukkan data mahasiswa ke-" +(i+1));
            System.out.print("NIM: ");
            arrayofMahasiswa23[i].nim = sc.nextLine();
            System.out.print("Nama: ");
            arrayofMahasiswa23[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayofMahasiswa23[i].kelas = sc.nextLine();
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrayofMahasiswa23[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Nim: "+ arrayofMahasiswa23[i].nim);
            System.out.println("Nama: "+ arrayofMahasiswa23[i].nama);
            System.out.println("Kelas: "+ arrayofMahasiswa23[i].kelas);
            System.out.println("IPK: "+arrayofMahasiswa23[i].ipk);
            System.out.println("-----------------------------------");
        }
    }    
}