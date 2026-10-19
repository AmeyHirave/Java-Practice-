public class TargetSum {
    public static void main(String [] args) {
        int array[]  = {2, 7, 11, 15};
        int targetSum = 18;
        int checkSum = 0;
        for(int i = 0; i < array.length; i++) {
           for(int j = i + 1; j < array.length; j++) {
                checkSum = array[i] + array[j];
                if(checkSum == targetSum) {
                    System.out.println("Pair found : " + array[i] + " and " + array[j] + " at index " + i + " and " + j);
                    break;
                }
           }
        }
    }
}
