public class TugasAkhir {
    public static void main(String[] args) {
        String[] namahari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        System.out.println("Cetak Menggunakan FOR");
        for (int i = 0; i < namahari.length; i++) {
            System.out.println(namahari[i]);
        }
        
        System.out.println("\nCetak Menggunakan WHILE");
        int j = 0;
        while (j < namahari.length) {
            System.out.println(namahari[j]);
            j++;
        }
    }
}