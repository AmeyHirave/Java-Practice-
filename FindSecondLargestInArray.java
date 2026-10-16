public class FindSecondLargestInArray {
    public static void main(String [] args) {
        // int [] arr = {12, 35, 1, 10, 34, 1};
        int [] arr = {10, 20, 30};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }

        System.out.println("The second largest number is : " + second_largest);
    }
}


/*
 * ============================================================================
 * OPTIMAL SINGLE-PASS APPROACH (O(N) TIME, 1 LOOP)
 * ============================================================================
 * public class FindSecondLargestInArray {
 *     public static void main(String[] args) {
 *         int[] arr = {10, 20, 30};
 * 
 *         int largest = Integer.MIN_VALUE;
 *         int second_largest = Integer.MIN_VALUE;
 * 
 *         for (int i = 0; i < arr.length; i++) {
 *             if (arr[i] > largest) {
 *                 second_largest = largest;
 *                 largest = arr[i];
 *             } else if (arr[i] > second_largest && arr[i] != largest) {
 *                 second_largest = arr[i];
 *             }
 *         }
 * 
 *         System.out.println("The second largest number is: " + second_largest);
 *     }
 * }
 * ============================================================================
 */