public class Main {
    public static void main(String[] args) {
        Integer lastNumber = Integer.parseInt(args[0]); // Call static class method parseInt to make args[0] a number
        Integer someNumber = 0;

        while (someNumber <= lastNumber) {
            System.out.println(someNumber);
            someNumber++;
        }
    }
}
