import java.util.Scanner;

public class SimulasiATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int saldo = 2000000;
        final int PIN_VALID = 123456;
        final int NOMINAL_TARIK = 500000;

        int percobaan = 1;
        boolean loginBerhasil = false;

        System.out.println("=========================================");
        System.out.println("        SIMULASI MESIN ATM BANK          ");
        System.out.println("=========================================");

        while (percobaan <= 3) {
            System.out.print("Masukkan 6 Digit PIN Anda (Percobaan " + percobaan + "/3): ");
            int inputPin = input.nextInt();

            if (inputPin == PIN_VALID) {
                loginBerhasil = true;
                break;
            } else {
                System.out.println("PIN yang Anda masukkan salah!");
                percobaan++;
            }
        }

        System.out.println("-----------------------------------------");
        if (loginBerhasil) {
            System.out.println("LOGIN BERHASIL!");
            System.out.println("--- [MENU TRANSAKSI PENARIKAN TUNAI] ---");
            System.out.println("Saldo Awal         : Rp " + saldo);
            System.out.println("Nominal Penarikan  : Rp " + NOMINAL_TARIK);

            saldo -= NOMINAL_TARIK;
            System.out.println("Sisa Saldo Anda    : Rp " + saldo);
            System.out.println("Transaksi berhasil. Silakan ambil uang dan kartu Anda.");
        } else {
            System.out.println("KARTU ATM DIBLOKIR!");
            System.out.println("Anda telah 3 kali salah memasukkan PIN keamanan.");
        }
        System.out.println("=========================================");

        input.close();
    }
}
