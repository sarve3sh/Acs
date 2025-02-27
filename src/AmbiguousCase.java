import java.util.Scanner;

public class AmbiguousCase {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        // asks user for input
        System.out.println("Please input an angle A value:");
        double angleA = keyboard.nextDouble();
        System.out.println("Please input value of side a");
        double a = keyboard.nextDouble();
        System.out.println("Please input value of side b");
        double b = keyboard.nextDouble();
        keyboard.close();
        double h = b * Math.sin(Math.toDegrees(Math.toRadians(angleA)));
        // Determines the type of triangle
        if (angleA < 90) {
            // true if angle is acute
            if (a < h) {
                System.out.println("No triangle");
            } else if (a == h) {
                System.out.println("Right angle triangle");
            } else if (a > b) {
                System.out.println("One triangle");
            } else if (h < a & a < b) {
                System.out.println("This is an ambiguous case");
            }
            // true if angle is obtuse
        } else if (angleA > 90) {
            if (a < b | a == h) {
                System.out.println("No triangle found");
            } else if (a > b) {
                System.out.println("1 triangle found");
            }
        }
    }
}
// rep link "https://github.com/sarve3sh/Acs.git"
