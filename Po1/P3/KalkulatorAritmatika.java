import java.util.Scanner;

/**
 * Tugas Akhir No. 1 - Modul 3 Praktikum Pemrograman Objek 1
 * Program untuk menghitung dua buah operand dengan operasi aritmatika (*, /, +, -)
 * menggunakan kelas Scanner.
 */
public class KalkulatorAritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROGRAM PERHITUNGAN ARITMATIKA 2 OPERAND (SCANNER) ===");
        System.out.print("Masukkan operand pertama : ");
        double operand1 = scanner.nextDouble();

        System.out.print("Masukkan operand kedua   : ");
        double operand2 = scanner.nextDouble();

        double hasilTambah = operand1 + operand2;
        double hasilKurang = operand1 - operand2;
        double hasilKali = operand1 * operand2;

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Penjumlahan (" + operand1 + " + " + operand2 + ") = " + hasilTambah);
        System.out.println("Pengurangan (" + operand1 + " - " + operand2 + ") = " + hasilKurang);
        System.out.println("Perkalian   (" + operand1 + " * " + operand2 + ") = " + hasilKali);

        if (operand2 != 0) {
            double hasilBagi = operand1 / operand2;
            System.out.println("Pembagian   (" + operand1 + " / " + operand2 + ") = " + hasilBagi);
        } else {
            System.out.println("Pembagian   (" + operand1 + " / " + operand2 + ") = Pembagian dengan nol tidak terdefinisi!");
        }

        scanner.close();
    }
}
