import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidasiInputApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usiaValid = 0;
        boolean inputBenar = false;

        while (!inputBenar) {
            try {
                System.out.print("Silakan masukkan usia Anda (angka bulat): ");
                usiaValid = scanner.nextInt();

                if (usiaValid <= 0 || usiaValid > 120) {
                    System.out.println("[ERROR] Usia tidak masuk akal! Ulangi.");
                } else {
                    inputBenar = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("[PERINGATAN] Input harus berupa bilangan bulat! Jangan masukkan huruf.");
                scanner.nextLine();
            }
        }

        System.out.println("Terima kasih. Usia Anda terkonfirmasi: " + usiaValid + " tahun.");
        scanner.close();
    }
}
