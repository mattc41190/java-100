import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Provide First Number: ");
        Long fNum =  input.nextLong();
        System.out.println("Please Provide Operator: ");
        String operator = input.next();
        System.out.println("Please Provide Second Number: ");
        Long sNum =  input.nextLong();
        long result = calculate(operator, fNum, sNum);
        System.out.println(result);
    }

    public static long add(long a, long b){
        return a + b;
    }

    public static long divide(long a, long b){
        return a / b;
    }

    public static long subtract(long a, long b){
        return a - b;
    }

    public static long multiply(long a, long b){
        return a * b;
    }

    public static long calculate(String operator, long firstNum, long secondNum) {
        long result = 0;
        switch(operator) {
            case "+":
                return add(firstNum, secondNum);
            case "-":
                return subtract(firstNum, secondNum);
            case "*":
                return multiply(firstNum, secondNum);
            case "/":
                return divide(firstNum, secondNum);
            default:
                System.out.println("ERROR -> No Valid Operator Provided");
        }
        return result;
    }
}
