/*Examples:

Example 1:
Array: {2, 4, 7, 9, 15}
Output: The array is sorted in ascending order.

Example 2:
Array: {1, 5, 3, 8}
Output: The array is NOT sorted. (because 5 is greater than 3)

Example 3 (Equal elements):
Array: {10, 10, 20, 30}
Output: The array is sorted in ascending order.*/
public class CheckAscendingArray {
    public static void main(String [] args) {
        int [] arr = {2, 4, 7,17, 9, 15};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]  ){
                isSorted = false;
                break;
            } 
        }
        if(isSorted) {
            System.out.println("Array is sorted...");
        } else {
            System.out.println("Array is not sorted...");
        }

       
    }
}

// Another approach to solve this question.
/*public class CheckAscendingArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 7, 9, 15};
        boolean isSorted = true;

        // Notice: starts at i = 1, runs up to arr.length
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) { // If current item is smaller than previous item
                isSorted = false;
                break; // Found a violation, stop immediately!
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted.");
        }
    }
} */


    /*
        "The method crashes with an ArrayIndexOutOfBoundsException on sorted arrays because on the final iteration, arr[i + 1] looks beyond the end of the array. The unsorted array didn't crash only because it returned false early on the first iteration. The fix is to stop the loop at i < arr.length - 1 so i + 1 never exceeds the bounds."
    */