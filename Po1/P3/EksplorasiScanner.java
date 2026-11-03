import java.util.Scanner;

public class EksplorasiScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("== SISTEM PENDAFTARAN ANGGOTA LABORATORIUM INTERAKTIF ==");
        System.out.print("Masukkan Usia Anda (Tahun): ");
        int usia = input.nextInt();
        // PEMBERSIHAN BUFFER
        input.nextLine();
        System.out.print("Masukkan Nama Lengkap Anda : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa : ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan IPK Terakhir [0.0-4.0] : ");
        double ipk = input.nextDouble();
        System.out.println("\n--- DATA BERHASIL DIVERIFIKASI DAN TERSIMPAN ---");
        System.out.println("ID Anggota Terbit : LAB-IF-2026-089");
        System.out.println("Nama Pendaftar    : " + nama + " (Usia " + usia + " thn)");
        System.out.println("Jurusan / IPK     : " + jurusan + " / " + ipk);
        System.out.println("Status Keanggotaan: AKTIF");
        input.close();
    }
}
