public class Prog {
    public static void main(String[] args) {
        int n = 5; // Size of the letter and the square

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Conditions for printing '*' to form the letter R in a square pattern
                if (j == 0 || i == 0 || i == n / 2 || (i == j && i < n / 2) || (j == n - 1 && i != n - 1 && i <= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
