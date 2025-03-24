
abstract class KendaraanAbstrak implements Kendaraan{
    protected String nama;
    protected String nomorPlat;
    
    KendaraanAbstrak(String nama, String nomorPlat){
        this.nama = nama;
        this.nomorPlat = nomorPlat;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Nama        :" + nama);
        System.out.println("Nomor Plat  :" + nomorPlat);
    }
    
    public abstract double hitungKapasitas();
}
