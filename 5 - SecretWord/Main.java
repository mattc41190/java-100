public class Main {
    public static void main(String[] args) {
        String myGuess = args[0];
        String secretWord = "Orange";

        if (!myGuess.equals(secretWord)) {
            System.out.println("Your Guess: " + myGuess + " (According to ./run.sh args)");
            System.out.println("You didn't guess the secret word. Hint: It is orange in color and is a fruit.");
            System.out.println("Please try a new guess in ./run.sh");
        } else {
            System.out.println("Your Guess: " + myGuess + " (According to ./run.sh args)");
            System.out.println("Secret word guessed!");
        }
    }
}
