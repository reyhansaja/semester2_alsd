public class Node {
    String nama;
    int usia;
    Node prev, next;

    public Node(Node prev, String nama, int usia, Node next) {
        this.prev = prev;
        this.nama = nama;
        this.usia = usia;
        this.next = next;
    }
}