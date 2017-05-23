import java.util.*;

public class Main {

    static ArrayList<String> groceries = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static {
        groceries.add("Blueberries");
    }

   public static void main(String [] args) {
       boolean cont = true;
       while(cont) {
           System.out.println("[Grocery List]\nWhat would you like to do?");
           String choice = sc.next();
           if (choice.equalsIgnoreCase("exit")) {
               cont = false;
           } else if (choice.equalsIgnoreCase("list")) {
               list();
           } else if (choice.equalsIgnoreCase("add")) {
              System.out.println("What would you like to add?");
              String item = sc.next();
              addItem(item);
          } else if (choice.equalsIgnoreCase("remove")) {
             System.out.println("What would you like to remove?");
             String item = sc.next();
             removeItem(item);
         }
       }
   }

   static void list() {
       for (String item: groceries) {
           System.out.println(item);
       }
   }

   static void addItem(String item) {
       groceries.add(item);
   }

   static void removeItem(String item) {
       int index = groceries.indexOf(item);
       groceries.remove(index);
   }

}
