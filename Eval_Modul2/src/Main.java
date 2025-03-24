
public class Main {
    public static void main(String[] args){
        
        System.out.println("Nama    : Zaki Falihin Ayyubi");
        System.out.println("Nim     : 13020230253\n");
        System.out.println("==============================");
        
        MobilPenumpang mobil = new MobilPenumpang("Toyota Avanza", "B 1234 ABC", 7);
        System.out.println("\n--- Mobil Penumpang ---");
        mobil.displayInfo();
        

        Bus bus = new Bus("Bus Pariwisata", "D 5678 XYZ", 40, true);
        System.out.println("\n--- Bus ---");
        bus.displayInfo();

        TrukBarang truk = new TrukBarang("Truk Kontainer", "E 9101 DEF", 15.5);
        System.out.println("\n--- Truk Barang ---");
        truk.displayInfo();
        
    }
}

