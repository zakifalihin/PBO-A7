public class ArrayAkses {
    private int[] data = {10, 20, 30, 40, 50};

    public void aksesArray(int i) {
        try {
            System.out.println("Nilai: " + data[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks tidak valid!");
        }
    }
}
