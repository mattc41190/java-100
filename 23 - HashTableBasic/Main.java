import java.util.*;

public class Main {
   public static void main(String [] args) {

         Hashtable<Integer,String> people=new Hashtable<Integer,String>();

         people.put(1,"Matt");
         people.put(2,"Ariel");
         people.put(3,"Tommy");
         people.put(4,"Jazz");

         for(Map.Entry person : people.entrySet()){
          System.out.println(person.getKey()+" "+person.getValue());
         }
   }
}
