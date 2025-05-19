public class Mahasiswa23 {
    String nim;
    String nama;
    String kelas;
    Double ipk;
    public Mahasiswa23(){

    }
    public Mahasiswa23(String nim, String nama, String kls, Double ip){
        this.nim = nim;
        this.nama = nama;
        kelas = kls;
        ipk = ip;
    }
    public void tampilInformasi(){
        System.out.println("Nim: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Kelas: "+kelas);
        System.out.println("Ipk: "+ipk);
    }
}