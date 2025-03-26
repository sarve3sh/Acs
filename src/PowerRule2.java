import java.util.Scanner;
public class PowerRule2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String derivitive1 = "f'(x) =";
        String derivitive2 = "f''(x) =";

        System.out.println("Please enter the coefficients of a polynomial's terms seperated by spaces");
        String coefficients = input.nextLine();
        System.out.println("Please enter the degrees of a polynomial's terms seperated by spaces");
        String exponents = input.nextLine();
        input.close();

        String[] coeff = coefficients.split(" ");
        String[] exp = exponents.split(" ");
        double[] coeff2 = new double[coeff.length];
        int[] exp2 = new int[exp.length];

        for (int i = 0; i < coeff.length; i++) {
            double coefficient = Double.parseDouble(coeff[i]) * Double.parseDouble(exp[i]);
            int exponent = Integer.parseInt(exp[i]) - 1;
            if (exponent > 0) {
                derivitive1 += (coefficient > 0 && i > 0 ? " +" : " ") + coefficient + "x^" + exponent;
                exp2[i] = exponent;
                coeff2[i] = coefficient;
            } else if (coefficient != 0) {
                derivitive1 += (coefficient > 0 && i > 0 ? " +" : " ") + coefficient;
            }
        }
        for (int i = 0; i < coeff2.length; i++) {
            double coefficient = coeff2[i] * exp2[i];
            int exponent = exp2[i] - 1;
            if (exponent > 0) {
                derivitive2 += (coefficient > 0 && i > 0 ? " +" : " ") + coefficient + "x^" + exponent;
            } else if (coefficient != 0) {
                derivitive2 += (coefficient > 0 && i > 0 ? " +" : " ") + coefficient;
            }
        }
        System.out.println(derivitive1);
        System.out.println(derivitive2);
    }
}
