
package asistensim5;


public class Main {
    public static void main(String[] args) {
        
        MahasiswaS1 mhs1 = new MahasiswaS1("Zaki", "S1-0123");
        MahasiswaS2 mhs2 = new MahasiswaS2("Nas", "S2-0456");
        
        mhs1.tampilkanInfo();
        mhs1.getJumlahBeasiswa();
        
        mhs2.tampilkanInfo();
    }
    
    
}
