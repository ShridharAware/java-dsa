
public class Q63NKnights {

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if (ele) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length
                && col >= 0 && col < board[row].length;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)
                && board[row - 2][col - 1]) {
            return false;
        }

        if (isValid(board, row - 1, col - 2)
                && board[row - 1][col - 2]) {
            return false;
        }

        if (isValid(board, row - 2, col + 1)
                && board[row - 2][col + 1]) {
            return false;
        }

        if (isValid(board, row - 1, col + 2)
                && board[row - 1][col + 2]) {
            return false;
        }

        return true;
    }

    static void knights(boolean[][] board, int row, int col, int knights) {

        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        if (col == board[row].length) {
            knights(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        // Skip the current cell
        knights(board, row, col + 1, knights);
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        knights(board, 0, 0, 4);
    }
}
