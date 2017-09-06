package dependencyChecker.app;
import mjson.Json;
import java.util.Scanner;

public class App
{

    public static Json obj = Json.object();
    public static int userId = 0;
    public static void main( String[] args )
    {
        boolean run = true;
        while(run){
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to Add, Read or Exit");
            String a =  input.next();
            if (a.equals("Exit")) {
                run = false;
            }
            if (a.equals("Add")) {
                System.out.println("Provide a first name: ");
                String f =  input.next();
                System.out.println("Provide a last name: ");
                String l =  input.next();
                addName(f, l);
            }
            if (a.equals("Read")) {
                read();
            }
        }
    }

    private static void addName(String f, String l) {
        obj.set(String.valueOf(userId), f + " " + l);
        userId = userId + 1;
        System.out.println("User added!");
    }

    private static void read() {
        System.out.println(obj.toString());
    }
}
