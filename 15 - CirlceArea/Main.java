import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Provide The Diameter Of The Circle: ");
        Double diameter =  input.nextDouble();
        Double result = calculate(diameter);
        System.out.println("The area of the circle is " + result);
    }

    public static double calculate(double diameter) {
        if (diameter > 0.0) {
            double radius = diameter / 2.0;
            return Math.PI * Math.pow(radius, 2.0); // Notice the use of statice math methods
        } else {
            System.out.println("ERROR -> Diamter must be greater than 0");
            return 0.0;
        }
    }
}
