import java.util.Scanner;

public class SLLMain23 {
    public static Mahasiswa23 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa23(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList23 sll = new SingleLinkedList23();
        Mahasiswa23 mhs = new Mahasiswa23();
        int pilihan;
        do { 
            System.out.println("== Menu Linked List ==");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data setelah nama tertentu");
            System.out.println("4. Tambah data pada index tertentu");
            System.out.println("5. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    mhs = inputMahasiswa(sc);
                    sll.addFirst(mhs);
                    break;
                case 2:
                    mhs = inputMahasiswa(sc);
                    sll.addLast(mhs);
                    break;
                case 3:
                    System.out.print("Mau input setelah siapa?: ");
                    String key = sc.nextLine();
                    mhs = inputMahasiswa(sc);
                    sll.insertAfter(key, mhs);
                    break;
                case 4:
                    System.out.print("Masukkan Index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    mhs = inputMahasiswa(sc);
                    sll.insertAt(index, mhs);
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Keluar Program!");
                    break;
                default:
                    System.out.println("Menu tidak valid");;
            }
        } while (pilihan != 0);
    }
}
