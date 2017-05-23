public class Main {
   public static void main(String [] args) {
       String myStringAry[] = "hello".split("");
       StringBuilder backwardsString = new StringBuilder();

       // Messing with String Arrays
       System.out.println(String.join("", myStringAry));
       System.out.println(String.join("", myStringAry).indexOf('h'));

       // Creating new strings with a builder
       for (int i = myStringAry.length - 1; i >= 0; i--) {
           backwardsString.append(myStringAry[i]);
       }

       System.out.println(backwardsString.toString());
   }
}
