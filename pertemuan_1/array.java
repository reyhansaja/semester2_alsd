import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("  Program Menghitung IP Semester");
        System.out.println("=====================================");
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();
        
        String[] matkul = new String[jumlahMataKuliah];
        int[] sks = new int[jumlahMataKuliah];
        double[] nilaiAngka = new double[jumlahMataKuliah];
        String[] nilaiHuruf = new String[jumlahMataKuliah];
        double[] nilaiSetara = new double[jumlahMataKuliah];
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            matkul[i] = sc.nextLine();
            
            System.out.print("Masukkan jumlah SKS untuk " + matkul[i] + ": ");
            sks[i] = sc.nextInt();
            
            System.out.print("Masukkan nilai angka untuk " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();
            if(nilaiAngka[i] < 0 || nilaiAngka[i] > 100 ){
                System.out.println("Nilai tidak valid");
                return;
            }

            if (nilaiAngka[i] > 80) nilaiHuruf[i] = "A";
            else if (nilaiAngka[i] > 73) nilaiHuruf[i] = "B+";
            else if (nilaiAngka[i] > 65) nilaiHuruf[i] = "B";
            else if (nilaiAngka[i] > 60) nilaiHuruf[i] = "C+";
            else if (nilaiAngka[i] > 50) nilaiHuruf[i] = "C";
            else if (nilaiAngka[i] > 39) nilaiHuruf[i] = "D";
            else nilaiHuruf[i] = "E";
            
            switch (nilaiHuruf[i]) {
                case "A": nilaiSetara[i] = 4.0; break;
                case "B+": nilaiSetara[i] = 3.5; break;
                case "B": nilaiSetara[i] = 3.0; break;
                case "C+": nilaiSetara[i] = 2.5; break;
                case "C": nilaiSetara[i] = 2.0; break;
                case "D": nilaiSetara[i] = 1.0; break;
                case "E": nilaiSetara[i] = 0.0; break;
            }
        }
        
        System.out.println("=====================================");
        System.out.println("        Hasil Konversi Nilai");
        System.out.println("=====================================");
        System.out.printf("%-30s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        double totalNilai = 0;
        int totalSKS = 0;
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.printf("%-30s %-12.2f %-12s %-12.2f\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
            totalNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        
        double ipSemester = totalNilai / totalSKS;
        System.out.println("=====================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        
    }
}
