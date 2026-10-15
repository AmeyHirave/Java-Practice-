public class ArithmaticOperations {
    public static void main(String [] args) {
        ArithmaticOperations o = new ArithmaticOperations();
        int a = 10;
        int b = 0;
        int add = o.addition(a, b);
        int sub = o.subtract(a, b);
        int mult = o.multiply(a, b);
        int div = o.divide(a, b);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
    }
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        // Note: Integer division drops decimals (e.g., 2/10 = 0).
        // Use (a / b). If numerator < denominator, result is always 0.
        // if(a != 0 && b != 0) {
        //     return  b / a;
        // } else
        // return -1;

        if(b != 0) {
            return a / b;
        }
        else {
            System.out.println("Can not divide by zero");
            return 0;
        }
    }
}
