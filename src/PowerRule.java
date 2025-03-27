import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // input kaekum
        System.out.println("Please enter coefficients (seperated by space):");
        String[] coefficients = keyboard.nextLine().split(" ");
        System.out.println("Please enter the degrees of the polynomial (seperated by space):");
        String[] degrees = keyboard.nextLine().split(" ");
        keyboard.close();
        // idhhu vandhu string ah double ah convert panikum
        int n = coefficients.length;
        double[] newCoefficients = new double[n];
        double[] newDegrees = new double[n];
        double[] newDegrees2 = new double[n];
        double[] newCoefficients2 = new double[n];
        // idhu dha power rule and it applies for all the terms in the polynomial

        for (int i = 0; i < n; i++) {
            newCoefficients[i] = Double.parseDouble(coefficients[i]) * Double.parseDouble(degrees[i]);
            newDegrees[i] = Double.parseDouble(degrees[i]) - 1;

            newCoefficients2[i] = newCoefficients[i] * newDegrees[i];
            newDegrees2[i] = newDegrees[i] - 1;
        } // idhu dha output ah print panum from last step

        String derivative1 = "f(x) =";
        for (int i = 0; i < n; i++) {
            if (newDegrees[i] > 0) {
                derivative1 += (newCoefficients[i] > 0 && i > 0 ? " +" : " ") + newCoefficients[i] + "x^"
                        + newDegrees[i];
            } else if (newCoefficients[i] != 0) {
                derivative1 += (newCoefficients[i] > 0 && i > 0 ? " +" : " ") + newCoefficients[i];
            }
        } // idhu dha second derivative ku

        String derivative2 = "f(x) =";
        for (int i = 0; i < n; i++) {
            if (newDegrees2[i] > 0) {
                derivative2 += (newCoefficients2[i] > 0 && i > 0 ? " +" : " ") + newCoefficients2[i] + "x^"
                        + newDegrees2[i];
            } else if (newCoefficients2[i] != 0) {
                derivative2 += (newCoefficients2[i] > 0 && i > 0 ? " +" : " ") + newCoefficients2[i];
            }
        } // ending answereh kudukum
        System.out.println("Derivativee 1 =" + derivative1);
        System.out.println("Derivative 2 =" + derivative2);
    }
}
