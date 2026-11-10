import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();
        
        if (a >= b) {
            System.out.println("Bilangan terbesar adalah: " + a);
        } else {
            System.out.println("Bilangan terbesar adalah: " + b);
        }
        
        input.close();
    }
}