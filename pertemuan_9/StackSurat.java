public class StackSurat {
    Surat[] stack;
    int top;
    int size;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Tumpukan surat penuh!");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            Surat surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ketemu = true;
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack[i].idSurat);
                System.out.println("Nama: " + stack[i].namaMahasiswa);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis Izin: " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin Lain"));
                System.out.println("Durasi: " + stack[i].durasi + " hari");
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
