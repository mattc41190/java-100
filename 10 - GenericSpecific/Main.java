import java.util.*;

public class Main {
    public static void main(String[] args) {
        // We inform the compiler that `l` should accept <String> and nothing else
        // See 11 - ErrorHandler to see what happens when we try to add something else!
        List<String> l = new ArrayList<String>();
        l.add("Hello");
        l.add("Generic");
        l.add("Util");
        l.add("ArrayList");
        System.out.println(l);
    }
}
