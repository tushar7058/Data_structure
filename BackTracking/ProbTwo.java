// N queens Problem in backtracking using java
import java.util.ArrayList;
import java.util.List;

public class ProbTwo {
    // Main helper method
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '_'; // Backtrack
            }
        }
    }

    // Method to solve N-Queens problem
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '_'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '_';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    // Method to save the board configuration
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[i].length; j++) {
                row += board[i][j];
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    // Method to check if placing a queen is safe
    public boolean isSafe(int row, int col, char[][] board) {
        // Check upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check left row
        for (int j = col; j >= 0; j--) {
            if (board[row][j] == 'Q') return false;
        }

        // Check lower diagonal
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Main method to test the code
    public static void main(String[] args) {
        ProbTwo solution = new ProbTwo();
        List<List<String>> result = solution.solveNQueens(4);

        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}