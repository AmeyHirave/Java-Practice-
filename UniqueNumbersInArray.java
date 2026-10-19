public class UniqueNumbersInArray {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 3, 4, 4 };
        int uniqueIndex = 0;
        // int[] uniqueArray = {};// This cause ArrayIndexOutOfBoundException. Because it considers length of an array is 0. So there is no 0th index present of uniqeuArray.

        int[] uniqueArray = new int[array.length];
        int unique_cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                uniqueArray[uniqueIndex++] = array[i];
                unique_cnt++;
            } else if (array[i] != array[i - 1]) {
                uniqueArray[uniqueIndex++] = array[i];
                unique_cnt++;
            }
        }

        for(int i = 0; i < unique_cnt; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        System.out.println();
        System.out.print( "This is unique count : " + unique_cnt );
    }
}
