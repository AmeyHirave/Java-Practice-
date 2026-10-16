public class ReverseArray {
    public static void main(String [] args) {
        int [] normal_Array = {10,20,30,40,50};
        int [] reversed_Array = new int[normal_Array.length];
        int temp = 0;
        int start = 0; 
        int end = normal_Array.length-1;
        for(int i = 0; i < normal_Array.length; i++) {
            temp = normal_Array[start];
            reversed_Array[start] = normal_Array[end];
            reversed_Array[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i < reversed_Array.length; i++) {
            System.out.print(reversed_Array[i]+" ");
        }

        // This is the mixture of both techniques creating a new array and swapping the values of an array.
    } 
}