import java.util.Scanner;
public class SumOfDigits {
    public static void main(String [] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Math.abs() converts negative numbers to positive (e.g., -123 -> 123)
        // Prevents loop from skipping and avoids negative modulo results
        num = Math.abs(num);

        int sum = 0;
        while(num > 0) {
            int temp = num % 10;   // Extracts last digit (e.g., 123 % 10 = 3)
            sum  = sum + temp;      // Can also be written as: sum += temp;
            num = num / 10;         // Removes last digit (e.g., 123 / 10 = 12)
        }
        System.out.println(sum);
        sc.close();
    }
}

/*
 * ============================================================================
 * KEY NOTES & ALTERNATIVE APPROACHES (FOR FUTURE REFERENCE)
 * ============================================================================
 *
 * 1. Math.abs(num):
 *    - Absolute value function from java.lang.Math.
 *    - Example: Math.abs(-123) -> 123, Math.abs(5) -> 5, Math.abs(0) -> 0.
 *    - Why needed: In Java, -123 % 10 gives -3 (negative remainder), and
 *      the condition (num > 0) would fail immediately for negative inputs.
 *
 * 2. Compound Assignment Operators:
 *    - sum += temp;   is shorthand for   sum = sum + temp;
 *    - num /= 10;     is shorthand for   num = num / 10;
 *
 * 3. Alternative: String / Character Approach
 *    - Best when number has 50+ digits (too big for int or long):
 *      String s = Integer.toString(Math.abs(num));
 *      int sum = 0;
 *      for (int i = 0; i < s.length(); i++) {
 *          sum += s.charAt(i) - '0'; // '0' has ASCII value 48
 *      }
 *
 * 4. Alternative: Recursive Approach
 *    - public static int sumDigits(int n) {
 *          n = Math.abs(n);
 *          if (n == 0) return 0;
 *          return (n % 10) + sumDigits(n / 10);
 *      }
 * ============================================================================
 */
