import java.util.Scanner;

public class  test{

    public static void main(String[] args) {
        // Display the game instructions
        System.out.println("                                       xo Welcome to Tic Tac Toe xo");
        System.out.println("Rules:");
        System.out.println("1. The game is played on a 3x3 grid.");
        System.out.println("2. You are X, the other person is O. Players take turns putting their marks in empty squares.");
        System.out.println("3. The first player to get 3 of their marks (x/o) in a row wins the game.");
        System.out.println("4. If the squares are filled and no player has a complete row of their mark then the game ends in a tie.");
        System.out.println("                ==================================================================");

        // Create the grid
        char[][] grid = new char[3][3];
        initializeBoard(grid);
        printBoard(grid);

        // Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Loop to alternate turns
        char currentPlayer = 'X';  // Player X starts
        while (true) {
            // Ask for move
            System.out.println("Player " + currentPlayer + ", please enter your move (row and column): ");
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();

            // Validate the move
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == ' ') {
                // Update the grid with the player's move
                grid[row][col] = currentPlayer;
                printBoard(grid);
                
                // Check for a winner
                if (checkWinner(grid, currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                
                // Check for a tie (board is full)
                if (isBoardFull(grid)) {
                    System.out.println("It's a tie!");
                    break;
                }
                
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
    }

    // Initialize the board with empty spaces
    public static void initializeBoard(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    // Print the current state of the board
    public static void printBoard(char[][] grid) {
        System.out.println("\t\t" + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2]);
        System.out.println("\t\t" + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2]);
        System.out.println("\t\t" + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2]);
    }

    // Check if a player has won
    public static boolean checkWinner(char[][] grid, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) {
                return true;
            }
            // Check columns
            if (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) {
                return true;
            }
        }
        // Check diagonals
        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
            return true;
        }
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
            return true;
        }
        return false;
    }

    // Check if the board is full
    public static boolean isBoardFull(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
