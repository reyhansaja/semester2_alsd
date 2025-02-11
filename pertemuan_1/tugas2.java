import java.util.Scanner;

public class tugas2 {
    static int panjang;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
        System.out.println("=========================");
        System.out.println("       Menu Utama        ");
        System.out.println("=========================");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("pilih menu(1-3): ");
        int pilihmenu = sc.nextInt();
        switch (pilihmenu) {
            case 1:
                volumeKubus(panjang);
                break;
            case 2:
                luasKubus(panjang);
                break;
            case 3:
                kelilingKubus(panjang);
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            default:
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }    
    }
    public static void volumeKubus(int panjang) {
        System.out.print("Masukkan panjang kubus: ");
        panjang = sc.nextInt();
        
        int volumeKubus = panjang * panjang;
        System.out.println("Volume kubus tersebut adalah " + volumeKubus);
    }
    public static void luasKubus(int panjang) {
        System.out.print("Masukkan panjang kubus: ");
        panjang = sc.nextInt();

        int luasKubus = 6 * panjang * panjang;
        System.out.println("Luas kubus tersebut adalah " + luasKubus);
    }
    public static void kelilingKubus(int panjang) {
        System.out.print("Masukkan panjang kubus: ");
        panjang = sc.nextInt();

        int kelilingKubus = 12 * panjang;
        System.out.println("Keliling kubus tersebut adalah " + kelilingKubus);
    }
}
