public class DoubleLinkedListQueue {
    Node head;
    int size;
    int totalVaksin;

    public DoubleLinkedListQueue() {
        head = null;
        size = 0;
        totalVaksin = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(String nama, int usia) {
        if (isEmpty()) {
            head = new Node(null, nama, usia, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nama, usia, null);
            current.next = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa divaksin.");
        } else {
            System.out.println("Orang yang divaksin: " + head.nama + " (Usia: " + head.usia + ")");
            head = head.next;
            if (head != null) head.prev = null;
            size--;
            totalVaksin++;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian vaksin kosong.");
        } else {
            Node current = head;
            System.out.println("Daftar Antrian Vaksin:");
            while (current != null) {
                System.out.println("- " + current.nama + " (Usia: " + current.usia + ")");
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + size);
            System.out.println("Total Sudah Divaksin: " + totalVaksin);
        }
    }
}