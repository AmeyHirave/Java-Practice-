import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        number = Math.abs(number);
        int temp = number;
        int newNum = 0;
        while(temp > 0){
            newNum = (newNum * 10) + (temp % 10);
            temp = temp / 10;
        }
        System.out.println(newNum);
       String isPalindrome = number == newNum ? "is palindrome " : "is not palindrome" ;
       System.out.print(isPalindrome);
        sc.close();
    }
}
