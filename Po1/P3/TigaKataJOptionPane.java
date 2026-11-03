import javax.swing.JOptionPane;

/**
 * Tugas Akhir No. 3 - Modul 3 Praktikum Pemrograman Objek 1
 * Program meminta input tiga kata dari user menggunakan JOptionPane
 * dan menampilkan hasilnya ke layar dialog dan terminal/konsol.
 */
public class TigaKataJOptionPane {
    public static void main(String[] args) {
        String kata1 = JOptionPane.showInputDialog(null, "Masukkan kata pertama:", "Input Kata 1", JOptionPane.QUESTION_MESSAGE);
        String kata2 = JOptionPane.showInputDialog(null, "Masukkan kata kedua:", "Input Kata 2", JOptionPane.QUESTION_MESSAGE);
        String kata3 = JOptionPane.showInputDialog(null, "Masukkan kata ketiga:", "Input Kata 3", JOptionPane.QUESTION_MESSAGE);

        String hasil = kata1 + " " + kata2 + " " + kata3;

        // Menampilkan output ke layar dialog GUI
        JOptionPane.showMessageDialog(null, "Output 3 Kata: \n" + hasil, "Hasil", JOptionPane.INFORMATION_MESSAGE);

        // Menampilkan output ke layar konsol / terminal
        System.out.println("Output ke layar: " + hasil);
    }
}
