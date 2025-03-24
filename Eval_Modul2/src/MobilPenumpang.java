    class MobilPenumpang extends KendaraanAbstrak{
    
    private int jumlahKursi;
    
    public MobilPenumpang(String nama, String nomorPlat, int jumlahKursi){
        super(nama, nomorPlat);
        this.jumlahKursi = jumlahKursi;
    }
    
    @Override
    public double hitungKapasitas(){   
        return jumlahKursi;
    }
     
}
