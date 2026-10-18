public class FindMissingNumberInArray {
    public static void main(String [] args) {
        int [] arr = {1,2,4,5};
        int n = arr.length + 1;
        /* formula is
                N = N * (N + 1) / 2  - sum of actual numbers
        */
        int expectedSum = n * (n + 1) / 2;
        System.out.println(expectedSum);
        int actualSum = 0;
        for(int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        System.out.println(actualSum);
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing Number is : " + missingNumber);
    }
}