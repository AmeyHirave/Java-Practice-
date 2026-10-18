public class CountOccurence {
        public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 9, 2, 8 };
        int target = 2;
        int cnt = 0;
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                cnt++;
                lastIndex = i;
                if (firstIndex == -1) {
                    firstIndex = i;
                }
            }
        }
        if (cnt != 0) {
            System.out.println("Total Occurence : " + cnt);
            System.out.println("First index : " + firstIndex);
            System.out.println("Last index : " + lastIndex);
        } else {
            System.out.println("Element not found...");
        }
    }
}

/*
 * ============================================================================
 * ALTERNATIVE APPROACHES (FOR FUTURE REFERENCE)
 * ============================================================================
 *
 * 1. Two-Pointer Approach (Scan from both ends):
 *    - Finds firstIndex from front and lastIndex from back, stopping early with break.
 *
 *    int firstIndex = -1, lastIndex = -1, cnt = 0;
 *    for (int i = 0; i < arr.length; i++) {
 *        if (arr[i] == target) {
 *            firstIndex = i;
 *            break;
 *        }
 *    }
 *    for (int i = arr.length - 1; i >= 0; i--) {
 *        if (arr[i] == target) {
 *            lastIndex = i;
 *            break;
 *        }
 *    }
 *    for (int num : arr) {
 *        if (num == target) cnt++;
 *    }
 *
 * 
 * *************************************************************************************
 * 
 * 2. If Array is SORTED - Binary Search O(log N) Approach:
 *    - Finds first & last index in O(log N) time, then calculates count directly!
 *
 *    // Find first occurrence:
 *    int low = 0, high = arr.length - 1, first = -1;
 *    while (low <= high) {
 *        int mid = low + (high - low) / 2;
 *        if (arr[mid] == target) {
 *            first = mid;
 *            high = mid - 1; // Search left half for earlier occurrence
 *        } else if (arr[mid] < target) {
 *            low = mid + 1;
 *        } else {
 *            high = mid - 1;
 *        }
 *    }
 *
 *    // Find last occurrence:
 *    low = 0; high = arr.length - 1; int last = -1;
 *    while (low <= high) {
 *        int mid = low + (high - low) / 2;
 *        if (arr[mid] == target) {
 *            last = mid;
 *            low = mid + 1; // Search right half for later occurrence
 *        } else if (arr[mid] < target) {
 *            low = mid + 1;
 *        } else {
 *            high = mid - 1;
 *        }
 *    }
 *
 *    // Total count without any counting loop:
 *    int totalCount = (first != -1) ? (last - first + 1) : 0;
 * ============================================================================
 */
