import java.util.Arrays;
public class RotateArrayByKTimes {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int k = 3;
        int newArray[]  = new int[array.length];
        k = k % array.length;
        for(int i = 0; i < array.length; i++) {
            int newPosition = (i + k) % array.length; 
            newArray[newPosition] = array[i];
        }
        System.out.print(Arrays.toString(newArray));
    }
}
