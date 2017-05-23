import java.util.*;

public class Main {

   public static void main(String [] args) {
       ArrayList<String> dogs = new ArrayList<>();
       dogs.add("Fluffy");
       dogs.add("Tommy");
       dogs.add("Bodie");
       dogs.add("Jimbo");

       for (String name: dogs) {
           System.out.println(name);
       }

       // Unlike the built-in Array functionality with ArrayList size doesn't have to be known
       System.out.println(dogs.contains("Fluffy"));
       dogs.remove("Fluffy");
       System.out.println(dogs.contains("Fluffy"));

   }

}
