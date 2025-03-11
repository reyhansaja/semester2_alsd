public class Pesanan {
    Menu[] menu;
    int jumlahMenu;
    double totalHarga;

    public Pesanan() {
        this.menu = new Menu[10]; // Maksimal pesanan 10 Menu
        this.jumlahMenu = 0;
        this.totalHarga = 0;
    }

    public void tambahPesanan(Menu item) {
        if (jumlahMenu < menu.length) {
            menu[jumlahMenu] = item;
            jumlahMenu++;
            totalHarga += item.harga;
        } else {
            System.out.println("Pesanan penuh!");
        }
    }

    public void tampilkanPesanan() {
        System.out.println("Pesanan:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("- " + menu[i].tampilInfoMenu());
        }
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}

