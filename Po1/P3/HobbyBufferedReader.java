import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Tugas Akhir No. 2 - Modul 3 Praktikum Pemrograman Objek 1
 * Program menangani input dari keyboard dengan menggunakan kelas BufferedReader
 * Format output:
 * Your name : [name]
 * Your hobby : [hobby]
 * So your hobby is [hobby]. Nice hobby Mr.[name]
 */
public class HobbyBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        String hobby = "";

        try {
            System.out.print("Your name : ");
            name = reader.readLine();

            System.out.print("Your hobby : ");
            hobby = reader.readLine();

            System.out.println("So your hobby is " + hobby + ". Nice hobby Mr." + name);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan pembacaan input: " + e.getMessage());
        }
    }
}
