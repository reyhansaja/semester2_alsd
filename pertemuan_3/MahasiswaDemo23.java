public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Mahasiswa23[] arrayofMahasiswa23 = new Mahasiswa23[3];
        arrayofMahasiswa23[0] = new Mahasiswa23();
        arrayofMahasiswa23[0].nim = "244107060033";
        arrayofMahasiswa23[0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa23[0].kelas = "SIB-1E";
        arrayofMahasiswa23[0].ipk = (float)3.75;

        arrayofMahasiswa23[1] = new Mahasiswa23();
        arrayofMahasiswa23[1].nim = "2341720172";
        arrayofMahasiswa23[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa23[1].kelas = "TI-2A";
        arrayofMahasiswa23[1].ipk = (float)3.36;

        arrayofMahasiswa23[2] = new Mahasiswa23();
        arrayofMahasiswa23[2].nim = "244107023006";
        arrayofMahasiswa23[2].nama = "DHIRMAWAN PUTRANTO";
        arrayofMahasiswa23[2].kelas = "TI-2E";
        arrayofMahasiswa23[2].ipk = (float)3.80;

        System.out.println("NIM: "+ arrayofMahasiswa23[0].nim);
        System.out.println("Nama: "+ arrayofMahasiswa23[0].nama);
        System.out.println("Kelas: "+ arrayofMahasiswa23[0].kelas);
        System.out.println("IPK: "+ arrayofMahasiswa23[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM: "+ arrayofMahasiswa23[1].nim);
        System.out.println("Nama: "+ arrayofMahasiswa23[1].nama);
        System.out.println("Kelas: "+ arrayofMahasiswa23[1].kelas);
        System.out.println("IPK: "+ arrayofMahasiswa23[1].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM: "+ arrayofMahasiswa23[2].nim);
        System.out.println("Nama: "+ arrayofMahasiswa23[2].nama);
        System.out.println("Kelas: "+ arrayofMahasiswa23[2].kelas);
        System.out.println("IPK: "+ arrayofMahasiswa23[2].ipk);
        System.out.println("--------------------------------------");
    }    
}