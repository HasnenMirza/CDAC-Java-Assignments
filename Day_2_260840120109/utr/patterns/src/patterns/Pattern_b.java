package patterns;

public class Pattern_b {
    public static void main(String[] args) {
        int n = 3; // controls half-height of the pattern

        // Upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print("*");
            for (int j = 0; j < 2 * i; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) System.out.print("*");
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) System.out.print("*");
            for (int j = 0; j < 2 * i; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) System.out.print("*");
            System.out.println();
        }
    }
}