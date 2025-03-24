class Bus extends KendaraanAbstrak{
    private int jumlahKursi;
    private boolean adaWifi;
            
    public Bus(String nama, String nomorPlat, int jumlahKursi, boolean adaWifi){
        super(nama, nomorPlat);
        this.jumlahKursi = jumlahKursi;
        this.adaWifi = adaWifi;
    }
    
    @Override
    public double hitungKapasitas(){
        return jumlahKursi;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Ada WiFi: " + (adaWifi ? "Ya" : "Tidak"));
    }
}
