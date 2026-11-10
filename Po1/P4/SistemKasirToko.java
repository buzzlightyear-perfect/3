import java.util.Scanner;

public class SistemKasirToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int JUMLAH_ITEM = 5;
        String[] namaBarang = new String[JUMLAH_ITEM];
        double[] hargaSatuan = new double[JUMLAH_ITEM];
        int[] kuantitas = new int[JUMLAH_ITEM];
        double[] subtotal = new double[JUMLAH_ITEM];

        double totalBelanja = 0;

        System.out.println("==============================================================");
        System.out.println("              SISTEM KASIR SUPERMARKET                        ");
        System.out.println("==============================================================");
        System.out.println("Silakan masukkan data 5 macam barang belanjaan:");

        for (int i = 0; i < JUMLAH_ITEM; i++) {
            System.out.println("\n--- Data Barang ke-" + (i + 1) + " ---");
            System.out.print("Nama Barang   : ");
            namaBarang[i] = input.nextLine();

            System.out.print("Harga Satuan  : Rp ");
            hargaSatuan[i] = input.nextDouble();

            System.out.print("Jumlah (Qty)  : ");
            kuantitas[i] = input.nextInt();
            input.nextLine(); 

            subtotal[i] = hargaSatuan[i] * kuantitas[i];
            totalBelanja += subtotal[i];
        }

        int diskonPersen = 0;
        String kategoriDiskon;
        if (totalBelanja > 1000000) {
            diskonPersen = 15;
            kategoriDiskon = "Kategori 1 (Total > Rp 1.000.000)";
        } else if (totalBelanja >= 500000) {
            diskonPersen = 10;
            kategoriDiskon = "Kategori 2 (Total Rp 500.000 - Rp 1.000.000)";
        } else if (totalBelanja >= 250000) {
            diskonPersen = 5;
            kategoriDiskon = "Kategori 3 (Total Rp 250.000 - Rp 499.999)";
        } else {
            diskonPersen = 0;
            kategoriDiskon = "Kategori 4 (Total < Rp 250.000)";
        }

        double nominalDiskon = totalBelanja * (diskonPersen / 100.0);
        double totalBayar = totalBelanja - nominalDiskon;

        System.out.println("\n\n==============================================================");
        System.out.println("                    STRUK BELANJA SUPERMARKET                 ");
        System.out.println("==============================================================");
        System.out.printf("%-4s %-20s %-14s %-6s %-14s\n", "No", "Nama Barang", "Harga Satuan", "Qty", "Subtotal");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < JUMLAH_ITEM; i++) {
            System.out.printf("%-4d %-20s Rp %-11.2f %-6d Rp %-11.2f\n",
                    (i + 1), namaBarang[i], hargaSatuan[i], kuantitas[i], subtotal[i]);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total Belanja Kotor              : Rp %.2f\n", totalBelanja);
        System.out.printf("Kategori Diskon                  : %s\n", kategoriDiskon);
        System.out.printf("Diskon (%d%%)                     : -Rp %.2f\n", diskonPersen, nominalDiskon);
        System.out.println("--------------------------------------------------------------");
        System.out.printf("TOTAL TAGIHAN AKHIR              : Rp %.2f\n", totalBayar);
        System.out.println("==============================================================");
        System.out.println("       Terima kasih telah berbelanja di Supermarket kami!      ");
        System.out.println("==============================================================");

        input.close();
    }
}
