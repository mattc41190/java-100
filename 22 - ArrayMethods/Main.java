import java.util.Arrays;

public class Main {
   public static void main(String [] args) {
       // Note that the size of the Array MUST be known from the outset with a Java Array

       double[] someNums = {1.1, 2.3, 4.1, 5.6, 7.6};
       double[] someOtherNums = {1.1, 2.3, 4.1, 5.6, 7.6};
       double[] someDifferentNums = {0.1, 7.3, 4.1, 3.6, 7.6};
       Arrays.sort(someDifferentNums);

       System.out.println(Arrays.equals(someNums,someOtherNums));
       System.out.println(Arrays.equals(someNums,someDifferentNums));
       System.out.println(Arrays.toString(someDifferentNums));
   }
}
