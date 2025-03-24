
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();

        mobil.nyalakanMesin(); // Dari abstract class Mesin
        mobil.maju();          // Dari interface Kendaraan
        mobil.berhenti();      // Dari interface Kendaraan
        mobil.matikanMesin();  // Dari abstract class Mesin
    }
}
