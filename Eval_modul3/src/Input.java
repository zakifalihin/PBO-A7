import java.util.Scanner;

public class Input {
    private Scanner input;

    public Input() {
        input = new Scanner(System.in);
    }

    public int ambilInputAngka(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }

    public void tutup() {
        input.close();
    }
}
