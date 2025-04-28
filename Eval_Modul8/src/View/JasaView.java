package View;

import Model.Jasa;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class JasaView {
    private final Scanner sc = new Scanner(System.in);
    private final NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));

    public int menu() {
        System.out.println("""
                ==== Manajemen Jasa Desain Grafis ====
                1. Tambah Jasa
                2. Tampilkan Semua Jasa
                3. Cari Jasa
                4. Update Jasa
                5. Hapus Jasa
                6. Keluar
                """);
        System.out.print("Pilih menu: ");
        return sc.nextInt();
    }

    public Jasa inputJasa() {
        sc.nextLine();
        System.out.print("Nama Jasa: ");
        String nama = sc.nextLine();
        System.out.print("Deskripsi: ");
        String deskripsi = sc.nextLine();
        System.out.print("Harga: ");
        double harga = sc.nextDouble();
        return new Jasa(nama, deskripsi, harga);
    }

    public void tampil(List<Jasa> list) {
        System.out.println("==== Daftar Jasa ====");
        for (Jasa j : list) {
            System.out.printf("%-3d %-25s Rp%s%n", j.getId(), j.getNama(), nf.format(j.getHarga()));
            System.out.println("    " + j.getDeskripsi());
        }
    }

    public String cariKeyword() {
        sc.nextLine();
        System.out.print("Cari jasa: ");
        return sc.nextLine();
    }

    public int inputId() {
        System.out.print("Masukkan ID: ");
        return sc.nextInt();
    }

    public void detail(Jasa j) {
        if (j != null) {
            System.out.printf("ID: %d\nNama: %s\nDeskripsi: %s\nHarga: Rp%s\n",
                    j.getId(), j.getNama(), j.getDeskripsi(), nf.format(j.getHarga()));
        } else {
            System.out.println("Jasa tidak ditemukan.");
        }
    }
}
