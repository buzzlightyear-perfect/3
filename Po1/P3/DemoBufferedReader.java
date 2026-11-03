// File: DemoBufferedReader.java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DemoBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--- PENGUJIAN INPUT BERPERFORMA TINGGI (BUFFEREDREADER) ---");
        System.out.print("Masukkan Kode Transaksi : ");
        String kode = reader.readLine();

        System.out.print("Masukkan Jumlah Barang  : ");
        int jumlah = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan Harga Satuan   : ");
        double harga = Double.parseDouble(reader.readLine());

        double total = jumlah * harga;
        System.out.println("\nTransaksi " + kode + " tercatat. Total Tagihan: Rp " + total);
    }
}
