import java.util.Scanner;

public class TicTacToe {
    Scanner keyboard = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("                                       ❌⭕Welcome to Tic Tac Toe❌⭕");
        System.out.println("Rules:");
        System.out.println("1. The game is played on a 3x3 grid.");
        System.out.println("2. You are X, the other person is O. Players take turns putting their marks in empty squares.");
        System.out.println("3. The first player to get 3 of their marks (x/o)in a row wins the game(the marks can be up or across or even diagonal)");
        System.out.println("4. If the squares are filled and no player has a complete row of their mark then the game ends in a tie.");
        System.out.println("                ==================================================================");
        System.out.println("Please enter your move (in the order of row and colomn)seperated by a space (each player gets their turn alternatively starting with X)");
        Scanner keyboard;
        double x = keyboard.nextDouble();
        // I am gonna use methods for checking the winner and printing the board and
        // also asking for input
        int[][] grid = new int[3][3];
        System.out.println("|" + grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2] + "|");
        System.out.println("|" + grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2] + "|");
        System.out.println("|" + grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2] + "|");
        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[row].length; col++) {

                grid[row][col] = 0;
                System.out.println(
                        "Please enter your move player 2 (in the order of row and colomn)seperated by a space ");
            }

        }

    }
}
