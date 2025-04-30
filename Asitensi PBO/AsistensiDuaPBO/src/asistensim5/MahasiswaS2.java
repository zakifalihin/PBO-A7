package asistensim5;

public class MahasiswaS2 extends Mahasiswa {

    public MahasiswaS2(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    void tampilkanInfo(){
        System.out.println("\nNama     :" + nama);
        System.out.println("Nim      :" + nim);
        System.out.println("Beasiswa :" + getJumlahBeasiswa());
    }
    
    @Override
    public double getJumlahBeasiswa() {
        return 3000000;
    }
    
}
