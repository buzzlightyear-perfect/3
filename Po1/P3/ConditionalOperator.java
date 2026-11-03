import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String status = "";
        double grade;

        System.out.print("Masukkan nilai grade: ");
        grade = scanner.nextDouble();

        status = (grade >= 60.0) ? "Passed" : "Fail";

        System.out.println("Nilai siswa: " + grade);
        System.out.println("Status kelulusan: " + status);

        scanner.close();
    }
}
