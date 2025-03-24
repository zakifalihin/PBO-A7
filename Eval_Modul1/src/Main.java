import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> namaItem = new ArrayList<>();
    static ArrayList<Integer> hargaItem = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean jalan = true;

        while (jalan) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Item");
            System.out.println("2. Hapus Item");
            System.out.println("3. Tampilkan Item");
            System.out.println("4. Cari Item");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahItem();
                case 2 -> hapusItem();
                case 3 -> tampilkanItem();
                case 4 -> cariItem();
                case 0 -> {
                    jalan = false;
                    System.out.println("Terima kasih!");
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void tambahItem() {
        System.out.print("Masukkan Nama Item: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Harga: ");
        int harga = scanner.nextInt();
        scanner.nextLine();

        namaItem.add(nama);
        hargaItem.add(harga);
        System.out.println("Item berhasil ditambahkan!");
    }

    static void hapusItem() {
        System.out.print("Nama Item yang Dihapus: ");
        String nama = scanner.nextLine();

        int index = namaItem.indexOf(nama);
        if (index != -1) {
            namaItem.remove(index);
            hargaItem.remove(index);
            System.out.println("Item telah dihapus.");
        } else {
            System.out.println("Item tidak ditemukan.");
        }
    }

    static void tampilkanItem() {
        if (namaItem.isEmpty()) {
            System.out.println("Belanjaan kosong!");
        } else {
            System.out.println("Daftar Item:");
            for (int i = 0; i < namaItem.size(); i++) {
                System.out.println(namaItem.get(i) + " | Harga: Rp." + hargaItem.get(i));
            }
        }
    }

    static void cariItem() {
        System.out.print("Nama Item yang Dicari: ");
        String nama = scanner.nextLine();

        int index = namaItem.indexOf(nama);
        if (index != -1) {
            System.out.println("Item ditemukan: " + namaItem.get(index) + " | Harga: Rp" + hargaItem.get(index));
        } else {
            System.out.println("Item tidak ditemukan.");
        }
    }
}