import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        int pilih;
        Scanner scan = new Scanner (System.in);
        StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5);
        do { 
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nama,nim,kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n",mhs.nama);
                    break;
                case 2:
                    Mahasiswa23 dinilai = stack.pop();
                    if(dinilai != null){
                        System.out.println("Menilai tugas dari: "+dinilai.nama);
                        System.out.println("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n",dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner tugas: " +biner);
                    }
                    break;
                case 3:
                    Mahasiswa23 lihat = stack.peek();
                    if(lihat != null){
                        System.out.println("Tugas terakhir dikumpulkan oleh "+lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar Semua Tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak Valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
