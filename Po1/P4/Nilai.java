import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai grade: ");
        int grade = input.nextInt(); // nilai dimasukkan dari keyboard
        
        if (grade >= 69) {
            System.out.println("Selamat!");
        }
        
        input.close();
    }
}