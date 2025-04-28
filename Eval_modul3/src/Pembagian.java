public class Pembagian {
    public int bagi(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Tidak bisa dibagi dengan nol!");
            return 0;
        }
    }
}
