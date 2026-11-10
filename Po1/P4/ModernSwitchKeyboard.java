import java.util.Scanner;

public class ModernSwitchKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- [JADWAL PERKULIAHAN MAHASISWA TEKNIK INFORMATIKA] ---");
        System.out.println("1 = Senin  | 2 = Selasa | 3 = Rabu | 4 = Kamis");
        System.out.println("5 = Jumat  | 6 = Sabtu  | 7 = Minggu");
        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = input.nextInt();

        // Modern Switch Expression menghasilkan nilai balik (return value)
        String deskripsiJadwal = switch (kodeHari) {
            case 1 -> "SENIN : Kuliah Matematika Diskrit & Algoritma";
            case 2 -> "SELASA : Kuliah Basis Data Teori & Struktur Data";
            case 3 -> "RABU : Kuliah Teori & Praktikum Pemrograman Objek 1 (Lab)";
            case 4 -> "KAMIS : Kuliah Jaringan Komputer & Sistem Operasi";
            case 5 -> "JUMAT : Riset Mandiri Laboratorium & Diskusi Kelompok";
            case 6, 7 -> "AKHIR PEKAN : Libur Akademik / Belajar Mandiri";
            default -> "KODE HARI TIDAK DIKENAL!";
        };

        System.out.println("\nKode Hari Dipilih: " + kodeHari);
        System.out.println("Agenda Kegiatan  : " + deskripsiJadwal);

        input.close();
    }
}
