package asistensim5;

public abstract class Mahasiswa implements Beasiswa{
    String nama;
    String nim;
    
    
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    void tampilkanInfo(){
        System.out.println("Nama    :" + nama);
        System.out.println("Nim     :" + nim);
    }
    
    @Override
    public double getJumlahBeasiswa(){
        return 0;
    }
    
}
