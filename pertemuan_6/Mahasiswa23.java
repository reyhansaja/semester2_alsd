public class Mahasiswa23 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa23(){

    }

    Mahasiswa23(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("Nim: "+nim);
        System.out.println("Kelas: "+kelas);
        System.out.println("Ipk: "+ipk);
    }
}