import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myStringObj = new String("A cool string object!");
        String myStringLiteral = "What the heck does literal mean?";
        // Methods of string creation are NOT equivalent http://tutorials.jenkov.com/java/strings.html
        String someEscapedSeqs = "A new\nbad ass \\ string with \t special chars";
        System.out.println("-> \n" + myStringObj + "-> \n"+ myStringLiteral + "-> \n" +someEscapedSeqs);

    }

}
