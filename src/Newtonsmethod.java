import java.util.Scanner;

public class Newtonsmethod {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

      
        double rootTolerance = 0.0000001;
        while (true) {
            System.out.println("Please enter an intitial root guess");
            double x = keyboard.nextDouble();
            double r = x;
            boolean rootFound = false;

            System.out.println("Approximation sequence:");
            System.out.println(+x);

            int iteration = 1;
            while (!rootFound) {
                // calculation
                r = r - (6 * r * r * r * r - 13 * r * r * r - 18 * r * r + 7 * r + 6)
                        / (24 * r * r * r - 39 * r * r - 36 * r + 7);

                System.out.println(" " + iteration + ": " + r);
                iteration++;

                if (Math.abs(r - (-1.0)) < rootTolerance) {
                    rootFound = true;
                    System.out.println("Exact root found: -1.0");
                } else if (Math.abs(r - (-0.5)) < rootTolerance) {
                    rootFound = true;
                    System.out.println("Exact root found: -0.5");
                } else if (Math.abs(r - (2.0 / 3.0)) < rootTolerance) {
                    rootFound = true;
                    System.out.println("Exact root found: 2/3");
                } else if (Math.abs(r - 3.0) < rootTolerance) {
                    rootFound = true;
                    System.out.println("Exact root found: 3.0");
                }
            }
            System.out.println("The root value is:" + r);
            if (r==-1|r==3|r==-0.5|r==(2/3)) {
                break;
            }System.out.println("do you wish to try again? [y/n]");
             if (keyboard.next().charAt(0) == 'n') {
                keyboard.close();
                break;
            }
          }
    }
}