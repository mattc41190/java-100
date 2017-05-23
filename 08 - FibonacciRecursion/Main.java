public class Main {
    // likely too complicated for this level...
    public static void main(String[] args) {
        long fibResult = fib(7); // prints out the nth number in the fibonacci sequence
        System.out.println(fibResult);
    }

    public static long fib(int n){
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
