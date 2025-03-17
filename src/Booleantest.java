import java.util.Scanner;

public class Booleantest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter boolean value for A: ");
        boolean a = keyboard.nextBoolean();
        System.out.print("Enter boolean value for B: ");
        boolean b = keyboard.nextBoolean();
        System.out.print("Enter boolean value for C: ");
        boolean c = keyboard.nextBoolean();
        System.out.print("Enter boolean value for D: ");
        boolean d = keyboard.nextBoolean();

        keyboard.close();
        boolean result = a && !d || !b && !c && d || !a && !b && !c || a && c && !d;
        System.out.println("Value a: " + result);

    }
}
