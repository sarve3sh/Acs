import java.util.Scanner;
import java.util.StringTokenizer;

public class Polynomialevaluvator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        //prompting for input
        System.out.println("Please enter a polynomial in the form f(x) = 3x^3+4y^2-2x+1 ");
        String polynomial = input.nextLine().substring(5);
        System.out.println("Please enter an x value ");
        double x = input.nextDouble();
        input.close();
        //solving for the sum
        StringTokenizer st = new StringTokenizer(polynomial, " ");
        while (st.hasMoreTokens()) {
            String term = st.nextToken();
            if (term.contains("x")) {
                double coeff = Double.parseDouble(term.substring(0, term.indexOf('x')));
                double exp = Double.parseDouble(term.substring(term.indexOf('^') + 1));
                sum += coeff * Math.pow(x, exp);
            } else {
                sum += Double.parseDouble(term);
            }
        }
        System.out.println("for the given f(" + x + ")= " + sum);
    }
}