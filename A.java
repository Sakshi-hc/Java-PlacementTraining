public class Prog {
    public static void main(String[] args) {
        int n = 5;  // Set the grid size to 5x5

        // Loop through the rows (i)
        for (int i = 0; i < n; i++) {
            // Loop through the columns (j)
            for (int j = 0; j < n; j++) {
                // Check for the conditions to print *
                if (i == 0 || i == n / 2 || j == 0 || j == n - 1) {
                    System.out.print("* ");  // Print '*' if any condition matches
                } else {
                    System.out.print("  ");  // Print space for other positions
                }
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }
}
