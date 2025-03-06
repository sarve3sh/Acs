import java.util.Scanner;
import java.util.StringTokenizer;

public class Polynomialevaluvator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String function = "f(x) = ";
        double sum = 0.0;
        
        System.out.println("Please enter coefficients:");
        String coefficients = keyboard.nextLine();
        System.out.println("Please enter exponents:");
        String exponents = keyboard.nextLine();
        System.out.println("Please enter an x value:");
        double x = keyboard.nextDouble();
        keyboard.close();

        StringTokenizer coeffSt = new StringTokenizer(coefficients);
        StringTokenizer expSt = new StringTokenizer(exponents);

        while (coeffSt.hasMoreTokens()) {
            double coefficient = Double.parseDouble(coeffSt.nextToken());
            int exponent = Integer.parseInt(expSt.nextToken());

            function += coefficient + "x^" + exponent + " ";
            sum += coefficient * Math.pow(x, exponent);
        }

        System.out.println("Your polynomial function is: " + function);
        System.out.println("Your polynomial at x = " + x + " is: " + "f(" + x +") = " + sum);
    }
}