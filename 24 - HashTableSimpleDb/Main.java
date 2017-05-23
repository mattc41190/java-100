import java.util.*;

public class Main {
    static Hashtable<Integer,String> people = new Hashtable<Integer,String>();
    static { people.put(0, "Admin"); }

   public static void main(String [] args) {
       boolean cont = true;
       Scanner sc = new Scanner(System.in);

       while(cont){
           print("Please choose something:\nlist, add, edit, remove");
           String choice = sc.next();
           if (choice.equalsIgnoreCase("exit")) {
               cont = false;
           } else if (choice.equalsIgnoreCase("list")) {
               listPeople();
           } else if (choice.equalsIgnoreCase("add")) {
               print("Enter Name: ");
               String name = sc.next();
               print("Enter Id: ");
               int id = sc.nextInt();
               addPerson(id, name);
           } else if (choice.equalsIgnoreCase("edit")) {
               print("Enter Id: ");
               int id = sc.nextInt();
               print("Enter Name: ");
               String name = sc.next();
               editPerson(id, name);
           } else if (choice.equalsIgnoreCase("remove")) {
               print("Enter Id: ");
               int id = sc.nextInt();
               deletePerson(id);
           }

       }
   }

   public static void print(String t){
       System.out.println(t);
   }

   public static void listPeople (){
       for(Map.Entry person : people.entrySet()){
        System.out.println(person.getKey()+" "+person.getValue());
       }
   }

   public static void addPerson (int id, String name){
       people.put(id, name);
   }

   public static void editPerson (int id, String name){
       people.put(id, name);
   }

   public static void deletePerson (int id){
       people.remove(id);
   }
}
