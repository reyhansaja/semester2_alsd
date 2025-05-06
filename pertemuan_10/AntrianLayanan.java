public class AntrianLayanan {
    Mahasiswa [] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa mhs){
        if(IsFull()){
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama+" berhasil masuk ke antrean.");
    }

    public Mahasiswa layaniMahasiswa(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong: ");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        }else{
            System.out.println("Mahasiswa Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    public void lihatTerbelakang(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        }else{
            System.out.println("Mahasiswa Terbelakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public void tampilkanSemua(){
        if(IsEmpty()){
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println((i+1)+". ");
            data[index].tampilkanData();
        }
    }
    public int getJumlahAntrian(){
        return size;
    }
}