public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Pembagian pembagian = new Pembagian();
        ArrayAkses arrayAkses = new ArrayAkses();

        // Input angka
        int a = input.ambilInputAngka("Masukkan angka pertama: ");
        int b = input.ambilInputAngka("Masukkan angka kedua: ");

        // Pembagian
        int hasil = pembagian.bagi(a, b);
        if (hasil != 0) {
            System.out.println("Hasil pembagian: " + hasil);
        }

        // Akses array
        int i = input.ambilInputAngka("Masukkan indeks array (0-4): ");
        arrayAkses.aksesArray(i);

        input.tutup();
    }
}
