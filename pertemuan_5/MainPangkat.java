import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah element: ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i=0;i<elemen;i++) {
            System.out.println("Masukkan basis elemen ke-"+(i+1)": " );
        }
    }
}
