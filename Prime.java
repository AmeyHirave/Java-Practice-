public class Prime {
    public static void main(String[] args) {
        // int num = 7;
        // int cnt = 0;
        // if (num > 1) {
        // for (int i = 2; i < num; i++) {
        // if (num % i == 0) {
        // cnt++;
        // }
        // }
        // String isPrime = cnt == 0 ? "number is prime" : "number is not prime";
        // System.out.println(isPrime);
        // } else {
        // System.out.println("number is less than 2 or may be -ve number");
        // }

        // Another Approach using boolean and false;

        int num = 77;
        boolean isPrime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println("The given number is Prime ? =>  " + isPrime);
        } else {
            System.out.println("Given number is less than 2 or it's a negative number!!!");
        }
    }
}

/*
 * ============================================================================
 * OPTIMIZED INDUSTRY-STANDARD APPROACH (O(sqrt(N)) TIME COMPLEXITY)
 * ============================================================================
 * public class Prime {
 *     public static void main(String[] args) {
 *         int num = 77;
 *         
 *         if (isPrime(num)) {
 *             System.out.println(num + " is a Prime number.");
 *         } else {
 *             System.out.println(num + " is NOT a Prime number.");
 *         }
 *     }
 * 
 *     public static boolean isPrime(int n) {
 *         // Numbers <= 1 are not prime
 *         if (n <= 1) return false;
 * 
 *         // 2 is the only even prime number
 *         if (n == 2) return true;
 * 
 *         // Any other even number is not prime
 *         if (n % 2 == 0) return false;
 * 
 *         // Check only odd numbers up to sqrt(n)
 *         for (int i = 3; i * i <= n; i += 2) {
 *             if (n % i == 0) {
 *                 return false; // Found a factor, exit immediately
 *             }
 *         }
 * 
 *         return true;
 *     }
 * }
 * ============================================================================
 */