public class DosenMain {
    public static void main(String[] args) {
        DataDosen data = new DataDosen();

        data.tambah(new Dosen("D001", "Budi", true, 45));
        data.tambah(new Dosen("D002", "Ani", false, 40));
        data.tambah(new Dosen("D003", "Budi", true, 38));
        data.tambah(new Dosen("D004", "Siti", false, 45));
        data.tambah(new Dosen("D005", "Joko", true, 50));

        System.out.println("Data Dosen:");
        data.tampil();

        System.out.println("\nPencarian Nama (Sequential Search): 'Budi'");
        data.pencarianDataSequential("Budi");

        System.out.println("\nPencarian Usia (Binary Search): 45");
        data.pencarianDataBinary(45);
    }
}
