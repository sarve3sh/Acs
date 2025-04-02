import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("                                       xo Welcome to Tic Tac Toe xo");
        System.out.println("Rules:");
        System.out.println("1. The game is played on a 3x3 grid.");
        System.out.println(
                "2. You are X, the other person is O. Players take turns putting their marks in empty squares.");
        System.out.println(
                "3. The first player to get 3 of their marks (x/o)in a row wins the game(the marks can be up or across or even diagonal)");
        System.out.println(
                "4. If the squares are filled and no player has a complete row of their mark then the game ends in a tie.");
        System.out.println("                ==================================================================");
        char[][] grid = new char[3][3];
        System.out.println("\t\t" + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + ""); // \t adds space
        System.out.println("\t\t" + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + "");
        System.out.println("\t\t" + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + "");
        System.out.println(
                "Please enter your move (in the order of row and colomn)seperated by a space (each player gets their turn alternatively starting with X)");
        Scanner keyboard = new Scanner(System.in);
        int row = keyboard.nextInt();
        int col = keyboard.nextInt();
        if (row >= 0 && row <3 && col >= 0 && col < 3) {
            grid[row][col]='X';
        }else{
                System.out.println("Invalid move");
        }
            System.out.println("\t\t" + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + "");
            System.out.println("\t\t" + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + "");
            System.out.println("\t\t" + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + ""); 

            System.out.print("Please enter your move (in the order of row and column) separated by a space: ");
            row = keyboard.nextInt();
            col = keyboard.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                if (grid[row][col] == ' ') { 
                    grid[row][col] = 'O'; 
                    System.out.println("Invalid move");
                     System.out.println("\t\t" + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + "");
                     System.out.println("\t\t" + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + "");
                     System.out.println("\t\t" + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + ""); 
                } else {
                    System.out.println("Invalid move. The cell is already occupied.");
                }

            } else {
                System.out.println("Invalid move. Please enter a valid row and column.");
            }
    }}



