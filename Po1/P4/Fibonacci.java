import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- [PROGRAM PENCETAK DERET FIBONACCI] ---");
        System.out.print("Masukkan jumlah suku deret Fibonacci: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Deret Fibonacci (" + n + " suku): ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : ""));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();

        input.close();
    }
}
