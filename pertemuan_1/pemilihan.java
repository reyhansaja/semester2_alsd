import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Penghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Quiz: ");
        int quiz = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        if(tugas < 0 || tugas > 100 || quiz < 0 || quiz > 100 || uts <0 || uts > 100 || uas<0 || uas > 100){
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.println("===============================");
        System.out.println("===============================");
        double nilaiAkhir = ((int)tugas * 0.1) + ((int)quiz * 0.2) + ((int) uts * 0.3 + (int) uas * 0.4);
        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: A");
        }
        else if(nilaiAkhir <=80 && nilaiAkhir > 73){
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: B+");
        }
        else if(nilaiAkhir <=73 && nilaiAkhir > 65){
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: B");
        }
        else if(nilaiAkhir <=65 && nilaiAkhir > 60){
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: C+");
        }
        else if(nilaiAkhir <=60 && nilaiAkhir > 50){
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: C");
        }
        else if(nilaiAkhir <=50 && nilaiAkhir > 39){
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: D");
        }
        else{
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: E");
        }
        System.out.println("===============================");
        System.out.println("===============================");
        if (nilaiAkhir<=100 && nilaiAkhir>50) {
            System.out.println("SELAMAT ANDA LULUS");
        }
        else{
            System.out.println("MAAF, ANDA TIDAK LULUS");
        }
    }
}