import java.util.ArrayList;

public class Mahasiswa {
    public String nama;
    public String nim;
    public String prodi;
    public ArrayList<MataKuliah> matakuliah = new ArrayList<>();
    
    public Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
    
    public void tambahMataKuliah(MataKuliah newMataKuliah){
        this.matakuliah.add(newMataKuliah);
    }
    
    public void informasiMahasiswa(){
        System.out.println("Nama  :" + this.nama);
        System.out.println("Nim   :" + this.nim);
        System.out.println("Prodi :" + this.prodi);
        
        System.out.println("\n=== MATA KULIAH ===");
        for (MataKuliah mataKuliah : this.matakuliah){
            System.out.println(mataKuliah.namaMataKuliah + " (" + mataKuliah.sks + " SKS");
        }
    }
    
}
