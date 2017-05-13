import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean cont = true;
        while(cont) {
            Scanner in = new Scanner(System.in);
            System.out.println("Say something: ");
            String input = in.next();
            if (input.equals("exit")) {
                cont = false;
                break;
            }
            System.out.println("You said: " +  input);
        }
    }
}
