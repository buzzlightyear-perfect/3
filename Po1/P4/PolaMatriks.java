// File: PolaMatriks.java
public class PolaMatriks {
    public static void main(String[] args) {
        int n = 5; // Ukuran tinggi pola segitiga
        System.out.println("--- [POLA SEGITIGA SIKU-SIKU ANGKA (N = 5)] ---");
        for (int baris = 1; baris <= n; baris++) {
            // Loop kolom bersarang
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print((baris * kolom) + "\t");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
