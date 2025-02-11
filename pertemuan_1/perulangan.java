import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        
        int n = (int) (nim % 100);
        if (n < 10) {
            n += 10;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            System.out.print(i % 2 == 1 ? "* " : i + " ");
        }
    }
}
