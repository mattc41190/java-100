public class Main {
   public static void main(String [] args) {
       // Note that the size of the Array MUST be known from the outset with a Java Array

       double[] someNums = {1.1, 2.3, 4.1, 5.6, 7.6};

       for(double num : someNums) {
           print(String.valueOf(num));
       }

   }

   public static void print(String s) {
       System.out.println(s);
   }
}
