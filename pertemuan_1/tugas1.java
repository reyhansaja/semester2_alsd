import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        char[] kodePlatNomor = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] kota = {
            {"BANTEN"}, 
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = sc.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kodePlatNomor.length; i++) {
            if (kodePlatNomor[i] == Character.toUpperCase(inputKode)) {
                System.out.println("Kota: " + kota[i][0]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }

    }
}
