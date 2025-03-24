
public class TrukBarang extends KendaraanAbstrak{

    private double KapasitasTonase;

    public TrukBarang(String nama, String nomorPlat,double KapasitasTonase) {
        super(nama, nomorPlat);
        this.KapasitasTonase = KapasitasTonase;
    }
    
    @Override
    public double hitungKapasitas(){
        return KapasitasTonase;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas   :" + this.KapasitasTonase + " ton");
    }
    
}
