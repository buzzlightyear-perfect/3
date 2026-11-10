import java.util.Scanner;

public class Nilai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai ujian mahasiswa: ");
        int nilai = input.nextInt();
        
        if (nilai >= 60) {
            System.out.println("LULUS");
        } else {
            System.out.println("GAGAL");
        }
        
        input.close();
    }
}