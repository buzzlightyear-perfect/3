
public class ForFix {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};

        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x]);
        }

        for (int n : a) {
            System.out.print(n);
        }

        System.out.println();
    }
}
