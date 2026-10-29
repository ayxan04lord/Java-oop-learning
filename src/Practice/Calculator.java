package Practice;

public final class Calculator {

    public static int add(int a, int b){
        return  a + b;
    }

    public static int subtract(int a, int b){
        return  a - b;
    }

    public static int multiply(int a, int b){
        return  a * b;
    }

    public static int divide(int a, int b){
        if (b==0){
            System.out.println("0-a bolmek olmaz");
            return -1;
        }

        return  a / b;

    }

}
