/*Examples:

Example 1:
Input: {0, 1, 0, 3, 12}
Output: {1, 3, 12, 0, 0}
(Notice: 1, 3, and 12 stayed in their original order, while both 0s were pushed to the end).

Example 2:
Input: {0, 0, 5}
Output: {5, 0, 0}

Example 3:
Input: {1, 2, 3}
Output: {1, 2, 3} (no zeros, array remains unchanged) */
public class MoveZeroToEnd {
    public static void main(String [] args) {
        int [] arr = {0, 1, 0, 3, 12};
        int indexPosition = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                
                arr[indexPosition++] = arr[i];
            } 
        }
        while(indexPosition < arr.length) {
            arr[indexPosition++] = 0;
        }
         
        /*
        for(int i = indexPosition; i < arr.length; i++) {
            arr[indexPosition++] = 0;
        } we can also use this approach.
         */
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
