public class MahasiswaBerprestaasi23 {
    Mahasiswa23 [] listMhs = new Mahasiswa23[5];
    int idx;

    void tambah(Mahasiswa23 m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for(Mahasiswa23 m:listMhs){
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1;i++){
            for(int j=0; j<listMhs.length-i;j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa23 tmp = listMhs[j];
                    listMhs[j-1] = tmp;
                }
            }  
        }
    }
}