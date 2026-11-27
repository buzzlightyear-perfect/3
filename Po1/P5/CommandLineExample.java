public class CommandLineExample {
    /*
     * Program contoh penerimaan command line argument
     * Bhaskoro Prayoga U
     */
    public static void main(String[] args) {
        // Jika tidak ada argumen yang diberikan
        if (args.length == 0) {
            System.out.println("Tidak ada argumen diberikan.");
            System.out.println("Coba jalankan: java CommandLineExample Budi 20");
            return;
        }

        System.out.println("Jumlah argumen : " + args.length);
        System.out.println("Daftar argumen :");
        for (int i = 0; i < args.length; i++) {
            System.out.println("  args[" + i + "] = " + args[i]);
        }

        // Contoh penggunaan argumen lebih lanjut
        String nama = args[0];
        System.out.println("\nHalo, " + nama + "!");
    }
}
