import java.util.Scanner;
public class EvenOdd {
    @SuppressWarnings("resource")
	public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
       if(num % 2 == 0) {
                if(num > 0) {
                    System.out.println(num + " is positive number.");
                } else if(num < 0) {
                    System.out.println(num + " is negative number.");
                } else {
                    System.out.println(num + " is zero.");
                    return;
                }
                System.out.println(num + " is Even number.");
        } else {
            System.out.println(num + " is Odd number.");
        }
        sc.close();
    }
}  // In this approach when you will give input as odd number it will give you directly odd number it will not mention it is positive or negative number


/*
 * =============================================================
 * APPROACH 1: Using a condition check instead of return
 * =============================================================
 * if (num != 0) {
 *     System.out.println(num + " is Even number.");
 * }
 *
 * =============================================================
 * APPROACH 2: Recommended clean structure (handles 0 first)
 * =============================================================
 * if (num == 0) {
 *     System.out.println("The number is zero.");
 * } else {
 *     // 1. Check positive or negative (works for both even and odd numbers)
 *     if (num > 0) {
 *         System.out.println(num + " is positive number.");
 *     } else {
 *         System.out.println(num + " is negative number.");
 *     }
 *
 *     // 2. Check even or odd
 *     if (num % 2 == 0) {
 *         System.out.println(num + " is Even number.");
 *     } else {
 *         System.out.println(num + " is Odd number.");
 *     }
 * }
 */
