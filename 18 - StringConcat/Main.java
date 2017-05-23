public class Main {
    public static void main(String[] args) {
        // In java you can concatonate strings with the + operator
        String myBeginning = "This string '+' ";
        String myEnd =  "this one = concat with the + sign";
        System.out.println(myBeginning +  myEnd);

        // However it is not the most efficient method...
        // A better way to concatonate is to use a string builder.

        String buildOne = "Better yet, build it";
        String buildTwo = " with a builder!";
        String fullString =  new StringBuilder(buildOne).append(buildTwo).toString();

        System.out.println(fullString);

    }

}
