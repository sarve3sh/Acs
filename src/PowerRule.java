import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter coefficients (seperated by space):");
        String [] coefficients = keyboard.nextLine().split(" ");
        System.out.println("Please enter the degrees of the polynomial (seperated by space):");
        String [] degrees = keyboard.nextLine().split(" ");
       keyboard.close();
       //solving for derivative #1
        for(int i = 0; i<coefficients.length; i++)
       // assuming the coefficients and degrees are the same length
        System.out.println("The first derivative is:"+answer1);
        System.out.println("The second derivative is:"+answer2);
    }
}
