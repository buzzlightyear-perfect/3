public class ModernSwitchApp {
    public static void main(String[] args) {
        int kodeHari = 3; // 1 = Senin, 2 = Selasa, 3 = Rabu, dst.

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

        System.out.println("--- [JADWAL PERKULIAHAN MAHASISWA TEKNIK INFORMATIKA] ---");
        System.out.println("Kode Hari Dipilih: " + kodeHari);
        System.out.println("Agenda Kegiatan : " + deskripsiJadwal);
    }
}