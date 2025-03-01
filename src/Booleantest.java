import java.util.Scanner;

public class Booleantest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter boolean value for A: ");
        boolean A = keyboard.nextBoolean();
        System.out.print("Enter boolean value for B: ");
        boolean B = keyboard.nextBoolean();
        System.out.print("Enter boolean value for C: ");
        boolean C = keyboard.nextBoolean();
        System.out.print("Enter boolean value for D: ");
        boolean D = keyboard.nextBoolean();

        keyboard.close();

        // Boolean logic implementation
        boolean a = (!B && D) || (!B && !C && D) || (!A && B && C) || (A && C && D);

        // Print output directly
        System.out.println("Output a: " + a);
    }
}
