import java.util.Scanner;

public class SumToSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        while (num >= 10) { // Repeat until number is a single digit
            int sum = 0;
            while (num > 0) { // Sum digits of the current number
                sum += num % 10;
                num /= 10;
            }
            num = sum; // Assign the new sum back to num
        }

        System.out.println("Single digit sum: " + num);
        scanner.close();
    }
}
