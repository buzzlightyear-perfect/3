import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Program III-3a
 * Catatan: Program ini sengaja dibuat tanpa blok try-catch atau deklarasi throws IOException
 * untuk memperlihatkan error kompilasi sesuai panduan modul (Tugas III-3).
 */
public class GetInputFromKeyboard_Error {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.print("Please Enter Your Name:");
        name = dataIn.readLine();
        System.out.println("Hello " + name + "!");
    }
}
