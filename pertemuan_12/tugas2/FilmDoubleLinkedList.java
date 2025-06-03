public class FilmDoubleLinkedList {
    Node head;
    int size;

    public FilmDoubleLinkedList() {
        head = null;
        size = 0;
    }

    public void addFilm(Film film) {
        if (head == null) {
            head = new Node(null, film, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, film, null);
            current.next = newNode;
        }
        size++;
    }

    public void printFilms() {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }

        System.out.println("Daftar Film:");
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void searchById(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.id == id) {
                System.out.println("Film ditemukan:\n" + current.data);
                return;
            }
            current = current.next;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void sortByRatingDescending() {
        if (head == null || head.next == null) return;

        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data.rating < j.data.rating) {
                    Film temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        System.out.println("Daftar film berhasil diurutkan berdasarkan rating (descending).");
    }
}