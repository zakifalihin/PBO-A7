package Model;

public class Jasa {
    private int id;
    private String nama, deskripsi;
    private double harga;

    public Jasa(int id, String nama, String deskripsi, double harga) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public Jasa(String nama, String deskripsi, double harga) {
        this(0, nama, deskripsi, harga);
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getDeskripsi() { return deskripsi; }
    public double getHarga() { return harga; }
    public void setId(int id) { this.id = id; }
}
