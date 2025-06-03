public class Film {
    int id;
    String judul;
    double rating;

    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public String toString() {
        return "ID: " + id + ", Judul: " + judul + ", Rating: " + rating;
    }
}
