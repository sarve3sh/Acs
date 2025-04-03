import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("                                       xo Welcome to Tic Tac Toe xo");
        System.out.println("Rules:");
        System.out.println("1. The game is played on a 3x3 grid.");
        System.out.println("2. You are X, the other person is O. Players take turns putting their marks in empty squares.");
        System.out.println("3. The first player to get 3 of their marks (x/o) in a row wins the game (the marks can be up, across, or even diagonal).");
        System.out.println("4. If the squares are filled and no player has a complete row of their mark, then the game ends in a tie.");
        System.out.println("                ==================================================================");

        char[][] grid = new char[3][3];
        initializeBoard(grid);
        printBoard(grid);

        Scanner keyboard = new Scanner(System.in);
        char currentplayer = 'X';

        while (true) {
            System.out.println(
                    "Please enter your move (in the order of row and column) separated by a space (each player gets their turn alternatively starting with X)");
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();

            // Check if move is within valid range
            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                // Check if the cell is empty
                if (grid[row][col] == ' ') {
                    grid[row][col] = currentplayer;
                    printBoard(grid); // Show updated board

                    if (checkWinner(grid, currentplayer)) {
                        System.out.println("Player " + currentplayer + " wins!");
                        break;
                    }

                    if (isBoardfull(grid)) {
                        System.out.println("It's a tie");
                        break;
                    }

                    // Switch player
                    currentplayer = (currentplayer == 'X') ? 'O' : 'X';
                } else {
                    System.out.println(" Move is already occupied. Please try again.");
                }
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }

        keyboard.close(); // Close scanner
    }

    public static void initializeBoard(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public static void printBoard(char[][] grid) {
        System.out.println("\t\t" + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2]); // \t adds space
        System.out.println("\t\t" + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2]); // shows starting grid
        System.out.println("\t\t" + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2]);
    }

    public static boolean checkWinner(char[][] grid, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == currentPlayer && grid[i][1] == currentPlayer && grid[i][2] == currentPlayer) ||
                (grid[0][i] == currentPlayer && grid[1][i] == currentPlayer && grid[2][i] == currentPlayer)) {
                return true;
            }
        }
        return (grid[0][0] == currentPlayer && grid[1][1] == currentPlayer && grid[2][2] == currentPlayer) ||
               (grid[0][2] == currentPlayer && grid[1][1] == currentPlayer && grid[2][0] == currentPlayer);
    }

    public static boolean isBoardfull(char[][] grid) {
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
