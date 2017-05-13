import java.util.*;

public class Main {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Hello");
        l.add("Util");
        l.add("Package");
        System.out.println(l);
        // Unsafe implementation above see 10 - GenericSpecific
        // When compiled code should warn that it is not type safe
    }
}
