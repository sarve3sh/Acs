import java.util.Scanner;

public class Newtonslaw {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an intitial root guess");
        double x = keyboard.nextDouble();
        // calculation
        double r = x - (6 * x * x * x * x - 13 * x * x * x - 18 * x * x + 7 * x + 6)
                / (24 * x * x * x - 39 * x * x - 36 * x + 7);
        keyboard.close();
        System.out.println("The root value is:"+r);
        System.out.println("do you wish to try again? [y/n]");
    }
}