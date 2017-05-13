import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Height: ");
        Double height =  input.nextDouble();
        System.out.println("Width: ");
        Double width =  input.nextDouble();
        Double result = calculate(height, width);
        System.out.println("The area of equal quadrilateral " + result);
    }

    public static double calculate(double h, double w) {
        if (h > 0.0 && w > 0.0) {
            return h * w;
        } else {
            System.out.println("ERROR -> Hieght and width must be grater than 0");
            return 0.0;
        }
    }
}
