public abstract class MaxMinInArray {
    public static void main(String [] args){
        int[] arr = {15, 42, 7, 89, 23, 5}; 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number is : "+ max);
        System.out.println("Min number is : "+ min);
    }
}

/*
 * ============================================================================
 * CLEANER & MODERN ALTERNATIVES (FOR FUTURE REFERENCE)
 * ============================================================================
 *
 * 1. Enhanced for-each loop:
 *    - When you only need to read values and don't care about the index 'i'.
 *    - No index out of bounds, no arr[i], much cleaner to read!
 *
 *    for (int num : arr) {
 *        if (num > max) {
 *            max = num;
 *        }
 *        if (num < min) {
 *            min = num;
 *        }
 *    }
 *
 * 2. Using Math.max() and Math.min():
 *    - Replaces manual if-blocks with Java's built-in utility methods:
 *
 *    for (int num : arr) {
 *        max = Math.max(max, num);
 *        min = Math.min(min, num);
 *    }
 * ============================================================================
 */
