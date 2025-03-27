public class Prog {
    public static void main(String[] args) {
        int n = 5; // Size of the letter and the square

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Conditions for printing '*' to form the letter T in a square pattern
                if (i == 0 || j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
