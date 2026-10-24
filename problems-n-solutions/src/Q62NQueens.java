public class Q62NQueens {

    static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean ele: row){
                if(ele){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        for(int i = 1; i <= Math.min(row,col); i++){
            if(board[row-1][col-1]){
                return false;
            }
        }

        for(int i = 1; i <= Math.min(row,board.length - col - 1); i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = true;
                count+=queens(board, row + 1);
                board[row][i] = false;
            }
        }
        return count;
    }

    public static void main(String[] args){
        boolean[][] board = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
        };
        System.out.print(queens(board, 0));
    }
}
