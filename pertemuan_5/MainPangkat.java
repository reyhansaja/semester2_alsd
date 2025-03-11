import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah element: ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i=0;i<elemen;i++) {
            System.out.print("Masukkan basis elemen ke-"+(i+1)+": " );
            int basis = input.nextInt();
            System.out.print("Masukkan pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }
        
        System.out.println("Hasil pangkat bruteforce: ");
        for(Pangkat p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.PangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("Hasil pangkat devide and conquer: ");
        for(Pangkat p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.PangkatDC(p.nilai, p.pangkat));
        }
    }
}
