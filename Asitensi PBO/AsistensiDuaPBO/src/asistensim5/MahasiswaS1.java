package asistensim5;

public class MahasiswaS1 extends Mahasiswa{

    public MahasiswaS1(String nama, String nim) {
        super(nama, nim);
    }
    
    @Override
    void tampilkanInfo(){
        System.out.println("Nama     :" + nama);
        System.out.println("Nim      :" + nim);
        System.out.println("Beasiswa :" + getJumlahBeasiswa());
    }

    @Override
    public double getJumlahBeasiswa() {
        
        return 2000000;  
    }
    
}
