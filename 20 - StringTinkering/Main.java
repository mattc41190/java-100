public class Main {
   public static void main(String [] args) {
       String initialString = "      My name is Dirk Gently     ";
       print(initialString);

       print(initialString.toUpperCase());
       print(initialString.toLowerCase());
       print(initialString.trim());

   }

   public static void print(String s) {
       System.out.println(s);
   }
}
