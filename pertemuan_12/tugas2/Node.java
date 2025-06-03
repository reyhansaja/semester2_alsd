public class Node {
    Film data;
    Node prev, next;

    public Node(Node prev, Film data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}